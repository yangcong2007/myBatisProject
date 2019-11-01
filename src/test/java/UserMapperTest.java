import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cc.dao.UserMapper;

/**
 * 
 */

/**
 * @author yc
 *
 */
public class UserMapperTest {

	public UserMapper userMapper;
	
	@Before
	public void setUp() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		this.userMapper = sqlSession.getMapper(UserMapper.class);
	}
	
	@Test
    public void testLogin() {
        System.out.println(this.userMapper.login("hj", "123456"));
    }
}
