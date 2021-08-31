package com.firstcombo.card.client.utils;

import cn.hutool.core.lang.ObjectId;
import com.firstcombo.card.client.domain.BaseReqDTO;

import java.util.Date;
import java.util.UUID;

/**
 * @ClassName ComboPojoUtils
 * @Description
 * @Author ftx
 * @Date 2021/8/30 10:05
 * @Version 1.0
 **/
public class ComboPojoUtils {
    public static void buildInsert(BaseReqDTO reqDTO){
        reqDTO.setId(ObjectId.next());
        reqDTO.setCreateBy("root");
        reqDTO.setCreateDate(new Date());
        reqDTO.setModifyBy("root");
        reqDTO.setModifyDate(new Date());
        reqDTO.setIsDel(false);
    }
    public static void buildUpdate(BaseReqDTO reqDTO){
        reqDTO.setModifyBy("root");
        reqDTO.setModifyDate(new Date());
    }
}
