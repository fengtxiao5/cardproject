package com.firstcombo.card.server.repo.mapper;

import com.firstcombo.card.server.repo.dbdo.CardDO;

public interface CardDOMapper {
    int deleteByPrimaryKey(String id);

    int insert(CardDO record);

    int insertSelective(CardDO record);

    CardDO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CardDO record);

    int updateByPrimaryKey(CardDO record);
}