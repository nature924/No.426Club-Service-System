package com.dao;

import com.entity.DiscussruanjiandaquanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussruanjiandaquanVO;
import com.entity.view.DiscussruanjiandaquanView;


/**
 * 软件大全评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface DiscussruanjiandaquanDao extends BaseMapper<DiscussruanjiandaquanEntity> {
	
	List<DiscussruanjiandaquanVO> selectListVO(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
	
	DiscussruanjiandaquanVO selectVO(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
	
	List<DiscussruanjiandaquanView> selectListView(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);

	List<DiscussruanjiandaquanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
	
	DiscussruanjiandaquanView selectView(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
	

}
