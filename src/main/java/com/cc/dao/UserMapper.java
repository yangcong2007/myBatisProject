/**
 * 
 */
package com.cc.dao;

import org.apache.ibatis.annotations.Param;

import com.cc.entity.User;

/**
 * @author yc
 *
 */
public interface UserMapper {

	/**
	 * 根据用户名和密码登录
	 * @param userName
	 * @param password
	 * @return
	 */
	public User login(@Param("userName")String userName,@Param("password")String password) ;
}
