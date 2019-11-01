/**
 * 
 */
package com.cc.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yc
 * user实体类
 */
public class User {

	private Long id;
	private String userName;
	private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String created;
    private String updated;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
    
    public String toString() {
    	return "user{"
    			+ "id='"+ id +"',"
    			+ "userName='"+ userName +"',"
    			+ "password='"+ password +"',"
    			+", name='" + name + '\'' 
                +", age=" + age 
                +", sex=" + sex 
                +", birthday='" + new SimpleDateFormat("yyyy-MM-dd").format(birthday) + '\'' 
                +", created='" + created + '\'' 
                +", updated='" + updated + '\'' 
                +'}';
    }
//	public String getUser_name() {
//		return user_name;
//	}
//	public void setUser_name(String user_name) {
//		this.user_name = user_name;
//	}
}
