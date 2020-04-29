package com.xm.production.ssm.mapper.authority;

import java.util.List;

import com.xm.production.ssm.domain.authority.SysPermission;

/**
 * 
 * <p>Title: SysPermissionMapperCustom</p>
 * <p>Description: 权限mapper</p>
 * <p>Company: www.itcast.com</p> 
 */
public interface SysPermissionMapperCustom {
	
	//根据用户id查询菜单
	public List<SysPermission> findMenuListByUserId(String userid)throws Exception;
	//根据用户id查询权限url
	public String findPermissionByUserId(String userid)throws Exception;

}
