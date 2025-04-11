package com.entity.vo;

import com.entity.YizhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医嘱
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yizhu")
public class YizhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 医嘱编号
     */

    @TableField(value = "yizhu_uuid_number")
    private String yizhuUuidNumber;


    /**
     * 医嘱标题
     */

    @TableField(value = "yizhu_name")
    private String yizhuName;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 注意事项
     */

    @TableField(value = "yizhu_zhuyishixiang")
    private String yizhuZhuyishixiang;


    /**
     * 忌口
     */

    @TableField(value = "yizhu_jikou")
    private String yizhuJikou;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yizhu_time")
    private Date yizhuTime;


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
	 * 设置：医嘱编号
	 */
    public String getYizhuUuidNumber() {
        return yizhuUuidNumber;
    }


    /**
	 * 获取：医嘱编号
	 */

    public void setYizhuUuidNumber(String yizhuUuidNumber) {
        this.yizhuUuidNumber = yizhuUuidNumber;
    }
    /**
	 * 设置：医嘱标题
	 */
    public String getYizhuName() {
        return yizhuName;
    }


    /**
	 * 获取：医嘱标题
	 */

    public void setYizhuName(String yizhuName) {
        this.yizhuName = yizhuName;
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
	 * 设置：注意事项
	 */
    public String getYizhuZhuyishixiang() {
        return yizhuZhuyishixiang;
    }


    /**
	 * 获取：注意事项
	 */

    public void setYizhuZhuyishixiang(String yizhuZhuyishixiang) {
        this.yizhuZhuyishixiang = yizhuZhuyishixiang;
    }
    /**
	 * 设置：忌口
	 */
    public String getYizhuJikou() {
        return yizhuJikou;
    }


    /**
	 * 获取：忌口
	 */

    public void setYizhuJikou(String yizhuJikou) {
        this.yizhuJikou = yizhuJikou;
    }
    /**
	 * 设置：日期
	 */
    public Date getYizhuTime() {
        return yizhuTime;
    }


    /**
	 * 获取：日期
	 */

    public void setYizhuTime(Date yizhuTime) {
        this.yizhuTime = yizhuTime;
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
