package com.dao;

import com.entity.ZhuangjizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangjizixunVO;
import com.entity.view.ZhuangjizixunView;


/**
 * 装机咨询
 * 
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface ZhuangjizixunDao extends BaseMapper<ZhuangjizixunEntity> {
	
	List<ZhuangjizixunVO> selectListVO(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
	
	ZhuangjizixunVO selectVO(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
	
	List<ZhuangjizixunView> selectListView(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);

	List<ZhuangjizixunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
	
	ZhuangjizixunView selectView(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
	

}
