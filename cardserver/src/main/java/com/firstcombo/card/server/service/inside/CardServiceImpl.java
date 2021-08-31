package com.firstcombo.card.server.service.inside;

import com.firstcombo.card.client.domain.BaseReqDTO;
import com.firstcombo.card.client.domain.request.InsertCardReqDTO;
import com.firstcombo.card.server.interfaces.CardService;
import com.firstcombo.card.server.repo.dbdo.CardDO;
import com.firstcombo.card.server.repo.mapper.CardDOMapper;
import com.firstcombo.card.client.utils.ComboPojoUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CardServiceImpl
 * @Description
 * @Author ftx
 * @Date 2021/8/27 17:45
 * @Version 1.0
 **/

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDOMapper cardDOMapper;
    @Override
    public boolean newCard(InsertCardReqDTO reqDTO) {
        CardDO cardDO = new CardDO();
        ComboPojoUtils.buildInsert(reqDTO);
        BeanUtils.copyProperties(reqDTO,cardDO);
        return cardDOMapper.insertSelective(cardDO) > 0;
    }

    @Override
    public boolean updateCard(InsertCardReqDTO reqDTO) {
        CardDO cardDO = new CardDO();
        ComboPojoUtils.buildUpdate(reqDTO);
        BeanUtils.copyProperties(reqDTO,cardDO);
        return cardDOMapper.updateByPrimaryKeySelective(cardDO) > 0;
    }

    @Override
    public boolean deleteCard(InsertCardReqDTO reqDTO) {
        return cardDOMapper.deleteByPrimaryKey(reqDTO.getId()) > 0;
    }

    @Override
    public CardDO selectCard(BaseReqDTO reqDTO) {
        return cardDOMapper.selectByPrimaryKey(reqDTO.getId());
    }
}
