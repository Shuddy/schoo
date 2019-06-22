package websample09;

import java.io.Serializable;

public class UserBean2 implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;   // ID
	private String name; // 名前
	private int age;     // 年齢
	private int auth;    // 権限（管理者権限：1、一般権限：0）

	public UserBean2(){

	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}


}
