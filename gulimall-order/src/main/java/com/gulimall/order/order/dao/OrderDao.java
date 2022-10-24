package com.gulimall.order.order.dao;

import com.gulimall.order.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:05:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
