package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.AdminLogin_data;
import com.locators.AdminLogin_elements;

public class AdminLogin {

	public void login_validcredential() throws InterruptedException
	{
		Keywords.wait_for_xpath(AdminLogin_elements.username);
		Keywords.enter_text(AdminLogin_elements.username, AdminLogin_data.username);

		Keywords.wait_for_xpath(AdminLogin_elements.password);
		Keywords.enter_text(AdminLogin_elements.password, AdminLogin_data.password);

		Keywords.click_element(AdminLogin_elements.signin);
		Thread.sleep(2000);

	}
	
	public void login_validun_invalidpwd() throws InterruptedException
	{
		Keywords.wait_for_xpath(AdminLogin_elements.username);
		Keywords.enter_text(AdminLogin_elements.username, AdminLogin_data.username);

		Keywords.wait_for_xpath(AdminLogin_elements.password);
		Keywords.enter_text(AdminLogin_elements.password, AdminLogin_data.wrongpassword);

		Keywords.click_element(AdminLogin_elements.signin);

	}
	

}
