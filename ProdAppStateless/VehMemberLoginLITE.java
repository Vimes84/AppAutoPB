package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*import org.omg.CORBA.RepositoryIdHelper;
import io.appium.java_client.MobileBy;*/
//import org.junit.runners.MethodSorters;
//import org.junit.FixMethodOrder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class VehMemberLoginLITE {

	private AppiumDriver<MobileElement> driver;
	private Repository.MethodRepo repo;
	private Repository.ElementRepo bind;

	public void OUTPUT(String output) {
		System.out.println(output);
	}

	public void OUTPUTFAIL(String output) {
		System.err.println(output);
	}

	@Before
	public void setUp() throws MalformedURLException {
		repo = new Repository.MethodRepo();
	}

	// General

	String xPath = "";
	String id = "";
	String expectedResult = "";
	String keyedInput = "";
	String elementList = "";
	String elementClass = "";
	String elementText = "";
	LocalDate todaysDate = java.time.LocalDate.now();

	@Test
	public void myVehLOMemberLoginTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - My Vehicles LOGGED OUT > MEMBER LOGIN PAGE TESTS*****");

		repo.LaunchStatelessAllowAll();

		OUTPUT("--- Tapping My Vehicles Tab ---");

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.Onboarding();

// Member Login Page via Welcome Screen

		OUTPUT("--- Tapping Member Login ---");

		repo.pause(1000);

		repo.TriggerClickById(bind.login_Button);

/// Member Login Page 

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteBLoggedOutLITE/"
				+ todaysDate + "/" + todaysDate + "-9-MyVehMemberLogin.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		OUTPUT("--- Checking Member Login is Displayed ---");

		if (repo.IsDisplayedById("uk.co.rac.roadside:id/form_container")) {
			OUTPUT("PASS - Member Login is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Member Login Is NOT Displayed");
		}

/// Member Login - Back Button      

		OUTPUT("--- Checking Back Button is Enabled and Clickable ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.login_BackButton) == true) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

/// Member Login - Email Entry - Mail Icon

		OUTPUT("--- Checking Mail icon is Displayed ---");

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(bind.myrac_MailIconXP)) {
			OUTPUT("PASS - Mail icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Mail icon is NOT displayed");
		}

/// Member Login - Email Entry - Text Box		

		OUTPUT("--- Checking Email Entry is Clickable and Populated ---");

		repo.pause(1000);

		if (repo.IsAvailableById(bind.email_Entry, "clickable") == true) {
			OUTPUT("PASS - Email Entry is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Email Entry is NOT Clickable");
		}

		expectedResult = "Email";

		if (repo.TextBoxCheckById(bind.email_Entry, expectedResult)) {
			OUTPUT("PASS - Text Box Contains Email");
		} else {
			OUTPUTFAIL("FAIL - Text Box Does NOT Contain Email");
		}

/// Member Login - Password Entry - Lock Icon

		OUTPUT("--- Checking Mail icon is Displayed ---");

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(bind.myrac_LockIconXP)) {
			OUTPUT("PASS - Mail icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Mail icon is NOT displayed");
		}

/// Member Login - Password Entry - Text Box		

		OUTPUT("--- Checking Password Entry is Clickable and Populated ---");

		repo.pause(1000);

		if (repo.IsAvailableById(bind.password_Entry, "clickable") == true) {
			OUTPUT("PASS - Password Entry is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Password Entry is NOT Clickable");
		}

		expectedResult = "Password";

		if (repo.TextBoxCheckById(bind.password_Entry, expectedResult)) {
			OUTPUT("PASS - Text Box Contains Password");
		} else {
			OUTPUTFAIL("FAIL - Text Box Does NOT Contain Password");
		}

/// Member Login - Forgot Password Link

		OUTPUT("--- Checking Forgot Password is Enabled, Clickable and Populated ---");

		if (repo.IsEnabledClickableById(bind.forgot_Password) == true) {
			OUTPUT("PASS - Forgot Password Link is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Forgot Password Link is NOT Enabled & Clickable");
		}

		expectedResult = "Forgot password?";

		if (repo.TextBoxCheckById(bind.forgot_Password, expectedResult)) {
			OUTPUT("PASS - Forgot Password Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Forgot Password Text is Correct");
		}

/// Member Login - Login Button 

		OUTPUT("--- Checking Login Chevron Button is Disabled ---");

		repo.pause(1000);

		if (repo.IsAvailableById(bind.memberLogin_Button, "enabled") == false) {
			OUTPUT("PASS - Login Chevron Button is Disabled");
		} else {
			OUTPUTFAIL("FAIL - Login Chevron Button is NOT Disabled");
		}

/// Member Login - Login Text

		OUTPUT("--- Checking Login Text is Displayed ---");

		id = "uk.co.rac.roadside:id/login_form_button_text";
		expectedResult = "Log in";

		if (repo.TextBoxCheckById(id, expectedResult)) {
			OUTPUT("PASS - Log in Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Log in Password Text is Correct");
		}

/// Member Login - Don't Have A Password

		OUTPUT("--- Don't Have A Password is Enabled, Clickable and Populated ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.dont_Password) == true) {
			OUTPUT("PASS - Don't Have A Password Link is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Don't Have A Password Link is NOT Enabled & Clickable");
		}

		id = "uk.co.rac.roadside:id/login_form_button_need_login_text";
		expectedResult = "Don't have a password yet?";

		if (repo.TextBoxCheckById(id, expectedResult)) {
			OUTPUT("PASS - Don't Have A Password Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Don't Have A Password Text is Correct");
		}

// Member Login - Registered Email ID, Valid Password

		OUTPUT("--- Entering Registered Email ID, Valid Password ---");

		keyedInput = ("pregolivetest@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		OUTPUT("--- Checking Login Chevron Button is Enabled ---");

		if (repo.IsAvailableById(bind.memberLogin_Button, "enabled") == true) {
			OUTPUT("PASS - Login Chevron Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Login Chevron Button is NOT Enabled");
		}

		OUTPUT("--- Tapping Login Chevron Button ---");

		repo.LoginFailCheck();

		repo.pause(10000);

		repo.ratePopUpClickById();

		repo.pause(15000);

		repo.LogoutAttempt();

		repo.TriggerClickById(bind.login_BackButton);

		OUTPUT("***** COMPLETED - My Vehicles LOGGED OUT > MEMBER LOGIN PAGE TESTS*****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
