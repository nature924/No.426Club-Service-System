package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanrenyuanView;


/**
 * 社团人员
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface ShetuanrenyuanService extends IService<ShetuanrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanrenyuanVO> selectListVO(Wrapper<ShetuanrenyuanEntity> wrapper);
   	
   	ShetuanrenyuanVO selectVO(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
   	
   	List<ShetuanrenyuanView> selectListView(Wrapper<ShetuanrenyuanEntity> wrapper);
   	
   	ShetuanrenyuanView selectView(@Param("ew") Wrapper<ShetuanrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanrenyuanEntity> wrapper);
   	

}

