package com.ruoyi.coupon.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 提货券信息对象 t_coupon_info
 * 
 * @author void
 * @date 2022-01-20
 */
public class TCouponInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 提货券号 */
    @Excel(name = "提货券号")
    private String couponNo;

    /** 提货券密码 */
    @Excel(name = "提货券密码")
    private String couponPwd;

    /** 状态 */
    @Excel(name = "状态")
    private String couponStatus;

    /** 快递单号 */
    @Excel(name = "快递单号")
    private String expressNo;

    /** 提货电话 */
    @Excel(name = "提货电话")
    private String telNo;

    /** 提货地址 */
    @Excel(name = "提货地址")
    private String address;

    /** 提货人 */
    @Excel(name = "提货人")
    private String name;

    /** 附件 */
    @Excel(name = "附件")
    private String annex;

    /** 备注 */
    @Excel(name = "备注")
    private String desc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCouponNo(String couponNo) 
    {
        this.couponNo = couponNo;
    }

    public String getCouponNo() 
    {
        return couponNo;
    }
    public void setCouponPwd(String couponPwd) 
    {
        this.couponPwd = couponPwd;
    }

    public String getCouponPwd() 
    {
        return couponPwd;
    }
    public void setCouponStatus(String couponStatus) 
    {
        this.couponStatus = couponStatus;
    }

    public String getCouponStatus() 
    {
        return couponStatus;
    }
    public void setExpressNo(String expressNo) 
    {
        this.expressNo = expressNo;
    }

    public String getExpressNo() 
    {
        return expressNo;
    }
    public void setTelNo(String telNo) 
    {
        this.telNo = telNo;
    }

    public String getTelNo() 
    {
        return telNo;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAnnex(String annex) 
    {
        this.annex = annex;
    }

    public String getAnnex() 
    {
        return annex;
    }
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getDesc() 
    {
        return desc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("couponNo", getCouponNo())
            .append("couponPwd", getCouponPwd())
            .append("couponStatus", getCouponStatus())
            .append("expressNo", getExpressNo())
            .append("telNo", getTelNo())
            .append("address", getAddress())
            .append("name", getName())
            .append("annex", getAnnex())
            .append("desc", getDesc())
            .toString();
    }
}
