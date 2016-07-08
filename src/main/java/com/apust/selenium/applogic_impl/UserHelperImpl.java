package com.apust.selenium.applogic_impl;

import org.openqa.selenium.WebDriver;

import com.apust.selenium.applogic.ApplicationManager;
import com.apust.selenium.applogic.UserHelper;
import com.apust.selenium.model.User;

public class UserHelperImpl extends DriverBasedHelper implements UserHelper {

	public UserHelperImpl(ApplicationManager manager) {
		super(manager.getWebDriver());
		
	}

	@Override
	public void loginAs(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLoggedIn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLoggedInAs(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNotLoggedIn() {
		// TODO Auto-generated method stub
		return false;
	}


	
	


}

