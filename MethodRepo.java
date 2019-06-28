package Repository;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import Repository.ElementRepo.*;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.By.ById;
import org.apache.commons.io.*;
import org.junit.After;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.MutableCapabilities;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;
import static java.time.Duration.ofMillis;

import io.appium.java_client.touch.*;

@SuppressWarnings("unused")
public class MethodRepo {

	private AppiumDriver<MobileElement> driver;
	private ElementRepo bind;

	public MethodRepo() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

// Device Details:

		// Device Details S6

		/*
		 * System.out.
		 * println("#### IDE Configured for Samsung Galaxy S6, ensure it is connected ####"
		 * ); desiredCapabilities.setCapability("deviceName", "Galaxy S6");
		 * desiredCapabilities.setCapability("udid", "04157df48c128631");
		 * desiredCapabilities.setCapability("platformName", "Android");
		 * desiredCapabilities.setCapability("platformVersion", "7.0");
		 */

		// Device Details S7

		System.out.println("#### IDE Configured for Samsung Galaxy S7, ensure it is connected ####");
		desiredCapabilities.setCapability("deviceName", "Galaxy S7");
		desiredCapabilities.setCapability("udid", "ad08160338b4e4f9ae");
		/* desiredCapabilities.setCapability("udid", "10.160.8.197:2500"); */
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "7.0.0");

		// Device Details J3

		/*
		 * System.out.
		 * println("#### IDE Configured for Samsung Galaxy J3, ensure it is connected ####"
		 * ); desiredCapabilities.setCapability("deviceName", "Galaxy J3");
		 * desiredCapabilities.setCapability("udid", "42002c87d0fca4ad");
		 * desiredCapabilities.setCapability("platformName", "Android");
		 * desiredCapabilities.setCapability("platformVersion", "9.0.0");
		 */

		// Device Details S8

		/*
		 * System.out.
		 * println("#### IDE Configured for Samsung Galaxy S8, ensure it is connected ####"
		 * ); desiredCapabilities.setCapability("deviceName", "Galaxy S8");
		 * desiredCapabilities.setCapability("udid", "988a1644315a55485a");
		 * desiredCapabilities.setCapability("platformName", "Android");
		 * desiredCapabilities.setCapability("platformVersion", "9.0.0");
		 */

// Launch app directly		
		desiredCapabilities.setCapability("appPackage", "uk.co.rac.roadside");
		desiredCapabilities.setCapability("appActivity", "md592b8aa3b3e6a6984a6789041796e27e0.SplashActivity");

// Set to true to retain State, false to refresh app to T&Cs	
		desiredCapabilities.setCapability("noReset", "false");
		/* desiredCapabilities.setCapability("noReset", "true"); */

// Remove Onscreen Keyboard 	
		desiredCapabilities.setCapability("unicodeKeyboard", "true");
		desiredCapabilities.setCapability("resetKeyboard", "true");

		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

		bind = new ElementRepo();
	}

	// General

	String xPath = "";
	String id = "";
	String expectedResult = "";
	String keyedInput = "";
	String elementList = "";
	String elementClass = "";
	String elementText = "";
	String Filename = "";
	String dateSpecified = "";
	LocalDate todaysDate = java.time.LocalDate.now();

	// Launch Stateless - Steps through initial pages of the app & allows all
	// permissions requested.

	public void LaunchStatelessAllowAll() {

		ForceWait(5);

		System.out.println(
				"**** Stepping through initial pages.  Permissions Allowed - Notifications, Location, Telephone ****");

		ElementWaitThenClickById(bind.tandcinital_Button);

		ElementWaitThenClickById(bind.popUp_RightButton);

		// Pressing the Skip Button using dodgy co-ordinates method

		pause(3000);

		pressByCoord(0.6, 0.775);

		ElementWaitThenClickById(bind.androidAllow);

		// Pressing the Onboarding Button using dodgy co-ordinates method

		pause(3000);

		// Onboarding Press S6

		pressByCoord(0.75, 0.5);

		// Onboarding Press S7

		pressByCoord(0.9, 0.5);

		// Onboarding Press S8

		pressByCoord(0.8, 0.5);

		ElementWaitThenClickById(bind.androidAllow);
	}

	// Launch Stateless - Steps through initial pages of the app and allows all
	// expect Location services usage

	public void LaunchStatelessDenyLocation() {

		ForceWait(5);

		System.out.println(
				"**** Stepping through initial pages.  Permissions Allowed - Notifications, Location, Telephone ****");

		ElementWaitThenClickById(bind.tandcinital_Button);

		ElementWaitThenClickById(bind.popUp_RightButton);

		// Pressing the Skip Button using dodgy co-ordinates method

		pause(3000);

		pressByCoord(0.6, 0.775);

		ElementWaitThenClickById(bind.androidAllow);

		// Pressing the Onboarding Button using dodgy co-ordinates method

		pause(3000);

		// Onboarding Press S6

		pressByCoord(0.75, 0.5);

		// Onboarding Press S7

		pressByCoord(0.9, 0.5);

		// Onboarding Press S8

		pressByCoord(0.8, 0.5);

		ElementWaitThenClickById(bind.androidDeny);
	}

	// Launch to RoutePlanner Onboarding

	public void LaunchStatelessAllowAllOB() {

		ForceWait(5);

		System.out.println(
				"**** Stepping through initial pages.  Permissions Allowed - Notifications, Location, Telephone ****");

		ElementWaitThenClickById(bind.tandcinital_Button);

		ElementWaitThenClickById(bind.popUp_RightButton);

		// Pressing the Skip Button using dodgy co-ordinates method

		pause(3000);

		pressByCoord(0.6, 0.775);

		ElementWaitThenClickById(bind.androidAllow);
	}

	// Launch via PS - Strings together a series of commands to launch the App via
	// Playstore

	public void LaunchStatelessWelcome() {

		ForceWait(5);

		System.out.println("**** Clicking through the T&Cs & Allowing Notifications ****");

		ElementWaitThenClickById(bind.tandcinital_Button);

		ElementWaitThenClickById(bind.popUp_RightButton);

	}

	public void LaunchviaPS() {

		ForceWait(5);

		System.out.println("----- Launching App via Google PlayStore -----");

		System.out.println("--- Searching for RAC App in PlayStore ---");

		ElementWaitThenClickById("Search");

		ElementWaitById("com.android.vending:id/search_box_text_input");

		keyedInput = ("RAC Route Planner &");

		SendKeysById("com.android.vending:id/search_box_text_input", keyedInput);

		pause(2000);

		System.out.println("--- Tapping on RAC App in PlayStore ---");

		String app_InListXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.TextView[1]";

		ElementWaitThenClickByXPath(app_InListXP);

		System.out.println("--- Launching RAC App in PlayStore ---");

		String open_ButtonXP = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button[2]";

		ElementWaitThenClickByXPath(open_ButtonXP);

		String MyRACApp = "uk.co.rac.roadside:id/action_bar_root";

		ElementWaitById(MyRACApp);

	}

// Rate me PopUp - Looks to handle the rate me Pop up when it appears

	public void ratePopUpClickById() {

		try {
			TriggerClickByIdNoCheck(bind.rateClose_Button);
			System.out.println("*** Handled Rate Me Pop Up ***");
			pause(5000);

		} catch (NoSuchElementException ignored) {

			System.out.println("*** Rate Me Pop Up not shown ***");

		} catch (StaleElementReferenceException ignored) {

			System.out.println("*** Rate Me Pop Up not shown ***");
		}
	}

// Hide Keyboard - Hides the screen keyboard so that it doesn't obscure entry fields on some scripts

	public void HideKeyboard() {
		driver.hideKeyboard();
	}

// Onboarding - Checks incase Onboarding is blocking tests and clicks 	

	public void Onboarding() {

		if (ElementPresentById(bind.onboarding_Button) == 1) {
			TriggerClickByIdNoCheck(bind.onboarding_Button);
		} else {
			System.out.println("INFO - Proceeding with Script - Onboarding Screen Is not displayed");
		}
	}

// Navigate Back - via Phone Back Button

	public void Back() {
		driver.navigate().back();
	}

// Take Screenshot - Takes a screenshot which is saved locally

	public void CaptureScreenshot(String Filename) {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(Filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// Pause - Pauses the script JUNIT side using thread.sleep

	public void pause(int timeToSleep) {
		try {
			Thread.sleep(timeToSleep);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

// Wait - Pushes a wait time in APPIUM

	public void ForceWait(int unit) {
		driver.manage().timeouts().implicitlyWait(unit, TimeUnit.SECONDS);
	}

// Tab Switch - Determines whether or not the desired tab is already selected and if not, selects it

	public Boolean TabSwitch(String XPath) {

		Boolean TabStatus = IsAvailableByXPath(XPath, "selected");

		if (TabStatus == true) {
			System.out.println("--- Correct Tab is Already Selected ---");
		} else {
			System.out.println("--- Selecting the Correct Tab ---");
			TriggerClickByXPath(XPath);
		}
		return TabStatus;
	}

// TabSwitchNoReport - Determines whether or not the desired tab is already selected and if not, selects it, no console entry

	public Boolean TabSwitchNoReport(String XPath) {

		Boolean TabStatus = IsAvailableByXPath(XPath, "selected");

		if (TabStatus == false) {
			TriggerClickByXPath(XPath);
		}
		return TabStatus;
	}

// Logout Attempt - TabSwitch, Checks if logged in and logs out of MyRAC if needed.

	public void LogoutAttempt() {

		TabSwitchNoReport(bind.appmenu_MyracXP);
		pause(3000);

		if (TextBoxCheckById(bind.toolbar_Title, "MYRAC")) {
			ElementWaitThenClickById(bind.myRAC_hamburger);
			ElementWaitThenClickByXPath(bind.myRAC_Logout);
			ElementWaitThenClickById(bind.popUp_RightButton);
		} else {
			System.out.println("INFO - Proceeding with Script - MyRAC not logged in");
		}
	}

// Login Fail Check - Checks that the login page is still displayed and if so tries 3 times to login 
// prior to terminating the script with onscreen error message to console.

	public int LoginFailCheck() {

		int Attempts = 0;
		int ElementPresence = ElementPresentById(bind.email_Entry);

		while (Attempts < 3 && ElementPresence > 0) {
			TriggerClickById(bind.memberLogin_Button);
			pause(15000);
			if (ElementPresentById(bind.email_Entry) == 1) {
				++Attempts;
				System.out.println("Attempt " + Attempts + " - Failed to Login");
				if (Attempts > 2) {
					TriggerClickById(bind.memberLogin_Button);
					ElementWaitById(bind.error_Message);
					String Error = GetTextById(bind.error_Message);
					System.err.println("INFO - HALTING SCRIPT - Login Failed after 3 attempts. Reason - " + Error + "");
					driver.quit();
				}
			} else {
				++Attempts;
				System.out.println("INFO - Login to MyRAC was Successful after " + Attempts + " Attempt(s)");
				break;
			}
		}
		return ElementPresence;
	}

// Element Present - Using FindElements to locate the number of matching elements

	public int ElementPresentById(String id) {
		int elementStatus = driver.findElementsById(id).size();

		return elementStatus;
	}

	public int ElementPresentByXPath(String xPath) {

		int elementStatus = driver.findElementsByXPath(xPath).size();

		return elementStatus;
	}

// Element Disappear - Loop till the element is no longer in view

	public int ElementDisappearById(String id) {

		int c = ElementPresentById(id);
		while (c > 0) {
			ElementPresentById(id);
			return c;
		}

		return c;
	}

	public int ElementDisappearByXPath(String xPath) {

		int c = ElementPresentByXPath(xPath);
		while (c > 0) {
			ElementPresentByXPath(xPath);

			return c;
		}

		return c;
	}

// Element Wait OLD - Loop until the element is available

	/*
	 * public int ElementWaitById(String id) {
	 * 
	 * int c = ElementPresentById(id); while (c < 1) { ElementPresentById(id);
	 * return c; }
	 * 
	 * return c; }
	 */

// Element Wait - Loop until the element is available

	public int ElementWaitById(String id) {

		int Attempts = 0;
		int ElementPresence = ElementPresentById(id);

		while (Attempts < 30 && ElementPresence > 0) {

			if (ElementPresentById(id) == 0) {
				++Attempts;
				if (Attempts > 29) {
					System.err.println("INFO - Wait Attempt - Failed to locate" + id + "");
					break;
				}
			} else {
				break;
			}
		}
		return ElementPresence;
	}

	/*
	 * public int ElementWaitByXPath(String xPath) {
	 * 
	 * int c = ElementPresentByXPath(xPath); while (c < 1) {
	 * ElementPresentByXPath(xPath); return c; }
	 * 
	 * return c; }
	 */

	public int ElementWaitByXPath(String xPath) {

		int Attempts = 0;
		int ElementPresence = ElementPresentByXPath(xPath);

		while (Attempts < 30 && ElementPresence > 0) {

			if (ElementPresentByXPath(xPath) == 0) {
				++Attempts;
				if (Attempts > 29) {
					System.err.println("INFO - Wait Attempt - Failed to locate" + xPath + "");
					break;
				}
			} else {
				break;
			}
		}
		return ElementPresence;
	}

// Element Wait OLD - Loop until the element is available and then Click it 

	/*
	 * public int ElementWaitThenClickById(String id) {
	 * 
	 * int c = ElementPresentById(id); while (c < 1) { ElementPresentById(id);
	 * return c; }
	 * 
	 * pause(2000); TriggerClickById(id); return c; }
	 * 
	 * public int ElementWaitThenClickByXPath(String xPath) {
	 * 
	 * int c = ElementPresentByXPath(xPath); while (c < 1) {
	 * ElementPresentByXPath(xPath); return c; }
	 * 
	 * pause(2000); TriggerClickByXPath(xPath); return c; }
	 */

	// Element Wait - Loop until the element is available and then Click it
	public int ElementWaitThenClickByIdDo(String id) {
		int Attempts = 0;
		int ElementPresence = ElementPresentById(id);

		do {
			TriggerClickByIdNoReport(id);
			ElementPresentById(id);
			++Attempts;
		} while (ElementPresence < 1 && Attempts < 30);
		return ElementPresence;

	}

	public int ElementWaitThenClickById(String id) {
		int Attempts = 0;
		int ElementPresence = ElementPresentById(id);

		TriggerClickByIdNoReport(id);
		while (ElementPresence < 1 && Attempts < 10) {
			TriggerClickByIdNoReport(id);
			if (ElementPresence == 0) {
				++Attempts;
				ElementPresentById(id);
				return Attempts;

			}
		}
		return ElementPresence;
	}

	public int ElementWaitThenClickByXPath(String xPath) {
		int Attempts = 0;
		int ElementPresence = ElementPresentByXPath(xPath);

		while (Attempts < 30 && ElementPresence < 1) {

			if (ElementPresentByXPath(xPath) == 0) {
				++Attempts;
				if (Attempts > 29) {
					System.err.println("INFO - Wait Attempt - Failed to locate" + xPath + "");
					break;
				}
			} else {
				TriggerClickByXPathNoCheck(xPath);
				break;
			}
		}
		return ElementPresence;

	}

// Element Hunt - Basic Loop that attempts to use the Android back button to navigate back and find the element

	public int ElementHuntByXPath(String xPath) {

		int c = ElementPresentByXPath(xPath);
		ForceWait(10);
		while (c < 1) {
			Back();
			ElementPresentByXPath(xPath);

			return c;
		}
		return c;
	}

// Element Hunt Welcome - More complex but tailored loop that attempts to use the various on screen back buttons to navigate back and find the element	

	public int ElementHuntWelcomeById(String id) {

		int c = ElementPresentById(id);
		ForceWait(10);
		while (c < 1) {
			Back();
			if (ElementPresentById(bind.forgotPW_BackButton) == 1) {
				;
				TriggerClickByIdNoCheck(bind.forgotPW_BackButton);
			}
			if (ElementPresentById(bind.login_BackButton) == 1) {
				;
				TriggerClickByIdNoCheck(bind.login_BackButton);
			}
			if (ElementPresentById(bind.register_Back) == 1) {
				;
				TriggerClickByIdNoCheck(bind.register_Back);
			}
			ElementPresentById(id);

			return c;
		}

		return c;
	}

// Find Element No Check - Simply Returns the Element using findelement only - **will break the script if the element is not found**	

	public MobileElement FindElementByXPathNoCheck(String xPath) {

		return driver.findElementByXPath(xPath);

	}

	public MobileElement FindElementByIdNoCheck(String id) {

		return driver.findElementById(id);

	}

// Find Element - Checks for the Element using ElementPresentBy (but does not wait for it) then returns the element

	public MobileElement FindElementByXPath(String xPath) {

		if (ElementPresentByXPath(xPath) == 0) {
			System.err.println("CRITICAL FAILURE - Unable to locate xPath element - " + xPath + "");

		} else {
			return driver.findElementByXPath(xPath);
		}
		return null;
	}

	public MobileElement FindElementById(String id) {

		if (ElementPresentById(id) == 0) {
			System.err.println("CRITICAL FAILURE - Unable to locate element Id element - " + id + "");

		} else {
			return driver.findElementById(id);
		}
		return null;
	}

// Availability - Used for checking a variety of element attributes such as enabled, selected, checked, etc

	public Boolean IsAvailableById(String id, String attributeName) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			return Boolean.valueOf(element.getAttribute(attributeName));
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;

		}
	}

	public Boolean IsAvailableByXPath(String xPath, String attributeName) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			return Boolean.valueOf(element.getAttribute(attributeName));
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

// EnabledClickable - Checks both Enabled and Clickable Status at once and returns true or false	

	public Boolean IsEnabledClickableById(String id) {

		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			Boolean EnabledStatus = (Boolean.valueOf(element.getAttribute("enabled")));
			Boolean ClickableStatus = (Boolean.valueOf(element.getAttribute("clickable")));
			if (EnabledStatus && ClickableStatus == true) {
				return true;
			} else {
				return false;
			}

		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");

		}
		return null;
	}

	public Boolean IsEnabledClickableByXPath(String xPath) {

		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			Boolean EnabledStatus = (Boolean.valueOf(element.getAttribute("enabled")));
			Boolean ClickableStatus = (Boolean.valueOf(element.getAttribute("clickable")));
			if (EnabledStatus && ClickableStatus == true) {
				return true;
			} else {
				return false;
			}

		} else {
			System.out.println("INFO - Unable to locate Element ID - " + xPath + "");

		}
		return null;
	}

// Assert Tab Checked - Looks into whether the tab is checked and if not, clicks it again	

	public Boolean AssertTabCheckedByXPath(String tab) {
		ElementWaitByXPath(tab);
		if (IsAvailableByXPath(tab, "selected") == false) {
			TriggerClickByXPath(tab);
			pause(3000);
		} else {
			System.out.println("INFO - Correct tab is selected");
		}
		return null;
	}

// Assert Checked - Looks into whether the element (toggle) is checked and if not, clicks it again

	/*
	 * public Boolean AssertCheckedById(String id) {
	 * 
	 * int Attempts = 0; Boolean CheckedStatus = (IsAvailableById(id, "checked"));
	 * 
	 * while (CheckedStatus = false && Attempts < 3) { TriggerClickByIdNoCheck(id);
	 * ++Attempts; pause(3000);
	 * 
	 * return CheckedStatus; } return CheckedStatus;
	 * 
	 * }
	 */

	public Boolean AssertCheckedById(String tab, String type, String xPath) {

		Boolean SettingsTab = (IsAvailableByXPath(tab, "selected"));
		Boolean TypeTab = (IsAvailableByXPath(type, "checked"));
		Boolean CheckedStatus = (IsAvailableByXPath(xPath, "checked"));
		int Attempts = 0;

		if (SettingsTab = false) {
			TriggerClickByXPathNoCheck(tab);

		}

		if (TypeTab = false) {
			TriggerClickByXPathNoCheck(type);

		}

		if (CheckedStatus = false) {
			TriggerClickByXPathNoCheck(xPath);

		}

		return CheckedStatus;
	}

// Assert UnChecked - Looks into whether the element (toggle) is unchecked and if not, clicks it again

	/*
	 * public Boolean AssertUnCheckedById(String id) { int Attempts = 0; Boolean
	 * CheckedStatus = (IsAvailableById(id, "checked"));
	 * 
	 * while (CheckedStatus = true && Attempts < 3) { TriggerClickByIdNoCheck(id);
	 * ++Attempts; pause(3000);
	 * 
	 * return CheckedStatus;
	 * 
	 * } return CheckedStatus; }
	 */

	public Boolean AssertUnCheckedById(String tab, String type, String xPath) {
		Boolean SettingsTab = (IsAvailableByXPath(tab, "selected"));
		Boolean TypeTab = (IsAvailableByXPath(type, "checked"));
		Boolean CheckedStatus = (IsAvailableByXPath(xPath, "checked"));

		if (SettingsTab = false) {
			TriggerClickByXPathNoCheck(tab);
			pause(3000);
		}

		if (TypeTab = false) {
			TriggerClickByXPathNoCheck(type);

		}

		if (CheckedStatus = true) {
			TriggerClickByXPathNoCheck(xPath);

		}
		return CheckedStatus;

	}

// Displayed No Check - Simply checks if the element is displayed using findelement only - **will break the script if the element is not found**	  

	public Boolean IsDisplayedByIdNoCheck(String id) {

		MobileElement element = FindElementByIdNoCheck(id);
		return element.isDisplayed();
	}

	public Boolean IsDisplayedByXPathNoCheck(String xPath) {

		MobileElement element = FindElementByXPathNoCheck(xPath);
		return element.isDisplayed();
	}

// Displayed - Checks for the Element using ElementPresentBy (but does not wait for it) then returns whethe ror not the element is displayed

	public Boolean IsDisplayedById(String id) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			return element.isDisplayed();
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

	public Boolean IsDisplayedByXPath(String xPath) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			return element.isDisplayed();
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

// Displayed Wait - Combines ElementWaitBy loop with element displayed return

	public Boolean IsDisplayedByIdWait(String id) {

		ElementWaitById(id);

		int ElementStatus = ElementWaitById(id);

		if (ElementStatus == 1) {
			MobileElement element = FindElementByIdNoCheck(id);
			return element.isDisplayed();
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

// Trigger Click No Check - Simply Clicks the Element using findelement only - **will break the script if the element is not found**  

	public void TriggerClickByXPathNoCheck(String xPath) {

		MobileElement element = FindElementByXPathNoCheck(xPath);
		element.click();
	}

	public void TriggerClickByIdNoCheck(String id) {

		MobileElement element = FindElementByIdNoCheck(id);
		element.click();
	}

// TriggerClickNoReport - Checks for the element and attempts to click it, but does not print failures to console.	

	public void TriggerClickByIdNoReport(String id) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			element.click();
		}

	}

// TriggerClick	- Checks for the Element using ElementPresentBy (but does not wait for it) then clicks the element

	public void TriggerClickById(String id) {

		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			element.click();
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
		}
	}

	public void TriggerClickByXPath(String xPath) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			element.click();
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
		}
	}

// Text Box Checking No Check - Simply Text box Checks the Element using findelement only, also does not ignore extra characters such as "/n"

	public Boolean TextBoxCheckByxPathNoCheck(String xPath, String expectedResult) {

		MobileElement element = FindElementByXPathNoCheck(xPath);
		String elementText = element.getText();
		return elementText.trim().equalsIgnoreCase(expectedResult);

	}

	public Boolean TextBoxCheckByIdNoCheck(String id, String expectedResult) {

		MobileElement element = FindElementByIdNoCheck(id);
		String elementText = element.getText();
		return elementText.trim().equalsIgnoreCase(expectedResult);

	}

// Text Box Checking No Check - Checks using find elements but does not ignore extra characters such as "/n"

	public Boolean TextBoxCheckByxPath(String xPath, String expectedResult) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			String elementText = element.getText();
			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

	public Boolean TextBoxCheckById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();
			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

// Text Box Check Ignore Format

	public Boolean TextBoxCheckIgnoreFormatById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			elementText = elementText.trim().replace("\n", " ");
			elementText = elementText.trim().replace("\r", " ");
			elementText = elementText.trim().replace("+", " ");

			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}

	}

	public Boolean TextBoxCheckIgnoreFormatByXPath(String xPath, String expectedResult) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			String elementText = element.getText();

			elementText = elementText.replace("\n", " ");
			elementText = elementText.replace("\r", " ");
			elementText = elementText.replace("+", " ");

			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

// Text Box Check Ignore Format No Space

	public Boolean TextBoxCheckIgnoreFormatNoSpaceById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			elementText = elementText.trim().replace("\n", "");
			elementText = elementText.trim().replace("\r", "");
			elementText = elementText.trim().replace("+", "");

			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

	public Boolean TextBoxCheckIgnoreFormatNoSpaceByXPath(String xPath, String expectedResult) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			String elementText = element.getText();

			elementText = elementText.replace("\n", "");
			elementText = elementText.replace("\r", "");
			elementText = elementText.replace("+", "");

			return elementText.trim().equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

// Text Box Check No Trim

	public Boolean TextBoxCheckNoTrimById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			return elementText.equalsIgnoreCase(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

//Test Box Starts With	  

	public Boolean TextBoxStartsWithById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			return elementText.trim().startsWith(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

	public Boolean TextBoxStartsWithByxPath(String xPath, String expectedResult) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			String elementText = element.getText();

			return elementText.trim().startsWith(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

//Test Box Contains	  

	public Boolean TextBoxContainsById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			return elementText.trim().contains(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

//Text Box Ends With

	public Boolean TextBoxEndsWithById(String id, String expectedResult) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);
			String elementText = element.getText();

			return elementText.trim().endsWith(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
			return false;
		}
	}

	public Boolean TextBoxEndsWithByXPath(String xPath, String expectedResult) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);
			String elementText = element.getText();

			return elementText.trim().endsWith(expectedResult);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
			return false;
		}
	}

// Get Text

	public String GetTextById(String id) {
		String GotElement = FindElementById(id).getText();

		return GotElement;
	}

// Compare Distance (Business Expenses Calculator)

	public Boolean CompareDistance() {
		String ExpensesDistance = FindElementById(bind.exp_DistanceText).getText();

		TriggerClickById(bind.exp_BackButton);

		String MapDistance = FindElementById(bind.pr_Dash_RouteDistance).getText();

		MapDistance = MapDistance.replace("(", "");
		MapDistance = MapDistance.replace("mi)", "");

		return ExpensesDistance.equalsIgnoreCase(MapDistance);
	}

// Compare Cost (Business Expenses Calculator)		

	public Boolean CompareCost(String id) {
		String ExpensesCost = FindElementById(id).getText();

		TriggerClickById(bind.exp_BackButton);

		String MapCost = FindElementById(bind.pr_Dash_RouteCost).getText();

		ExpensesCost = ExpensesCost.replace("£", "");
		MapCost = MapCost.replace("£", "");

		return ExpensesCost.equalsIgnoreCase(MapCost);
	}

// Switch From Map Back to Expenses

	public void SwitchBack() {
		TriggerClickById(bind.pr_CloseButton);

		ElementWaitThenClickById(bind.rp_DashboardButton);

		TriggerClickById(bind.dash_ExpensesContainer);

		ElementWaitThenClickByXPath(bind.pr_RecentFirstPostExpensesXP);

		ElementWaitById(bind.exp_Title);
	}

	public void SwitchBackStateless() {
		TriggerClickById(bind.pr_CloseButton);

		ElementWaitThenClickById(bind.rp_DashboardButton);

		TriggerClickById(bind.dash_ExpensesContainer);

		ElementWaitThenClickById(bind.pr_StatelessExpensesRecRoute);

		ElementWaitById(bind.exp_Title);
	}

// Send Keys	  

	public void SendKeysById(String id, String keyedInput) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);

			element.sendKeys(keyedInput);
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
		}
	}

	public void SendKeysByXPath(String xPath, String keyedInput) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementByXPath(xPath);

			element.sendKeys(keyedInput);
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
		}
	}

// Send Keys and Hide Keyboard

	public void SendKeysAndHideById(String id, String keyedInput) {
		try {
			if (ElementPresentById(id) == 1) {
				MobileElement element = FindElementById(id);

				element.sendKeys(keyedInput);
				driver.hideKeyboard();
			} else {
				System.out.println("INFO - Unable to locate Element ID - " + id + "");
			}
		} catch (Exception ignore) {

		}

	}

// Clear field

	public void ClearFieldByID(String id) {
		if (ElementPresentById(id) == 1) {
			MobileElement element = FindElementById(id);

			element.clear();
		} else {
			System.out.println("INFO - Unable to locate Element ID - " + id + "");
		}
	}

	public void ClearFieldByXPath(String xPath) {
		if (ElementPresentByXPath(xPath) == 1) {
			MobileElement element = FindElementById(xPath);

			element.clear();
		} else {
			System.out.println("INFO - Unable to locate Element XPath - " + xPath + "");
		}
	}

// Scroll by Text

	public MobileElement scrollToElementUsing_Text(String elementList, String elementClass, String elementText) {

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"" + elementList + "\")).getChildByText("
						+ "new UiSelector().className(\"" + elementClass + "\"), \"" + elementText + "\")"));

		element.isDisplayed();

		return element;

	}

// Scroll by Text and Get

	public String scrollToElementUsing_TextAndGet(String elementList, String elementClass, String elementText) {

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"" + elementList + "\")).getChildByText("
						+ "new UiSelector().className(\"" + elementClass + "\"), \"" + elementText + "\")"));

		String elementName = element.getText();

		return elementName;
	}

// Scroll by Text and Click

	public MobileElement scrollToElementUsing_TextAndClick(String elementList, String elementClass,
			String elementText) {

		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"" + elementList + "\")).getChildByText("
						+ "new UiSelector().className(\"" + elementClass + "\"), \"" + elementText + "\")"));

		element.click();

		return element;

	}

// Check for Add Vehicle Pop Up and Return

	public void addVehiclePopUpCheck(String id) {

		try {
			if (IsDisplayedById(id) == true) {
				System.out.println("FAIL - Add Vehicle Pop Up Displays Again");
			}
		} catch (NoSuchElementException ignored) {

			System.out.println("*** Add Vehicle Pop Up is Not Shown ***");

		} catch (StaleElementReferenceException ignored) {

			System.out.println("*** Add Vehicle Pop Up is Not Shown ***");
		}
	}

// Date finder

	public void locateDate(String dateSpecified) {

		try {

			TriggerClickById("android:id/next");
			ForceWait(3);
			TriggerClickById(dateSpecified);

		} catch (NoSuchElementException stored) {
			System.out.println("*** Date not found within displayed ***");
		}
	}

//Horizontal Swipe by percentages
	@SuppressWarnings("rawtypes")
	public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.height * anchorPercentage);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * endPercentage);

		new TouchAction(driver).press(point(startPoint, anchor)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(endPoint, anchor)).release().perform();
	}

	// Swipe by elements
	@SuppressWarnings("rawtypes")
	public void swipeByElements(MobileElement startElement, MobileElement endElement) {
		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
		int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

		int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
		int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

		new TouchAction(driver).press(point(startX, startY)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(endX, endY)).release().perform();
	}

	// Vertical Swipe by percentages
	@SuppressWarnings("rawtypes")
	public void verticalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * endPercentage);

		new TouchAction(driver).press(point(anchor, startPoint)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, endPoint)).release().perform();
	}

	// Coord Press By percentage - Experimental

	@SuppressWarnings("rawtypes")
	public void pressByCoord(double pressPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int pointPress = (int) (size.height * pressPercentage);

		new TouchAction(driver).press(point(anchor, pointPress)).release().perform();
	}

	public void activateApp() {
		driver.queryAppState("uk.co.rac.roadside:id");
	}

	public MobileElement findElementByText(String ContainedText) {
		try {

			MobileElement ReturnedElement = driver
					.findElement(MobileBy.AndroidUIAutomator("new UiSelector().Contains(" + ContainedText + ")"));
			System.out.println("Element Found");
			return ReturnedElement;
		} catch (Exception e) {
			System.err.println("Failed to search by Text");
		}
		return null;
	}

	private void findElementByAndroidUIAutomator(String string) {
		// TODO Auto-generated method stub
	}
	// Plan Route - Adding routes to favourites

	public void destinationAddFirstRecent() {

		TriggerClickByXPath(bind.pr_DestinationTextXP);

		TriggerClickByXPath(bind.pr_RecentFirstLocContXP);

		TriggerClickById(bind.pr_Dash_Expand);

		ElementWaitThenClickById(bind.pr_Dash_FavouriteContainer);

		TriggerClickById(bind.pr_Dash_Close);

		TriggerClickById(bind.pr_CloseButton);

		ElementWaitThenClickById(bind.rp_PlanRouteButton);
	}

	public void destinationAddSecondRecent() {

		TriggerClickByXPath(bind.pr_DestinationTextXP);

		TriggerClickByXPath(bind.pr_RecentSecondLocContXP);

		TriggerClickById(bind.pr_Dash_Expand);

		ElementWaitThenClickById(bind.pr_Dash_FavouriteContainer);

		TriggerClickById(bind.pr_Dash_Close);

		TriggerClickById(bind.pr_CloseButton);

		ElementWaitThenClickById(bind.rp_PlanRouteButton);
	}

	public void destinationAddThirdRecent() {

		TriggerClickByXPath(bind.pr_DestinationTextXP);

		TriggerClickByXPath(bind.pr_RecentThirdLocContXP);

		TriggerClickById(bind.pr_Dash_Expand);

		ElementWaitThenClickById(bind.pr_Dash_FavouriteContainer);

		TriggerClickById(bind.pr_Dash_Close);

		TriggerClickById(bind.pr_CloseButton);

		ElementWaitThenClickById(bind.rp_PlanRouteButton);
	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
