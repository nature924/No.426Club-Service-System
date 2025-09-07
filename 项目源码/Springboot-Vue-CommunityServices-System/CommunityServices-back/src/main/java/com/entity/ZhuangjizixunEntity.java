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
 * 装机咨询
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
@TableName("zhuangjizixun")
public class ZhuangjizixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuangjizixunEntity() {
		
	}
	
	public ZhuangjizixunEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 咨询时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date zixunshijian;
	
	/**
	 * 咨询状态
	 */
					
	private String zixunzhuangtai;
	
	/**
	 * 专业特征
	 */
					
	private String zhuanyetezheng;
	
	/**
	 * 装机需求
	 */
					
	private String zhuangjixuqiu;
	
	/**
	 * 装机预算
	 */
					
	private String zhuangjiyusuan;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：咨询时间
	 */
	public void setZixunshijian(Date zixunshijian) {
		this.zixunshijian = zixunshijian;
	}
	/**
	 * 获取：咨询时间
	 */
	public Date getZixunshijian() {
		return zixunshijian;
	}
	/**
	 * 设置：咨询状态
	 */
	public void setZixunzhuangtai(String zixunzhuangtai) {
		this.zixunzhuangtai = zixunzhuangtai;
	}
	/**
	 * 获取：咨询状态
	 */
	public String getZixunzhuangtai() {
		return zixunzhuangtai;
	}
	/**
	 * 设置：专业特征
	 */
	public void setZhuanyetezheng(String zhuanyetezheng) {
		this.zhuanyetezheng = zhuanyetezheng;
	}
	/**
	 * 获取：专业特征
	 */
	public String getZhuanyetezheng() {
		return zhuanyetezheng;
	}
	/**
	 * 设置：装机需求
	 */
	public void setZhuangjixuqiu(String zhuangjixuqiu) {
		this.zhuangjixuqiu = zhuangjixuqiu;
	}
	/**
	 * 获取：装机需求
	 */
	public String getZhuangjixuqiu() {
		return zhuangjixuqiu;
	}
	/**
	 * 设置：装机预算
	 */
	public void setZhuangjiyusuan(String zhuangjiyusuan) {
		this.zhuangjiyusuan = zhuangjiyusuan;
	}
	/**
	 * 获取：装机预算
	 */
	public String getZhuangjiyusuan() {
		return zhuangjiyusuan;
	}

}
