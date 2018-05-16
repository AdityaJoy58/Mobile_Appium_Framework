
1. Install Java/Eclipse - Set Path
2. Install Android Studio-Get Android SDK - Set Path - Check adb
3. Install Maven - Set Path
4. Install cucumber eclipse plugin
5. Create Maven project - Add depenedencies to pom.xml
6. Add JRE libaray to Maven project pointing to JDK
7. Install Appium Desktop server
8. Use adb shell and dumpsys window windows | grep -E ‘mCurrentFocus’   to get appPackage and appActivity
9. use PageFactory.initElements(new AppiumFieldDecorator(driver), this);  for declaring Android and iOS elements and bind
   them to AppiumDriver object