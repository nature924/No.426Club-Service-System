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


import com.dao.ShetuanrenyuanDao;
import com.entity.ShetuanrenyuanEntity;
import com.service.ShetuanrenyuanService;
import com.entity.vo.ShetuanrenyuanVO;
import com.entity.view.ShetuanrenyuanView;

@Service("shetuanrenyuanService")
public class ShetuanrenyuanServiceImpl extends ServiceImpl<ShetuanrenyuanDao, ShetuanrenyuanEntity> implements ShetuanrenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanrenyuanEntity> page = this.selectPage(
                new Query<ShetuanrenyuanEntity>(params).getPage(),
                new EntityWrapper<ShetuanrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanrenyuanEntity> wrapper) {
		  Page<ShetuanrenyuanView> page =new Query<ShetuanrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanrenyuanVO> selectListVO(Wrapper<ShetuanrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanrenyuanVO selectVO(Wrapper<ShetuanrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanrenyuanView> selectListView(Wrapper<ShetuanrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanrenyuanView selectView(Wrapper<ShetuanrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
