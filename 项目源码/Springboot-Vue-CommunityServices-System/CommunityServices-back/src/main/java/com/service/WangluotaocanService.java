package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangluotaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangluotaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangluotaocanView;


/**
 * 网络套餐
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface WangluotaocanService extends IService<WangluotaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangluotaocanVO> selectListVO(Wrapper<WangluotaocanEntity> wrapper);
   	
   	WangluotaocanVO selectVO(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
   	
   	List<WangluotaocanView> selectListView(Wrapper<WangluotaocanEntity> wrapper);
   	
   	WangluotaocanView selectView(@Param("ew") Wrapper<WangluotaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangluotaocanEntity> wrapper);
   	

}

