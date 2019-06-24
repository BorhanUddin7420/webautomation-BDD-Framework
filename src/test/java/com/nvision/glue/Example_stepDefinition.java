package com.nvision.glue;

import com.nvision.framework.ParentScenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Example_stepDefinition extends ParentScenario {
	
	@Before
    public void beforeScenario() throws Throwable {
        startBrowser();
    }
	
	@Given("^User is on LogIn page$")
	public void user_is_on_example_page() throws Throwable {
		navigateTo();
	}

	@When("^User enters \"([^\"]*)\" into Username field$")
	public void user_enters_into_Username_field(String UName) throws Throwable {
		example.enterUsername(UName);
	}

	@And("^User enters \"([^\"]*)\" into Password field$")
	public void user_enters_into_Password_field(String Pass) throws Throwable {
		example.enterPassword(Pass);
	}

	@And("^User Click LogIn button$")
	public void user_Click_example_button() throws Throwable {
		Thread.sleep(2000);
		example.clickButton();
	}
	
	@When("^example Denied With Alert Message \"([^\"]*)\"$")
	public void example_Denied_With_Alert_Message(String AlertMSG) throws Throwable {
	    Thread.sleep(5000);
	    example.loginDenied(AlertMSG);
	}
	
    @When("^User Login Successfully$")
    public void user_example_Successfully() throws Throwable {
       Thread.sleep(5000);
       example.loginSuccess();
    }
    
    @Given("^user click to save button$")
    public void user_click_to_save_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       
    }

}
