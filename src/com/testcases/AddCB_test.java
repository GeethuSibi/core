package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.configration.BrowserDrivers;
import com.projectlibrary.AddCB;

public class AddCB_test {

	AddCB createCB = new AddCB();

	@Test

	public void verify_addCB_valid() throws InterruptedException
	{

		createCB.addcb_valid();

        WebElement element = BrowserDrivers.driver.findElement(By.xpath("//h4[contains(text(),'Great! You have successfully authorised new Certif')]"));
        String actual =element.getText();        
		String expected ="Great! You have successfully authorised new Certification Body. They will recieve an email shortly with their login details.";
		BrowserDrivers.driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		
		Assert.assertEquals(expected,actual);

	}

}
