package com.dao;

import com.entity.RuanjiandaquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuanjiandaquanVO;
import com.entity.view.RuanjiandaquanView;


/**
 * 软件大全
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface RuanjiandaquanDao extends BaseMapper<RuanjiandaquanEntity> {
	
	List<RuanjiandaquanVO> selectListVO(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
	
	RuanjiandaquanVO selectVO(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
	
	List<RuanjiandaquanView> selectListView(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);

	List<RuanjiandaquanView> selectListView(Pagination page,@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
	
	RuanjiandaquanView selectView(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
	

}
