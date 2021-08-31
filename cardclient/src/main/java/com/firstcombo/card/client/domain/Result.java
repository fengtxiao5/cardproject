package com.firstcombo.card.client.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description
 * @Author ftx
 * @Date 2021/8/24 16:29
 * @Version 1.0
 **/
@Data
public class Result<T> implements Serializable {
    private T module;
    private boolean success;
    private String errMsg;
    private String errCode;

    public Result(){
        this.success = true;
    }
}
