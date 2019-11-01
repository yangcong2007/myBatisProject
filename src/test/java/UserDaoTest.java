/**
 * 
 */


import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cc.dao.UserDao;
import com.cc.dao.impl.UserDaoImpl;
import com.cc.entity.User;

/**
 * @author yc
 *
 */
public class UserDaoTest {

	public UserDao userDao;
	public SqlSession sqlSession;
	
	@Before
	public void setUp() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		sqlSession = sqlSessionFactory.openSession();
		this.userDao = new UserDaoImpl(sqlSession);
	}
	
	
	@Test
	public void getById() {
		System.out.println(userDao.getUserById(2L));
	}
	
	@Test
	public void insert() {
		User u = new User();
		u.setUserName("cc1");
		u.setPassword("123123");
		u.setName("cc1");
		u.setAge(32);
		u.setBirthday(new Date("1989/10/11"));
		u.setSex(2);
		userDao.saveUser(u);
		this.sqlSession.commit();
	}
	
	@Test
	public void update() {
		User u = new User();
		u.setAge(15);
		u.setId(1L);
		u.setUserName("cc123");
		userDao.updateUser(u);
		this.sqlSession.commit();
	}
	
	@Test
	public void findAll() {
		List<User> list = userDao.findAll();
		for(User u : list) {
			System.out.println(u);
		}
	}
	
	@Test
	public void delete() {
		userDao.deleteById(4L);
		this.sqlSession.commit();
	}
	
	public static void main(String[] args) {

	}

}
