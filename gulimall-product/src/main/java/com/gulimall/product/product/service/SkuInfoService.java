package com.gulimall.product.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:03:59
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

