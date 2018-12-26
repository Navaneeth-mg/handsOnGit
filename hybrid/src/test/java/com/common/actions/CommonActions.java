package com.common.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	
	//This method waits implicitly for 10 seconds.
	public WebDriver ImplicitWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public WebDriver WaitForElement(WebDriver driver, WebElement element) {
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		
		return driver;
	}

}
