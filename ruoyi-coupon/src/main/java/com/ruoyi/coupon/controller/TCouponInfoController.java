package com.ruoyi.coupon.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.coupon.domain.TCouponInfo;
import com.ruoyi.coupon.service.ITCouponInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 提货券信息Controller
 * 
 * @author void
 * @date 2022-01-20
 */
@RestController
@RequestMapping("/coupon/info")
public class TCouponInfoController extends BaseController
{
    @Autowired
    private ITCouponInfoService tCouponInfoService;

    /**
     * 查询提货券信息列表
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(TCouponInfo tCouponInfo)
    {
        startPage();
        List<TCouponInfo> list = tCouponInfoService.selectTCouponInfoList(tCouponInfo);
        return getDataTable(list);
    }

    /**
     * 导出提货券信息列表
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:export')")
    @Log(title = "提货券信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TCouponInfo tCouponInfo)
    {
        List<TCouponInfo> list = tCouponInfoService.selectTCouponInfoList(tCouponInfo);
        ExcelUtil<TCouponInfo> util = new ExcelUtil<TCouponInfo>(TCouponInfo.class);
        util.exportExcel(response, list, "提货券信息数据");
    }

    /**
     * 获取提货券信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tCouponInfoService.selectTCouponInfoById(id));
    }

    /**
     * 新增提货券信息
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:add')")
    @Log(title = "提货券信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TCouponInfo tCouponInfo)
    {
        return toAjax(tCouponInfoService.insertTCouponInfo(tCouponInfo));
    }

    /**
     * 修改提货券信息
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:edit')")
    @Log(title = "提货券信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TCouponInfo tCouponInfo)
    {
        return toAjax(tCouponInfoService.updateTCouponInfo(tCouponInfo));
    }

    /**
     * 删除提货券信息
     */
    @PreAuthorize("@ss.hasPermi('coupon:info:remove')")
    @Log(title = "提货券信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tCouponInfoService.deleteTCouponInfoByIds(ids));
    }
}
