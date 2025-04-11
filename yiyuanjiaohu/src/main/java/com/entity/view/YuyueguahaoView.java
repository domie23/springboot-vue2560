package com.entity.view;

import com.entity.YuyueguahaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 预约挂号
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yuyueguahao")
public class YuyueguahaoView extends YuyueguahaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核的值
		*/
		private String yuyueguahaoYesnoValue;



		//级联表 yisheng
			/**
			* 医生工号
			*/
			private String yishengUuidNumber;
			/**
			* 医生姓名
			*/
			private String yishengName;
			/**
			* 手机号
			*/
			private String yishengPhone;
			/**
			* 科室
			*/
			private Integer keshiTypes;
				/**
				* 科室的值
				*/
				private String keshiValue;
			/**
			* 擅长领域
			*/
			private String yishengZhuanchang;
			/**
			* 职称
			*/
			private String yishengZhicheng;
			/**
			* 头像
			*/
			private String yishengPhoto;
			/**
			* 坐诊时间
			*/
			private String yishengZuozhenshijian;
			/**
			* 挂号价格
			*/
			private Double yishengNewMoney;
			/**
			* 个人介绍
			*/
			private String yishengContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YuyueguahaoView() {

	}

	public YuyueguahaoView(YuyueguahaoEntity yuyueguahaoEntity) {
		try {
			BeanUtils.copyProperties(this, yuyueguahaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核的值
			*/
			public String getYuyueguahaoYesnoValue() {
				return yuyueguahaoYesnoValue;
			}
			/**
			* 设置： 审核的值
			*/
			public void setYuyueguahaoYesnoValue(String yuyueguahaoYesnoValue) {
				this.yuyueguahaoYesnoValue = yuyueguahaoYesnoValue;
			}













				//级联表的get和set yisheng
					/**
					* 获取： 医生工号
					*/
					public String getYishengUuidNumber() {
						return yishengUuidNumber;
					}
					/**
					* 设置： 医生工号
					*/
					public void setYishengUuidNumber(String yishengUuidNumber) {
						this.yishengUuidNumber = yishengUuidNumber;
					}
					/**
					* 获取： 医生姓名
					*/
					public String getYishengName() {
						return yishengName;
					}
					/**
					* 设置： 医生姓名
					*/
					public void setYishengName(String yishengName) {
						this.yishengName = yishengName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYishengPhone() {
						return yishengPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYishengPhone(String yishengPhone) {
						this.yishengPhone = yishengPhone;
					}
					/**
					* 获取： 科室
					*/
					public Integer getKeshiTypes() {
						return keshiTypes;
					}
					/**
					* 设置： 科室
					*/
					public void setKeshiTypes(Integer keshiTypes) {
						this.keshiTypes = keshiTypes;
					}


						/**
						* 获取： 科室的值
						*/
						public String getKeshiValue() {
							return keshiValue;
						}
						/**
						* 设置： 科室的值
						*/
						public void setKeshiValue(String keshiValue) {
							this.keshiValue = keshiValue;
						}
					/**
					* 获取： 擅长领域
					*/
					public String getYishengZhuanchang() {
						return yishengZhuanchang;
					}
					/**
					* 设置： 擅长领域
					*/
					public void setYishengZhuanchang(String yishengZhuanchang) {
						this.yishengZhuanchang = yishengZhuanchang;
					}
					/**
					* 获取： 职称
					*/
					public String getYishengZhicheng() {
						return yishengZhicheng;
					}
					/**
					* 设置： 职称
					*/
					public void setYishengZhicheng(String yishengZhicheng) {
						this.yishengZhicheng = yishengZhicheng;
					}
					/**
					* 获取： 头像
					*/
					public String getYishengPhoto() {
						return yishengPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYishengPhoto(String yishengPhoto) {
						this.yishengPhoto = yishengPhoto;
					}
					/**
					* 获取： 坐诊时间
					*/
					public String getYishengZuozhenshijian() {
						return yishengZuozhenshijian;
					}
					/**
					* 设置： 坐诊时间
					*/
					public void setYishengZuozhenshijian(String yishengZuozhenshijian) {
						this.yishengZuozhenshijian = yishengZuozhenshijian;
					}
					/**
					* 获取： 挂号价格
					*/
					public Double getYishengNewMoney() {
						return yishengNewMoney;
					}
					/**
					* 设置： 挂号价格
					*/
					public void setYishengNewMoney(Double yishengNewMoney) {
						this.yishengNewMoney = yishengNewMoney;
					}
					/**
					* 获取： 个人介绍
					*/
					public String getYishengContent() {
						return yishengContent;
					}
					/**
					* 设置： 个人介绍
					*/
					public void setYishengContent(String yishengContent) {
						this.yishengContent = yishengContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
