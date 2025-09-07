package com.entity.model;

import com.entity.RuanjiandaquanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 软件大全
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public class RuanjiandaquanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 软件包
	 */
	
	private String ruanjianbao;
		
	/**
	 * 软件简介
	 */
	
	private String ruanjianjianjie;
		
	/**
	 * 适用系统
	 */
	
	private String shiyongxitong;
		
	/**
	 * 软件版本
	 */
	
	private String ruanjianbanben;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 软件链接
	 */
	
	private String ruanjianlianjie;
		
	/**
	 * 软件详情
	 */
	
	private String ruanjianxiangqing;
				
	
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
	 * 设置：软件包
	 */
	 
	public void setRuanjianbao(String ruanjianbao) {
		this.ruanjianbao = ruanjianbao;
	}
	
	/**
	 * 获取：软件包
	 */
	public String getRuanjianbao() {
		return ruanjianbao;
	}
				
	
	/**
	 * 设置：软件简介
	 */
	 
	public void setRuanjianjianjie(String ruanjianjianjie) {
		this.ruanjianjianjie = ruanjianjianjie;
	}
	
	/**
	 * 获取：软件简介
	 */
	public String getRuanjianjianjie() {
		return ruanjianjianjie;
	}
				
	
	/**
	 * 设置：适用系统
	 */
	 
	public void setShiyongxitong(String shiyongxitong) {
		this.shiyongxitong = shiyongxitong;
	}
	
	/**
	 * 获取：适用系统
	 */
	public String getShiyongxitong() {
		return shiyongxitong;
	}
				
	
	/**
	 * 设置：软件版本
	 */
	 
	public void setRuanjianbanben(String ruanjianbanben) {
		this.ruanjianbanben = ruanjianbanben;
	}
	
	/**
	 * 获取：软件版本
	 */
	public String getRuanjianbanben() {
		return ruanjianbanben;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
				
	
	/**
	 * 设置：软件链接
	 */
	 
	public void setRuanjianlianjie(String ruanjianlianjie) {
		this.ruanjianlianjie = ruanjianlianjie;
	}
	
	/**
	 * 获取：软件链接
	 */
	public String getRuanjianlianjie() {
		return ruanjianlianjie;
	}
				
	
	/**
	 * 设置：软件详情
	 */
	 
	public void setRuanjianxiangqing(String ruanjianxiangqing) {
		this.ruanjianxiangqing = ruanjianxiangqing;
	}
	
	/**
	 * 获取：软件详情
	 */
	public String getRuanjianxiangqing() {
		return ruanjianxiangqing;
	}
			
}
