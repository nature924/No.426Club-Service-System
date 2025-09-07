package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangjizixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangjizixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangjizixunView;


/**
 * 装机咨询
 *
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public interface ZhuangjizixunService extends IService<ZhuangjizixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangjizixunVO> selectListVO(Wrapper<ZhuangjizixunEntity> wrapper);
   	
   	ZhuangjizixunVO selectVO(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
   	
   	List<ZhuangjizixunView> selectListView(Wrapper<ZhuangjizixunEntity> wrapper);
   	
   	ZhuangjizixunView selectView(@Param("ew") Wrapper<ZhuangjizixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangjizixunEntity> wrapper);
   	

}

