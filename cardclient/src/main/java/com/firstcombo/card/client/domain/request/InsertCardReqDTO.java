package com.firstcombo.card.client.domain.request;

import com.firstcombo.card.client.domain.BaseReqDTO;
import lombok.Data;

/**
 * @ClassName CardReqDTO
 * @Description
 * @Author ftx
 * @Date 2021/8/27 17:47
 * @Version 1.0
 **/
@Data
public class InsertCardReqDTO extends BaseReqDTO {

    private String name;

    private String url;

    private String data;
}
