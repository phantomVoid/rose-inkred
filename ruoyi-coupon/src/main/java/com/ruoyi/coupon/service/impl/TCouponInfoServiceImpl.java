package com.ruoyi.coupon.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.coupon.mapper.TCouponInfoMapper;
import com.ruoyi.coupon.domain.TCouponInfo;
import com.ruoyi.coupon.service.ITCouponInfoService;

/**
 * 提货券信息Service业务层处理
 * 
 * @author void
 * @date 2022-01-20
 */
@Service
public class TCouponInfoServiceImpl implements ITCouponInfoService 
{
    @Autowired
    private TCouponInfoMapper tCouponInfoMapper;

    /**
     * 查询提货券信息
     * 
     * @param id 提货券信息主键
     * @return 提货券信息
     */
    @Override
    public TCouponInfo selectTCouponInfoById(Long id)
    {
        return tCouponInfoMapper.selectTCouponInfoById(id);
    }

    /**
     * 查询提货券信息列表
     * 
     * @param tCouponInfo 提货券信息
     * @return 提货券信息
     */
    @Override
    public List<TCouponInfo> selectTCouponInfoList(TCouponInfo tCouponInfo)
    {
        return tCouponInfoMapper.selectTCouponInfoList(tCouponInfo);
    }

    /**
     * 新增提货券信息
     * 
     * @param tCouponInfo 提货券信息
     * @return 结果
     */
    @Override
    public int insertTCouponInfo(TCouponInfo tCouponInfo)
    {
        return tCouponInfoMapper.insertTCouponInfo(tCouponInfo);
    }

    /**
     * 修改提货券信息
     * 
     * @param tCouponInfo 提货券信息
     * @return 结果
     */
    @Override
    public int updateTCouponInfo(TCouponInfo tCouponInfo)
    {
        return tCouponInfoMapper.updateTCouponInfo(tCouponInfo);
    }

    /**
     * 批量删除提货券信息
     * 
     * @param ids 需要删除的提货券信息主键
     * @return 结果
     */
    @Override
    public int deleteTCouponInfoByIds(Long[] ids)
    {
        return tCouponInfoMapper.deleteTCouponInfoByIds(ids);
    }

    /**
     * 删除提货券信息信息
     * 
     * @param id 提货券信息主键
     * @return 结果
     */
    @Override
    public int deleteTCouponInfoById(Long id)
    {
        return tCouponInfoMapper.deleteTCouponInfoById(id);
    }
}
