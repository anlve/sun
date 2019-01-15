package com.anlve.sun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anlve.sun.model.Hotspot;
import com.anlve.sun.service.HotspotService;

@RestController /* @Controller + @ResponseBody*/
@RequestMapping("/hotspot")
public class HotspotController {
	@Autowired
    private HotspotService hotspotService;

	@RequestMapping(value = "/all/{pageNum}/{pageSize}", method = RequestMethod.POST)
    public List<Hotspot> all(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return hotspotService.selectAll(pageNum,pageSize);
    }
	
    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public int del(String id){
        return hotspotService.deleteByPrimaryKey(id);
    }
    
    //	新增的值如果为空，则表数据为空
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int add(Hotspot hotspot){
        return hotspotService.insert(hotspot);
    }
    
    @RequestMapping(value = "/addSelective", method = RequestMethod.POST)
    public int addSelective(Hotspot hotspot){
        return hotspotService.insertSelective(hotspot);
    }
    
    @RequestMapping(value = "/getById", method = RequestMethod.POST)
    public Hotspot getById(String id){
        return hotspotService.selectByPrimaryKey(id);
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(Hotspot hotspot){
        return hotspotService.updateByPrimaryKeySelective(hotspot);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public int updateById(Hotspot hotspot){
        return hotspotService.updateByPrimaryKey(hotspot);
    }
}
