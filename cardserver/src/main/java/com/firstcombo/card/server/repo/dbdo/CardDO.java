package com.firstcombo.card.server.repo.dbdo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * card
 * @author 
 */
@Data
public class CardDO implements Serializable {
    private String id;

    private String createBy;

    private Date createDate;

    private String modifyBy;

    private Date modifyDate;

    /**
     * 逻辑删除
     */
    private Boolean isDel;

    private String name;

    private String url;

    private String data;

    private static final long serialVersionUID = 1L;
}