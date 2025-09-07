package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuanjiandaquanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuanjiandaquanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuanjiandaquanView;


/**
 * 软件大全
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface RuanjiandaquanService extends IService<RuanjiandaquanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuanjiandaquanVO> selectListVO(Wrapper<RuanjiandaquanEntity> wrapper);
   	
   	RuanjiandaquanVO selectVO(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
   	
   	List<RuanjiandaquanView> selectListView(Wrapper<RuanjiandaquanEntity> wrapper);
   	
   	RuanjiandaquanView selectView(@Param("ew") Wrapper<RuanjiandaquanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuanjiandaquanEntity> wrapper);
   	

}

