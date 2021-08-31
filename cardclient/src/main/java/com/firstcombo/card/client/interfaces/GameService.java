package com.firstcombo.card.client.interfaces;


import com.firstcombo.card.client.domain.Result;
import com.firstcombo.card.client.domain.request.InsertCardReqDTO;

public interface GameService {
    /**
     * 新建卡片
     * @param reqDTO
     * @return
     */
    Result<Boolean> insertCard(InsertCardReqDTO reqDTO);
}
