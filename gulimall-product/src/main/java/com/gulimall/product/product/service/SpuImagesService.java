package com.gulimall.product.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:04:01
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

