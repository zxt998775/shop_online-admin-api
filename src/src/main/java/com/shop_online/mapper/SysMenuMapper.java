package com.shop_online.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop_online.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sunyu
 * @since 2023-11-28
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

	/**
	 * 查询所有菜单列表
	 *
	 * @param type 菜单类型
	 */
	List<SysMenu> getMenuList(@Param("type") String type,@Param("isEq") boolean isEq);

	/**
	 * 查询用户菜单列表
	 *
	 * @param managerId 用户ID
	 * @param type 菜单类型
	 */
	List<SysMenu> getManagerMenuList(@Param("managerId") Integer managerId, @Param("type") String type ,@Param("isEq") boolean isEq);

	/**
	 * 查询管理员权限列表
	 *
	 * @param managerId 管理员ID
	 */
	List<String> getManagerAuthorityList(@Param("managerId") Integer managerId);

	/**
	 * 查询所有权限列表
	 */
	List<String> getAuthorityList();

}
