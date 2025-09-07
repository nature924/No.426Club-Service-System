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


import com.dao.ZhuangjizixunDao;
import com.entity.ZhuangjizixunEntity;
import com.service.ZhuangjizixunService;
import com.entity.vo.ZhuangjizixunVO;
import com.entity.view.ZhuangjizixunView;

@Service("zhuangjizixunService")
public class ZhuangjizixunServiceImpl extends ServiceImpl<ZhuangjizixunDao, ZhuangjizixunEntity> implements ZhuangjizixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangjizixunEntity> page = this.selectPage(
                new Query<ZhuangjizixunEntity>(params).getPage(),
                new EntityWrapper<ZhuangjizixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangjizixunEntity> wrapper) {
		  Page<ZhuangjizixunView> page =new Query<ZhuangjizixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangjizixunVO> selectListVO(Wrapper<ZhuangjizixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangjizixunVO selectVO(Wrapper<ZhuangjizixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangjizixunView> selectListView(Wrapper<ZhuangjizixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangjizixunView selectView(Wrapper<ZhuangjizixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
