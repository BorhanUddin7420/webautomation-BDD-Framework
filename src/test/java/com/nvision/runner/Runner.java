package com.nvision.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "com.nvision.glue",
		plugin = {"html:target/selenium-reports","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		format = {"json:target/cucumber.json","html:target/A_Features"}
		)

public class Runner extends AbstractTestNGCucumberTests {

//	@BeforeClass
//	public static void setup() {
//	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//	    extentProperties.setReportPath("output/report.html");
//	    extentProperties.setExtentXServerUrl("http://192.168.91.116:1337");
//	    extentProperties.setProjectName("QA master Setup");
//	}
//	
//	@AfterClass
//	public static void extenReporter() throws IOException{
//        Reporter.loadXMLConfig(new File("ExtentReport/ex-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//        Reporter.setSystemInfo("Machine", 	"Windows 10" +" (" + "64 Bit" + ")");
//	    Reporter.setSystemInfo("Selenium", "3.0.1");
//	    Reporter.setSystemInfo("Maven", "3.5.2");
//	    Reporter.setSystemInfo("Java Version", "1.8.0_121");
//        Reporter.setTestRunnerOutput("QA master Setup");
//    }
   
}
