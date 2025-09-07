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


import com.dao.WangluobaoxiuDao;
import com.entity.WangluobaoxiuEntity;
import com.service.WangluobaoxiuService;
import com.entity.vo.WangluobaoxiuVO;
import com.entity.view.WangluobaoxiuView;

@Service("wangluobaoxiuService")
public class WangluobaoxiuServiceImpl extends ServiceImpl<WangluobaoxiuDao, WangluobaoxiuEntity> implements WangluobaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangluobaoxiuEntity> page = this.selectPage(
                new Query<WangluobaoxiuEntity>(params).getPage(),
                new EntityWrapper<WangluobaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangluobaoxiuEntity> wrapper) {
		  Page<WangluobaoxiuView> page =new Query<WangluobaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangluobaoxiuVO> selectListVO(Wrapper<WangluobaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangluobaoxiuVO selectVO(Wrapper<WangluobaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangluobaoxiuView> selectListView(Wrapper<WangluobaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangluobaoxiuView selectView(Wrapper<WangluobaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
