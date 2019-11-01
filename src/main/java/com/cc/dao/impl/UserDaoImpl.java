/**
 * 
 */
package com.cc.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cc.dao.UserDao;
import com.cc.entity.User;

/**
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao{

	public SqlSession sqlSession ;
	
	
	public UserDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public User getUserById(Long id) {
		//括号里的UserDao.selectUser,UserDao与UserDaoMapper.xml中的mapper的namespace对应
		//selectUser与UserDaoMapper.xml中的id对应
		return this.sqlSession.selectOne("UserDao.selectUser",id);
	}

	public void deleteById(Long id) {
		sqlSession.delete("UserDao.deleteUser",id);
	}

	public void updateUser(User user) {
		sqlSession.update("UserDao.updateUser",user);
	}

	public void saveUser(User user) {
		sqlSession.insert("UserDao.insertUser", user);
	}

	public List<User> findAll() {
		return sqlSession.selectList("UserDao.findAll");
	}

}
