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


import com.dao.DiscusswangluotaocanDao;
import com.entity.DiscusswangluotaocanEntity;
import com.service.DiscusswangluotaocanService;
import com.entity.vo.DiscusswangluotaocanVO;
import com.entity.view.DiscusswangluotaocanView;

@Service("discusswangluotaocanService")
public class DiscusswangluotaocanServiceImpl extends ServiceImpl<DiscusswangluotaocanDao, DiscusswangluotaocanEntity> implements DiscusswangluotaocanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswangluotaocanEntity> page = this.selectPage(
                new Query<DiscusswangluotaocanEntity>(params).getPage(),
                new EntityWrapper<DiscusswangluotaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswangluotaocanEntity> wrapper) {
		  Page<DiscusswangluotaocanView> page =new Query<DiscusswangluotaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswangluotaocanVO> selectListVO(Wrapper<DiscusswangluotaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswangluotaocanVO selectVO(Wrapper<DiscusswangluotaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswangluotaocanView> selectListView(Wrapper<DiscusswangluotaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswangluotaocanView selectView(Wrapper<DiscusswangluotaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
