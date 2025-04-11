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
 * 预约挂号
 *
 * @author 
 * @email
 */
@TableName("yuyueguahao")
public class YuyueguahaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuyueguahaoEntity() {

	}

	public YuyueguahaoEntity(T t) {
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
     * 预约医生
     */
    @TableField(value = "yisheng_id")

    private Integer yishengId;


    /**
     * 预约内容
     */
    @TableField(value = "yuyueneirong_text")

    private String yuyueneirongText;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuyueneirong_time")

    private Date yuyueneirongTime;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核
     */
    @TableField(value = "yuyueguahao_yesno_types")

    private Integer yuyueguahaoYesnoTypes;


    /**
     * 审核回复
     */
    @TableField(value = "yuyueguahao_yesno_text")

    private String yuyueguahaoYesnoText;


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
	 * 设置：预约医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 获取：预约医生
	 */

    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 设置：预约内容
	 */
    public String getYuyueneirongText() {
        return yuyueneirongText;
    }


    /**
	 * 获取：预约内容
	 */

    public void setYuyueneirongText(String yuyueneirongText) {
        this.yuyueneirongText = yuyueneirongText;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYuyueneirongTime() {
        return yuyueneirongTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYuyueneirongTime(Date yuyueneirongTime) {
        this.yuyueneirongTime = yuyueneirongTime;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核
	 */
    public Integer getYuyueguahaoYesnoTypes() {
        return yuyueguahaoYesnoTypes;
    }


    /**
	 * 获取：审核
	 */

    public void setYuyueguahaoYesnoTypes(Integer yuyueguahaoYesnoTypes) {
        this.yuyueguahaoYesnoTypes = yuyueguahaoYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getYuyueguahaoYesnoText() {
        return yuyueguahaoYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setYuyueguahaoYesnoText(String yuyueguahaoYesnoText) {
        this.yuyueguahaoYesnoText = yuyueguahaoYesnoText;
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
        return "Yuyueguahao{" +
            "id=" + id +
            ", yishengId=" + yishengId +
            ", yuyueneirongText=" + yuyueneirongText +
            ", yuyueneirongTime=" + yuyueneirongTime +
            ", yonghuId=" + yonghuId +
            ", yuyueguahaoYesnoTypes=" + yuyueguahaoYesnoTypes +
            ", yuyueguahaoYesnoText=" + yuyueguahaoYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
