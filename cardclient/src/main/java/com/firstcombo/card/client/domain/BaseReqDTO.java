package com.firstcombo.card.client.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseReqDTO
 * @Description
 * @Author ftx
 * @Date 2021/8/24 15:17
 * @Version 1.0
 **/
@Data
public class BaseReqDTO implements Serializable {
    private String id;
    private String createBy;
    private Date createDate;
    private String modifyBy;
    private Date modifyDate;
    private Boolean isDel;
}
