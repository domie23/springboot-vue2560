package com.entity.model;

import com.entity.YizhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医嘱
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YizhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 医嘱编号
     */
    private String yizhuUuidNumber;


    /**
     * 医嘱标题
     */
    private String yizhuName;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 注意事项
     */
    private String yizhuZhuyishixiang;


    /**
     * 忌口
     */
    private String yizhuJikou;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yizhuTime;


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
	 * 获取：医嘱编号
	 */
    public String getYizhuUuidNumber() {
        return yizhuUuidNumber;
    }


    /**
	 * 设置：医嘱编号
	 */
    public void setYizhuUuidNumber(String yizhuUuidNumber) {
        this.yizhuUuidNumber = yizhuUuidNumber;
    }
    /**
	 * 获取：医嘱标题
	 */
    public String getYizhuName() {
        return yizhuName;
    }


    /**
	 * 设置：医嘱标题
	 */
    public void setYizhuName(String yizhuName) {
        this.yizhuName = yizhuName;
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
	 * 获取：注意事项
	 */
    public String getYizhuZhuyishixiang() {
        return yizhuZhuyishixiang;
    }


    /**
	 * 设置：注意事项
	 */
    public void setYizhuZhuyishixiang(String yizhuZhuyishixiang) {
        this.yizhuZhuyishixiang = yizhuZhuyishixiang;
    }
    /**
	 * 获取：忌口
	 */
    public String getYizhuJikou() {
        return yizhuJikou;
    }


    /**
	 * 设置：忌口
	 */
    public void setYizhuJikou(String yizhuJikou) {
        this.yizhuJikou = yizhuJikou;
    }
    /**
	 * 获取：日期
	 */
    public Date getYizhuTime() {
        return yizhuTime;
    }


    /**
	 * 设置：日期
	 */
    public void setYizhuTime(Date yizhuTime) {
        this.yizhuTime = yizhuTime;
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
