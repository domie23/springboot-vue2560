package com.entity.model;

import com.entity.YishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 医生
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 医生工号
     */
    private String yishengUuidNumber;


    /**
     * 医生姓名
     */
    private String yishengName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 手机号
     */
    private String yishengPhone;


    /**
     * 科室
     */
    private Integer keshiTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：医生工号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }


    /**
	 * 设置：医生工号
	 */
    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 获取：医生姓名
	 */
    public String getYishengName() {
        return yishengName;
    }


    /**
	 * 设置：医生姓名
	 */
    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：手机号
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 获取：科室
	 */
    public Integer getKeshiTypes() {
        return keshiTypes;
    }


    /**
	 * 设置：科室
	 */
    public void setKeshiTypes(Integer keshiTypes) {
        this.keshiTypes = keshiTypes;
    }
    /**
	 * 获取：擅长领域
	 */
    public String getYishengZhuanchang() {
        return yishengZhuanchang;
    }


    /**
	 * 设置：擅长领域
	 */
    public void setYishengZhuanchang(String yishengZhuanchang) {
        this.yishengZhuanchang = yishengZhuanchang;
    }
    /**
	 * 获取：职称
	 */
    public String getYishengZhicheng() {
        return yishengZhicheng;
    }


    /**
	 * 设置：职称
	 */
    public void setYishengZhicheng(String yishengZhicheng) {
        this.yishengZhicheng = yishengZhicheng;
    }
    /**
	 * 获取：头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 获取：坐诊时间
	 */
    public String getYishengZuozhenshijian() {
        return yishengZuozhenshijian;
    }


    /**
	 * 设置：坐诊时间
	 */
    public void setYishengZuozhenshijian(String yishengZuozhenshijian) {
        this.yishengZuozhenshijian = yishengZuozhenshijian;
    }
    /**
	 * 获取：挂号价格
	 */
    public Double getYishengNewMoney() {
        return yishengNewMoney;
    }


    /**
	 * 设置：挂号价格
	 */
    public void setYishengNewMoney(Double yishengNewMoney) {
        this.yishengNewMoney = yishengNewMoney;
    }
    /**
	 * 获取：个人介绍
	 */
    public String getYishengContent() {
        return yishengContent;
    }


    /**
	 * 设置：个人介绍
	 */
    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
