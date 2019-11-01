import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cc.dao.OrderMapper;
import com.cc.entity.Order;
import com.cc.entity.OrderDetail;

/**
 * 
 */

/**
 * @author yc
 *
 */
public class OrderMapperTest {

	private OrderMapper orderMapper ;
	
	
	@Before
	public void setUp() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		this.orderMapper = sqlSession.getMapper(OrderMapper.class);
	}
	
//	@Test
	public void queryOrderAndUserByOrderNumber() throws Exception{
		Order o = orderMapper.queryOrderAndUserByOrderNo("201807010001");
		System.out.println(o.getUser());
	}
	
//	@Test
	public void queryOrderWithUserAndDetailByOrderNo() {
		List<Order> ol = orderMapper.queryOrderWithUserAndDetailByOrderNo("201807010001");
		for(Order o : ol) {
			for(OrderDetail d : o.getOrderDetailList()) {
				System.out.println(d);
			}
			System.out.println(o.getUser());
		}
	}
	
//	@Test
	public void queryOrderWithUserAndDetailItemByOrderNumber() throws Exception {
	    Order order = orderMapper.queryOrderWithUserAndDetailItemByOrderNumber("201807010001");
	    System.out.println(order);
	    System.out.println(order.getUser());
	    System.out.println(order.getOrderDetailList());
	}
	
	@Test
	public void queryOrder() {
		Order order = orderMapper.lazyGetOrderAndUserByNo("201807010001");
		System.out.println(order.getOrderNumber());
		System.out.println(order.getUser());
	}

}
