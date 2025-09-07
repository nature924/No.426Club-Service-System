package com.dao;

import com.entity.ShetuanrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanrenyuanVO;
import com.entity.view.ShetuanrenyuanView;


/**
 * 社团人员
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface ShetuanrenyuanDao extends BaseMapper<ShetuanrenyuanEntity> {
	
	List<ShetuanrenyuanVO> selectListVO(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
	
	ShetuanrenyuanVO selectVO(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
	
	List<ShetuanrenyuanView> selectListView(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);

	List<ShetuanrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
	
	ShetuanrenyuanView selectView(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
	

}
