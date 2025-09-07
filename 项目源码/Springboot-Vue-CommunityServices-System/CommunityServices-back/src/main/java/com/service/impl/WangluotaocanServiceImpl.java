package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WangluotaocanDao;
import com.entity.WangluotaocanEntity;
import com.service.WangluotaocanService;
import com.entity.vo.WangluotaocanVO;
import com.entity.view.WangluotaocanView;

@Service("wangluotaocanService")
public class WangluotaocanServiceImpl extends ServiceImpl<WangluotaocanDao, WangluotaocanEntity> implements WangluotaocanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangluotaocanEntity> page = this.selectPage(
                new Query<WangluotaocanEntity>(params).getPage(),
                new EntityWrapper<WangluotaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangluotaocanEntity> wrapper) {
		  Page<WangluotaocanView> page =new Query<WangluotaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangluotaocanVO> selectListVO(Wrapper<WangluotaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangluotaocanVO selectVO(Wrapper<WangluotaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangluotaocanView> selectListView(Wrapper<WangluotaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangluotaocanView selectView(Wrapper<WangluotaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
