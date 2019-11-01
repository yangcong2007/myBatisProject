import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cc.dao.UserMapper;

/**
 * @author yc
 * 集成spring测试
 */
@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试//开启spring的注解
@ContextConfiguration(locations = "classpath:applicationContext-dao.xml")//加装核心配置文件，自动构建
public class UserMapperSpringTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void login() {
		System.out.println(this.userMapper.login("hj", "123456"));
	}
}
