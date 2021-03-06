package com.mobile.appium.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Home {
	AppiumDriver<AndroidElement> driver = null;
	
	@AndroidFindBy(xpath = "//*[@resource-id='at.markushi.reveal:id/title']")
	@iOSFindBy(xpath = "")
	private WebElement hometitle;
	
	@AndroidFindBy(xpath = "//*[@resource-id='at.markushi.reveal:id/slow_motion']")
	@iOSFindBy(xpath = "")
	private WebElement slowMotion;
	
	@AndroidFindBy(xpath = "//*[@resource-id='at.markushi.reveal:id/enable_reveal']")
	@iOSFindBy(xpath = "")
	private WebElement enableRevealColorView;
	
	@AndroidFindBy(xpath = "//*[@resource-id='at.markushi.reveal:id/enable_action']")
	@iOSFindBy(xpath = "")
	private WebElement enableActionView;

	public Home(AppiumDriver<AndroidElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	public boolean isDisplayed()
	{
		return hometitle.isDisplayed();
	}
	
	public void checkSlowMotion()
	{
		if(slowMotion.getAttribute("checked").equals("false"))
			slowMotion.click();
	}
	public void checkEnableRevealColorView()
	{
		if(enableRevealColorView.getAttribute("checked").equals("false"))
			enableRevealColorView.click();
	}
	public void checkEnableActionView()
	{
		if(enableActionView.getAttribute("checked").equals("false"))
			enableActionView.click();
	}
	
	public void uncheckSlowMotion()
	{
		if(slowMotion.getAttribute("checked").equals("true"))
			slowMotion.click();
	}
	public void uncheckEnableRevealColorView()
	{
		if(enableRevealColorView.getAttribute("checked").equals("true"))
			enableRevealColorView.click();
	}
	public void uncheckEnableActionView()
	{
		if(enableActionView.getAttribute("checked").equals("true"))
			enableActionView.click();
	}
}
