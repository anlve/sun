package com.anlve.sun.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anlve.sun.dao.HotspotMapper;
import com.anlve.sun.model.Hotspot;
import com.anlve.sun.service.HotspotService;
import com.anlve.sun.util.UUIDUtils;

@Service
public class HotspotServiceImpl implements HotspotService {

	@Autowired
	private HotspotMapper hotspotMapper;

	@Override
	public int deleteByPrimaryKey(String id) {
		if (StringUtils.isNotBlank(id)) {
			int rtncode = hotspotMapper.deleteByPrimaryKey(id);
			return rtncode;
		}else {
			return 0;
		}
	}

	@Override
	public int insert(Hotspot record) {
		record.setId(UUIDUtils.generateUUID());
		int rtncode = hotspotMapper.insert(record);
		if(0 != rtncode) {
			return rtncode;
		}else {
			return 0;
		}
	}

	@Override
	public int insertSelective(Hotspot record) {
		record.setId(UUIDUtils.generateUUID());
		int rtncode = hotspotMapper.insertSelective(record);
		if(0 != rtncode) {
			return rtncode;
		}else {
			return 0;
		}
	}

	@Override
	public Hotspot selectByPrimaryKey(String id) {
		if(StringUtils.isNotBlank(id)) {
			Hotspot hotspot = hotspotMapper.selectByPrimaryKey(id);
			return hotspot;
		}else {
			// id is null
			return null;
		}
	}

	@Override
	public int updateByPrimaryKeySelective(Hotspot record) {
		if(StringUtils.isNotBlank(record.getId())) {
			int rtncode = hotspotMapper.updateByPrimaryKeySelective(record);
			return rtncode;
		}else {
			// id is null
			return 0;
		}
	}

	@Override
	public int updateByPrimaryKey(Hotspot record) {
		if(StringUtils.isNotBlank(record.getId())) {
			int rtncode = hotspotMapper.updateByPrimaryKey(record);
			return rtncode;
		}else {
			// id is null
			return 0;
		}
	}

}
