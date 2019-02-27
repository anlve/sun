package com.anlve.sun.dao;

import java.util.List;

import com.anlve.sun.entity.Hotspot;

public interface HotspotMapper {
	
	List<Hotspot> selectAll();
	
    int deleteByPrimaryKey(String id);

    int insert(Hotspot record);

    int insertSelective(Hotspot record);

    Hotspot selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hotspot record);

    int updateByPrimaryKey(Hotspot record);
}