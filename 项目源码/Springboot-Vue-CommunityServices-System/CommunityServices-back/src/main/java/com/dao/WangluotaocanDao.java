package com.dao;

import com.entity.WangluotaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangluotaocanVO;
import com.entity.view.WangluotaocanView;


/**
 * 网络套餐
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface WangluotaocanDao extends BaseMapper<WangluotaocanEntity> {
	
	List<WangluotaocanVO> selectListVO(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
	
	WangluotaocanVO selectVO(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
	
	List<WangluotaocanView> selectListView(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);

	List<WangluotaocanView> selectListView(Pagination page,@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
	
	WangluotaocanView selectView(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
	

}
