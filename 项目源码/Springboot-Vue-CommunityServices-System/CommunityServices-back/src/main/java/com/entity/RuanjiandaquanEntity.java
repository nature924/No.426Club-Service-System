package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 软件大全
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
@TableName("ruanjiandaquan")
public class RuanjiandaquanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuanjiandaquanEntity() {
		
	}
	
	public RuanjiandaquanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 软件名称
	 */
					
	private String ruanjianmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：软件名称
	 */
	public void setRuanjianmingcheng(String ruanjianmingcheng) {
		this.ruanjianmingcheng = ruanjianmingcheng;
	}
	/**
	 * 获取：软件名称
	 */
	public String getRuanjianmingcheng() {
		return ruanjianmingcheng;
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
