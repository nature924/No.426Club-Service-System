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


import com.dao.RuanjiandaquanDao;
import com.entity.RuanjiandaquanEntity;
import com.service.RuanjiandaquanService;
import com.entity.vo.RuanjiandaquanVO;
import com.entity.view.RuanjiandaquanView;

@Service("ruanjiandaquanService")
public class RuanjiandaquanServiceImpl extends ServiceImpl<RuanjiandaquanDao, RuanjiandaquanEntity> implements RuanjiandaquanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuanjiandaquanEntity> page = this.selectPage(
                new Query<RuanjiandaquanEntity>(params).getPage(),
                new EntityWrapper<RuanjiandaquanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuanjiandaquanEntity> wrapper) {
		  Page<RuanjiandaquanView> page =new Query<RuanjiandaquanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuanjiandaquanVO> selectListVO(Wrapper<RuanjiandaquanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuanjiandaquanVO selectVO(Wrapper<RuanjiandaquanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuanjiandaquanView> selectListView(Wrapper<RuanjiandaquanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuanjiandaquanView selectView(Wrapper<RuanjiandaquanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
