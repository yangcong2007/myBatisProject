/**
 * 
 */
package myBatisProject;

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
	public void getById(Long id) {
		System.out.println(userDao.getUserById(id));
	}
	
	@Test
	public void insert() {
		User u = new User();
		u.setUserName("cc");
		u.setPassword("123123");
		u.setName("cc");
		u.setAge(32);
		u.setCreated(new Date().toString());
		u.setUpdated(new Date().toString());
		u.setBirthday(new Date("1989-11-11"));
		u.setSex(2);
		userDao.saveUser(u);
		this.sqlSession.commit();
	}
	
	@Test
	public void update() {
		User u = userDao.getUserById(1L);
		u.setAge(15);
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
		String s = "INSERT INTO tb_orderdetail VALUES (‘1’, ‘1’, ‘10000’, ‘1’, ‘0000000001’);\r\n" + 
				"INSERT INTO tb_orderdetail VALUES (‘2’, ‘1’, ‘2000’, ‘2’, ‘0000000000’)";
		System.out.println(s.replace("‘", "'").replace("’", "'"));
	}

}
