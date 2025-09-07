package com.entity.view;

import com.entity.RuanjiandaquanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 软件大全
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
@TableName("ruanjiandaquan")
public class RuanjiandaquanView  extends RuanjiandaquanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuanjiandaquanView(){
	}
 
 	public RuanjiandaquanView(RuanjiandaquanEntity ruanjiandaquanEntity){
 	try {
			BeanUtils.copyProperties(this, ruanjiandaquanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
