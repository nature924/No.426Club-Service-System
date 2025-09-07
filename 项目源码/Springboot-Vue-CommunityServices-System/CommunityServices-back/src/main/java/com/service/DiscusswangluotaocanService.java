package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswangluotaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswangluotaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswangluotaocanView;


/**
 * 网络套餐评论表
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface DiscusswangluotaocanService extends IService<DiscusswangluotaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswangluotaocanVO> selectListVO(Wrapper<DiscusswangluotaocanEntity> wrapper);
   	
   	DiscusswangluotaocanVO selectVO(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
   	
   	List<DiscusswangluotaocanView> selectListView(Wrapper<DiscusswangluotaocanEntity> wrapper);
   	
   	DiscusswangluotaocanView selectView(@Param("ew") Wrapper<DiscusswangluotaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswangluotaocanEntity> wrapper);
   	

}

