package com.entity.model;

import com.entity.YuyueguahaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 预约挂号
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuyueguahaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约医生
     */
    private Integer yishengId;


    /**
     * 预约内容
     */
    private String yuyueneirongText;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuyueneirongTime;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核
     */
    private Integer yuyueguahaoYesnoTypes;


    /**
     * 审核回复
     */
    private String yuyueguahaoYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：预约医生
	 */
    public Integer getYishengId() {
        return yishengId;
    }


    /**
	 * 设置：预约医生
	 */
    public void setYishengId(Integer yishengId) {
        this.yishengId = yishengId;
    }
    /**
	 * 获取：预约内容
	 */
    public String getYuyueneirongText() {
        return yuyueneirongText;
    }


    /**
	 * 设置：预约内容
	 */
    public void setYuyueneirongText(String yuyueneirongText) {
        this.yuyueneirongText = yuyueneirongText;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYuyueneirongTime() {
        return yuyueneirongTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYuyueneirongTime(Date yuyueneirongTime) {
        this.yuyueneirongTime = yuyueneirongTime;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核
	 */
    public Integer getYuyueguahaoYesnoTypes() {
        return yuyueguahaoYesnoTypes;
    }


    /**
	 * 设置：审核
	 */
    public void setYuyueguahaoYesnoTypes(Integer yuyueguahaoYesnoTypes) {
        this.yuyueguahaoYesnoTypes = yuyueguahaoYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getYuyueguahaoYesnoText() {
        return yuyueguahaoYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setYuyueguahaoYesnoText(String yuyueguahaoYesnoText) {
        this.yuyueguahaoYesnoText = yuyueguahaoYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
