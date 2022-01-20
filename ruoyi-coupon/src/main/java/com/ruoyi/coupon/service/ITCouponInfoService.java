package com.ruoyi.coupon.service;

import java.util.List;
import com.ruoyi.coupon.domain.TCouponInfo;

/**
 * 提货券信息Service接口
 * 
 * @author void
 * @date 2022-01-20
 */
public interface ITCouponInfoService 
{
    /**
     * 查询提货券信息
     * 
     * @param id 提货券信息主键
     * @return 提货券信息
     */
    public TCouponInfo selectTCouponInfoById(Long id);

    /**
     * 查询提货券信息列表
     * 
     * @param tCouponInfo 提货券信息
     * @return 提货券信息集合
     */
    public List<TCouponInfo> selectTCouponInfoList(TCouponInfo tCouponInfo);

    /**
     * 新增提货券信息
     * 
     * @param tCouponInfo 提货券信息
     * @return 结果
     */
    public int insertTCouponInfo(TCouponInfo tCouponInfo);

    /**
     * 修改提货券信息
     * 
     * @param tCouponInfo 提货券信息
     * @return 结果
     */
    public int updateTCouponInfo(TCouponInfo tCouponInfo);

    /**
     * 批量删除提货券信息
     * 
     * @param ids 需要删除的提货券信息主键集合
     * @return 结果
     */
    public int deleteTCouponInfoByIds(Long[] ids);

    /**
     * 删除提货券信息信息
     * 
     * @param id 提货券信息主键
     * @return 结果
     */
    public int deleteTCouponInfoById(Long id);
}
