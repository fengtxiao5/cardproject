package com.firstcombo.card.server.interfaces;

import com.firstcombo.card.client.domain.BaseReqDTO;
import com.firstcombo.card.client.domain.request.InsertCardReqDTO;
import com.firstcombo.card.server.repo.dbdo.CardDO;

public interface CardService {

    /**
     * 新建卡片
     * @param reqDTO
     * @return
     */
    boolean newCard(InsertCardReqDTO reqDTO);

    /**
     * 修改卡片
     * @param reqDTO
     * @return
     */
    boolean updateCard(InsertCardReqDTO reqDTO);

    /**
     * 删除卡片
     * @param reqDTO
     * @return
     */
    boolean deleteCard(InsertCardReqDTO reqDTO);

    /**
     * 根据id查询卡片
     * @param reqDTO
     * @return
     */
    CardDO selectCard(BaseReqDTO reqDTO);
}
