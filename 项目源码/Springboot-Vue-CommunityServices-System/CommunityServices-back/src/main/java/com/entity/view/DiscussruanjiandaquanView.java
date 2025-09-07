package com.entity.view;

import com.entity.DiscussruanjiandaquanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 软件大全评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
@TableName("discussruanjiandaquan")
public class DiscussruanjiandaquanView  extends DiscussruanjiandaquanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussruanjiandaquanView(){
	}
 
 	public DiscussruanjiandaquanView(DiscussruanjiandaquanEntity discussruanjiandaquanEntity){
 	try {
			BeanUtils.copyProperties(this, discussruanjiandaquanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
