package com.entity.vo;

import com.entity.YuyueguahaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 预约挂号
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuyueguahao")
public class YuyueguahaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
