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


import com.dao.DiscussruanjiandaquanDao;
import com.entity.DiscussruanjiandaquanEntity;
import com.service.DiscussruanjiandaquanService;
import com.entity.vo.DiscussruanjiandaquanVO;
import com.entity.view.DiscussruanjiandaquanView;

@Service("discussruanjiandaquanService")
public class DiscussruanjiandaquanServiceImpl extends ServiceImpl<DiscussruanjiandaquanDao, DiscussruanjiandaquanEntity> implements DiscussruanjiandaquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussruanjiandaquanEntity> page = this.selectPage(
                new Query<DiscussruanjiandaquanEntity>(params).getPage(),
                new EntityWrapper<DiscussruanjiandaquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussruanjiandaquanEntity> wrapper) {
		  Page<DiscussruanjiandaquanView> page =new Query<DiscussruanjiandaquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussruanjiandaquanVO> selectListVO(Wrapper<DiscussruanjiandaquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussruanjiandaquanVO selectVO(Wrapper<DiscussruanjiandaquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussruanjiandaquanView> selectListView(Wrapper<DiscussruanjiandaquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussruanjiandaquanView selectView(Wrapper<DiscussruanjiandaquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
