package com.xm.production.ssm.service;

import java.util.List;

import com.xm.production.ssm.domain.authority.SysPermission;
import com.xm.production.ssm.domain.authority.SysUser;
import com.xm.production.ssm.domain.customize.ActiveUser;

/**
 *
 * 认证授权服务接口
 *
 */
public interface SysService {
	SysUser getSysUserByName(String username)throws Exception;

	List<SysPermission> findMenuListByUserId(String userId) throws Exception;

	List<SysPermission> findPermissionListByUserId(String userId) throws Exception;
}
