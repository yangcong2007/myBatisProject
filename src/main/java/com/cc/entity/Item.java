/**
 * 
 */
package com.cc.entity;

/**
 * @author yc
 * 商品条目
 */ 
public class Item {
 
	private Long id;
	private String itemName;
	private Double itemPrice;
	private String itemDetail;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemDetail=" + itemDetail + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}
	
	
}
