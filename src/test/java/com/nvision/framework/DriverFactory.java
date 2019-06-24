package com.nvision.framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class DriverFactory {
	
public static WebDriver driver;
	
	
	public  WebDriver getDriver() {
		
		
		if (driver == null) {
				
				System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
				ChromeOptions cOptions = new ChromeOptions();
				cOptions.addArguments("chrome.switches","-disable-extensions");
				cOptions.addArguments("--start-maximized");
				cOptions.addArguments("--disable-web-security");
				cOptions.addArguments("--disable-notifications");
				cOptions.addArguments("--no-proxy-server");
				driver = new ChromeDriver(cOptions);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				}
		
		return driver;
	}

}
