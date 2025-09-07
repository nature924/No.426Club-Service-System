package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussruanjiandaquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussruanjiandaquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussruanjiandaquanView;


/**
 * 软件大全评论表
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface DiscussruanjiandaquanService extends IService<DiscussruanjiandaquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussruanjiandaquanVO> selectListVO(Wrapper<DiscussruanjiandaquanEntity> wrapper);
   	
   	DiscussruanjiandaquanVO selectVO(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
   	
   	List<DiscussruanjiandaquanView> selectListView(Wrapper<DiscussruanjiandaquanEntity> wrapper);
   	
   	DiscussruanjiandaquanView selectView(@Param("ew") Wrapper<DiscussruanjiandaquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussruanjiandaquanEntity> wrapper);
   	

}

