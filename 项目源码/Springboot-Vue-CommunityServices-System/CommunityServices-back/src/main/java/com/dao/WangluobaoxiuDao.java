package com.dao;

import com.entity.WangluobaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangluobaoxiuVO;
import com.entity.view.WangluobaoxiuView;


/**
 * 网络报修
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface WangluobaoxiuDao extends BaseMapper<WangluobaoxiuEntity> {
	
	List<WangluobaoxiuVO> selectListVO(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
	
	WangluobaoxiuVO selectVO(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
	
	List<WangluobaoxiuView> selectListView(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);

	List<WangluobaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
	
	WangluobaoxiuView selectView(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
	

}
