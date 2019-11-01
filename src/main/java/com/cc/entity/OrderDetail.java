/**
 * 
 */
package com.cc.entity;

/**
 * @author yc
  * 订单详情
 */
public class OrderDetail {

	private Long id;
	private Long orderId;
	private Double totalPrice;
	private Integer status;
	
	private Item item;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", totalPrice=" + totalPrice + ", status=" + status
				+ ", item="+item.getId() +"]";
	}
	
	
}
