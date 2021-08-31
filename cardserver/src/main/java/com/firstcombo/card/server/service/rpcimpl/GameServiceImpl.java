package com.firstcombo.card.server.service.rpcimpl;

import com.firstcombo.card.client.domain.Result;
import com.firstcombo.card.client.domain.request.InsertCardReqDTO;
import com.firstcombo.card.client.interfaces.GameService;
import com.firstcombo.card.server.interfaces.CardService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName GameServiceImpl
 * @Description
 * @Author ftx
 * @Date 2021/8/30 13:50
 * @Version 1.0
 **/
public class GameServiceImpl implements GameService {
    @Autowired
    private CardService cardService;

    @Override
    public Result<Boolean> insertCard(InsertCardReqDTO reqDTO) {
        boolean b = cardService.newCard(reqDTO);
        Result<Boolean> result = new Result<>();
        result.setModule(b);
        return result;
    }
}
