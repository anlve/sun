package com.anlve.sun.service;

import java.util.List;

import com.anlve.sun.entity.Hotspot;

public interface HotspotService {
	
	List<Hotspot> selectAll(int pageNum, int pageSize);

	int deleteByPrimaryKey(String id);

    int insert(Hotspot record);

    int insertSelective(Hotspot record);

    Hotspot selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hotspot record);

    int updateByPrimaryKey(Hotspot record);
}
