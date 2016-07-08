package com.apust.selenium.applogic;

import com.apust.selenium.model.User;

public interface UserHelper {
	
	void loginAs(User user);
	void logout();
	boolean isLoggedIn();
	boolean isLoggedInAs(User user);
	boolean isNotLoggedIn();
}
