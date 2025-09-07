package com.entity.model;

import com.entity.WangluotaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 网络套餐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public class WangluotaocanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 费用
	 */
	
	private String feiyong;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 套餐简介
	 */
	
	private String taocanjianjie;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(String feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public String getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：套餐简介
	 */
	 
	public void setTaocanjianjie(String taocanjianjie) {
		this.taocanjianjie = taocanjianjie;
	}
	
	/**
	 * 获取：套餐简介
	 */
	public String getTaocanjianjie() {
		return taocanjianjie;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
	}
			
}
