package com.nvision.framework;

import org.openqa.selenium.WebDriver;

import com.nvision.pageObj.Example;



public class ParentScenario extends DriverFactory {

	protected WebDriver driver = getDriver();
	
	public Example example;

	
    public void startBrowser() {
    	example = new Example(driver);   	
    	
    }
 
    public void navigateTo() {
    	driver.navigate().to("https://login.jomakhata.com/login/index/aHR0cHM6Ly93d3cuam9tYWtoYXRhLmNvbS8%3D");
    	
    }
}
