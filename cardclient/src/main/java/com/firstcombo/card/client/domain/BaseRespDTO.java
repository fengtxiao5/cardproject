package com.firstcombo.card.client.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName BaseRespDTO
 * @Description
 * @Author ftx
 * @Date 2021/8/24 15:18
 * @Version 1.0
 **/
@Data
public class BaseRespDTO implements Serializable {
    private String id;
    private String createBy;
    private Date createDate;
    private String modifyBy;
    private Date modifyDate;
    private Boolean isDel;
}
