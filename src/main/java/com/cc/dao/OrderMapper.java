/**
 * 
 */
package com.cc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cc.entity.Order;

/**
 * @author yc
 *
 */
public interface OrderMapper {

	public Order queryOrderAndUserByOrderNo(@Param("number") String orderNumber);
	
	/**
	 * 根据订单号查询订单信息，下单用户以及订单详情
	 * @param orderNumber 订单号
	 * @return
	 */
	public List<Order> queryOrderWithUserAndDetailByOrderNo(@Param("number") String orderNumber);
	
	/**
	 * 根据订单号查询订单用户的信息及订单详情及订单详情对应的商品信息
	 * @param number
	 * @return
	 */
	Order queryOrderWithUserAndDetailItemByOrderNumber(@Param("number") String number);

	public Order lazyGetOrderAndUserByNo(@Param("number") String number);
}
