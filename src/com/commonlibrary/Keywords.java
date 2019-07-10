package com.commonlibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.configration.BrowserDrivers;

public class Keywords {

	public static void enter_text(String locator,String text)
	{
		BrowserDrivers.driver.findElement(By.xpath(locator)).sendKeys(text);
	}


	public static void click_element(String locator)
	{
		BrowserDrivers.driver.findElement(By.xpath(locator)).click();
	}

	public static void wait_for_xpath(String locator)
	{
		WebDriverWait wait=new WebDriverWait(BrowserDrivers.driver,120);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}

		public static void dropdown_click(String locator,String locator1)
	{
	
		Select select=new Select(BrowserDrivers.driver.findElement(By.xpath(locator)));
		
		select.selectByValue(locator1);
		
		
	}
	
	
	
	public static void sendkeys_dropdown(String locator,String value,String locator1)
	{
		BrowserDrivers.driver.findElement(By.xpath(locator)).sendKeys(value);
		
		BrowserDrivers.driver.findElement(By.xpath(locator1)).click();
	}
	
	
	public static void get_attribute(String locator,String value)
	{
		WebElement element=BrowserDrivers.driver.findElement(By.xpath(locator));
		
		String text=element.getAttribute(value);
		//System.out.println(text);
	}
	
	
	
	

}
