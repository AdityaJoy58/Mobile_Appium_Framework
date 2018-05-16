package com.mobile.appium.StepDefinitions;

import cucumber.api.java.en.*;
import org.testng.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

import com.mobile.appium.Pages.*;

public class LoginStepDef
{
	AppiumDriver<AndroidElement> driver = ScenarioHooks.driver;
	Home home = new Home(driver);
	@Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        Assert.assertEquals(home.isDisplayed(), true, "Home Page not displayed");
    }
    @When("^user checks slow motion option$")
    public void user_checks_slow_motion_option()  { 
        home.checkSlowMotion();
    }

    @When("^user checks enable reveal color view option$")
    public void user_checks_enable_reveal_color_view_option()  {
    	home.checkEnableRevealColorView();
    }
    
    @When("^user unchecks enable action view option$")
    public void user_unchecks_enable_action_view_option()  {
    	home.uncheckEnableActionView();
    }	
}