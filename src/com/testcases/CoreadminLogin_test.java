package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Browser;
import com.configration.BrowserDrivers;
import com.inputdata.AdminLogin_data;
import com.projectlibrary.AdminLogin;

public class CoreadminLogin_test {

	AdminLogin login = new AdminLogin();	
	
	@Test

	public void verify_validuser_invalidpwd() throws InterruptedException
	{
		Browser.open_chrome_browser();
		Browser.navigate_to(AdminLogin_data.url);

		login.login_validuser_invalidpwd();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),AdminLogin_data.expectedresult_wrong);
		BrowserDrivers.driver.navigate().refresh();

	}

	@Test

	public void verify_invaliduser_validpwd() throws InterruptedException
	{
		login.login_invaliduser_validpwd();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),AdminLogin_data.expectedresult_wrong);
		BrowserDrivers.driver.navigate().refresh();

	}

	@Test
	public void verify_invaliduser_invalidpwd() throws InterruptedException
	{
		login.login_invaliduser_invalidpwd();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),AdminLogin_data.expectedresult_wrong);
		BrowserDrivers.driver.navigate().refresh();

	}
	
	@Test

	public void verify_validlogin() throws InterruptedException
	{			
		login.login_validuser_validpwd();
		String actual = BrowserDrivers.driver.getCurrentUrl();
		Assert.assertEquals(actual,AdminLogin_data.expectedresult);
		Thread.sleep(2000);

	}
	
	
	}
