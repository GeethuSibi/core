package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Browser;
import com.configration.BrowserDrivers;
import com.inputdata.AdminLogin_data;
import com.projectlibrary.AdminLogin;

public class CoreadminLogin_test {
	
	AdminLogin login = new AdminLogin();
	
 @Test(priority=1)
	
	public void verify_validlogin() throws InterruptedException
	{
		Browser.open_chrome_browser();
		Browser.navigate_to(AdminLogin_data.url);
		
		login.login_validcredential();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),AdminLogin_data.expectedresult);
		
	}
	
 @Test(priority=0)
	
	public void verify_validun_invalidpwd() throws InterruptedException
	{
		Browser.open_chrome_browser();
		Browser.navigate_to(AdminLogin_data.url);
		
		login.login_validun_invalidpwd();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),AdminLogin_data.expectedresult_wrong);
	}
	
	
}
