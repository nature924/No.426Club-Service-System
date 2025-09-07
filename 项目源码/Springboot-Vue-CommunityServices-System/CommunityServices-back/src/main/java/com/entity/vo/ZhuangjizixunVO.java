package com.entity.vo;

import com.entity.ZhuangjizixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 装机咨询
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-16 11:46:41
 */
public class ZhuangjizixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
