package com.gulimall.product.product.dao;

import com.gulimall.product.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:03:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
