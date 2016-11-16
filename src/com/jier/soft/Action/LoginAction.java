package com.jier.soft.Action;

public class LoginAction {

	//µÇÂ¼
	public boolean login(String username, String password){
		if(username.equals("admin")&&password.equals("admin"))
			return true;
		return false;
	}
}
