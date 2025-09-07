package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangluobaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangluobaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangluobaoxiuView;


/**
 * 网络报修
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface WangluobaoxiuService extends IService<WangluobaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangluobaoxiuVO> selectListVO(Wrapper<WangluobaoxiuEntity> wrapper);
   	
   	WangluobaoxiuVO selectVO(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
   	
   	List<WangluobaoxiuView> selectListView(Wrapper<WangluobaoxiuEntity> wrapper);
   	
   	WangluobaoxiuView selectView(@Param("ew") Wrapper<WangluobaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangluobaoxiuEntity> wrapper);
   	

}

