/**
 * 
 */
package com.cc.dao;

import java.util.List;

import com.cc.entity.User;

/**
 * @author yc
 *
 */
public interface UserDao {

	/**
	 * 根据id查询user对象
	 * @param id
	 * @return
	 */
	public User getUserById(Long id);
	
	/**
	 * 根据id删除user对象
	 * @param id
	 */
	public void deleteById(Long id);
	
	/**
	 * 修改user对象
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 保存user对象
	 * @param user
	 */
	public void saveUser(User user);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<User> findAll();
}
