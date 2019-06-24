package com.nvision.pageObj;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.nvision.framework.DriverFactory;


public class Example extends DriverFactory {

	WebDriver driver = getDriver();
	
	public Example(WebDriver driver) {
		this.driver = driver;
	}
	
    public void enterUsername(String UName) {
    	driver.findElement(By.xpath(".//*[@id='Username']")).sendKeys(UName);
    }
    
    public void enterPassword(String Pass) {
    	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(Pass);
    }
 
    public void clickButton() {
    	driver.findElement(By.xpath("//*[@id='login']/div[5]/button")).click();
    }
    
    public void loginDenied(String AlertMSG) {
    	
    	String s = driver.findElement(By.xpath("//span[@id='loginmessage']")).getText();
    	
    	Assert.assertEquals(AlertMSG, s);
    	
    }
    
    public void loginSuccess() {
    	String S = driver.getCurrentUrl();
        String Q = "https://www.jomakhata.com/#/role";
        Assert.assertEquals(S, Q);
        
        
    }
	
}
