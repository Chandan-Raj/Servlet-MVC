package com.Model;

public class User 
{
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validatelogin()
	{
		if(name.equals("Chandan") && password.equals("mvcExample"))
		{
			return true;
		}
		return false;
	}
	
}
