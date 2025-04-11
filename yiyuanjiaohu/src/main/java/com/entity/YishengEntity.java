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
 * 医生
 *
 * @author 
 * @email
 */
@TableName("yisheng")
public class YishengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YishengEntity() {

	}

	public YishengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 医生工号
     */
    @TableField(value = "yisheng_uuid_number")

    private String yishengUuidNumber;


    /**
     * 医生姓名
     */
    @TableField(value = "yisheng_name")

    private String yishengName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 手机号
     */
    @TableField(value = "yisheng_phone")

    private String yishengPhone;


    /**
     * 科室
     */
    @TableField(value = "keshi_types")

    private Integer keshiTypes;


    /**
     * 擅长领域
     */
    @TableField(value = "yisheng_zhuanchang")

    private String yishengZhuanchang;


    /**
     * 职称
     */
    @TableField(value = "yisheng_zhicheng")

    private String yishengZhicheng;


    /**
     * 头像
     */
    @TableField(value = "yisheng_photo")

    private String yishengPhoto;


    /**
     * 坐诊时间
     */
    @TableField(value = "yisheng_zuozhenshijian")

    private String yishengZuozhenshijian;


    /**
     * 挂号价格
     */
    @TableField(value = "yisheng_new_money")

    private Double yishengNewMoney;


    /**
     * 个人介绍
     */
    @TableField(value = "yisheng_content")

    private String yishengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医生工号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }


    /**
	 * 获取：医生工号
	 */

    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 设置：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }


    /**
	 * 获取：医生姓名
	 */

    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：手机号
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 设置：科室
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }


    /**
	 * 获取：科室
	 */

    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 设置：擅长领域
	 */
    public String getYishengZhuanchang() {
        return yishengZhuanchang;
    }


    /**
	 * 获取：擅长领域
	 */

    public void setYishengZhuanchang(String yishengZhuanchang) {
        this.yishengZhuanchang = yishengZhuanchang;
    }
    /**
	 * 设置：职称
	 */
    public String getYishengZhicheng() {
        return yishengZhicheng;
    }


    /**
	 * 获取：职称
	 */

    public void setYishengZhicheng(String yishengZhicheng) {
        this.yishengZhicheng = yishengZhicheng;
    }
    /**
	 * 设置：头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 设置：坐诊时间
	 */
    public String getYishengZuozhenshijian() {
        return yishengZuozhenshijian;
    }


    /**
	 * 获取：坐诊时间
	 */

    public void setYishengZuozhenshijian(String yishengZuozhenshijian) {
        this.yishengZuozhenshijian = yishengZuozhenshijian;
    }
    /**
	 * 设置：挂号价格
	 */
    public Double getYishengNewMoney() {
        return yishengNewMoney;
    }


    /**
	 * 获取：挂号价格
	 */

    public void setYishengNewMoney(Double yishengNewMoney) {
        this.yishengNewMoney = yishengNewMoney;
    }
    /**
	 * 设置：个人介绍
	 */
    public String getYishengContent() {
        return yishengContent;
    }


    /**
	 * 获取：个人介绍
	 */

    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yisheng{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yishengUuidNumber=" + yishengUuidNumber +
            ", yishengName=" + yishengName +
            ", sexTypes=" + sexTypes +
            ", yishengPhone=" + yishengPhone +
            ", keshiTypes=" + keshiTypes +
            ", yishengZhuanchang=" + yishengZhuanchang +
            ", yishengZhicheng=" + yishengZhicheng +
            ", yishengPhoto=" + yishengPhoto +
            ", yishengZuozhenshijian=" + yishengZuozhenshijian +
            ", yishengNewMoney=" + yishengNewMoney +
            ", yishengContent=" + yishengContent +
            ", createTime=" + createTime +
        "}";
    }
}
