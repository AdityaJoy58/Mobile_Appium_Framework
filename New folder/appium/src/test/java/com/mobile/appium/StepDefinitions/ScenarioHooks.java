package com.mobile.appium.StepDefinitions;
import com.mobile.appium.framework.MobileDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import cucumber.api.java.After;
import cucumber.api.java.Before;
 
public class ScenarioHooks {
	private MobileDriver md = null;
	public static AppiumDriver<AndroidElement> driver = null;
	@Before
    public void beforeScenario(){
		md = new MobileDriver("F:/Gopi Mobile Project/config.txt");
		driver = md.createDriver();
    }	
	
	@After
    public void afterScenario(){
       md.killDriver();
    }
}