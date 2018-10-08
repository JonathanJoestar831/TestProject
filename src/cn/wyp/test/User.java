package cn.wyp.test;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 3601470141407549788L;

	private String username;
	private long register_time;
	public User() {
		super();
	}
	public User(String username, long register_time) {
		super();
		this.username = username;
		this.register_time = register_time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getRegister_time() {
		return register_time;
	}
	public void setRegister_time(long register_time) {
		this.register_time = register_time;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", register_time=" + register_time + "]";
	}

}
