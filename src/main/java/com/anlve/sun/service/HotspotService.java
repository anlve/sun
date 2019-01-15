package com.anlve.sun.service;

import com.anlve.sun.model.Hotspot;

public interface HotspotService {

	int deleteByPrimaryKey(String id);

    int insert(Hotspot record);

    int insertSelective(Hotspot record);

    Hotspot selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hotspot record);

    int updateByPrimaryKey(Hotspot record);
}
