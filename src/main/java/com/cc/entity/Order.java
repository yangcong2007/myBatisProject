/**
 * 
 */
package com.cc.entity;

import java.util.Date;
import java.util.List;

/**
 * @author yc
 * 订单实体类
 */
public class Order {

	private Long id;
	private Long userId;
	private String orderNumber;
	private Date created;
	private Date updated;
	private User user;
	private List<OrderDetail> orderDetailList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", orderNumber=" + orderNumber + ", created=" + created
				+ ", updated=" + updated + ", user=" + user + ", orderDetailList=" + orderDetailList + "]";
	}
	
	
}
