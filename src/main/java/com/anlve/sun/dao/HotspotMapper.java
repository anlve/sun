package com.anlve.sun.dao;

import com.anlve.sun.model.Hotspot;

public interface HotspotMapper {
    int deleteByPrimaryKey(String id);

    int insert(Hotspot record);

    int insertSelective(Hotspot record);

    Hotspot selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hotspot record);

    int updateByPrimaryKey(Hotspot record);
}