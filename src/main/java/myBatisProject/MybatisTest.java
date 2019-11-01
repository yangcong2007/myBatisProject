/**
 * 
 */
package myBatisProject;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cc.entity.User;

/**
 * @author yc
 * mybatis 测试类
 */
public class MybatisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String resource = "mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			User u = sqlSession.selectOne("MyMapper.selectUser", 1L);
			System.out.println(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
