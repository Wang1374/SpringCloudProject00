package com.gulimall.member.member.dao;

import com.gulimall.member.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:18:12
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
