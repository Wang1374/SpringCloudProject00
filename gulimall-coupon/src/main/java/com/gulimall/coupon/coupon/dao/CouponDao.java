package com.gulimall.coupon.coupon.dao;

import com.gulimall.coupon.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-22 20:21:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
