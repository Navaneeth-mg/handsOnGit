package com.test.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LauchChrome {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\eclipse-workspace\\eclipse-Latest\\hybrid\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/selenium-webdriver/running-tests-in-chrome-browser/");
		System.out.println("Test");
		d.quit();
	}

}
