package com.gulimall.member.member.dao;

import com.gulimall.member.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-10-23 20:18:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
