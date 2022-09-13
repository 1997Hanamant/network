package com.xworkz.resort;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionConfig {
	@Value("${url}")
	String url;
	@Value("${username}")
	String userName;
	@Value("${password}")
	String password;

	public ConnectionConfig() {
		System.out.println(this.getClass().getSimpleName());
	}

	public ConnectionConfig(String url, String userName, String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionConfig [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
