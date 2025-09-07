package com.dao;

import com.entity.DiscusswangluotaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswangluotaocanVO;
import com.entity.view.DiscusswangluotaocanView;


/**
 * 网络套餐评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface DiscusswangluotaocanDao extends BaseMapper<DiscusswangluotaocanEntity> {
	
	List<DiscusswangluotaocanVO> selectListVO(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
	
	DiscusswangluotaocanVO selectVO(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
	
	List<DiscusswangluotaocanView> selectListView(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);

	List<DiscusswangluotaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
	
	DiscusswangluotaocanView selectView(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
	

}
