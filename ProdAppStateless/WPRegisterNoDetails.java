package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class WPRegisterNoDetails {

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
	public void wpmlDontHavePWTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING WELCOME PAGE > MEMBER LOGIN > DON'T HAVE PW PAGE [MYRAC REG] TESTS*****");

		repo.pause(10000);

		repo.pause(10000);
		repo.ratePopUpClickById();

////// Don't Have a Password? - Register Page Checks

		OUTPUT("--- Ensuring Login Button is displayed before proceeding ---");

		repo.ElementHuntWelcomeById(bind.login_Button);

		OUTPUT("--- Login Button is displayed proceeding with script ---");

		OUTPUT("--- Tapping Member Login ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(3000);

		OUTPUT("--- Tapping Don't have a password yet? ---");

		repo.TriggerClickById(bind.dont_Password);

// Title		  

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");
		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "-3-WelcomeRegistrationPage.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Checking Title Text ---");

		expectedResult = "REGISTER FOR MyRAC";

		if (repo.TextBoxCheckById(bind.toolbar_Title, expectedResult) == true) {
			OUTPUT("PASS - Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title Text is NOT Correct");
		}

// Text Boxes		       

		OUTPUT("--- Checking Top Text Box ---");

		expectedResult = "If you are an RAC member but do not have a username or password yet, please fill in the form below to activate your MyRAC account.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_TopText, expectedResult) == true) {
			OUTPUT("PASS - Text Start is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Start is NOT Correct");
		}

		OUTPUT("--- Checking Lower Text Box ---");

		expectedResult = "If you have any questions about MyRAC please give us a call";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_LowerText, expectedResult) == true) {
			OUTPUT("PASS - Text Start is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Start is NOT Correct");
		}

		expectedResult = "on";

		if (repo.TextBoxCheckById(bind.register_LowerTextTwo, expectedResult) == true) {
			OUTPUT("PASS - Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text is NOT Correct");
		}

		OUTPUT("--- Checking Phone Number is Enabled, Clickable and Correct ---");

// Phone Number				 

		if (repo.IsEnabledClickableById(bind.register_LowerTextNumber) == true) {
			OUTPUT("PASS - Phone Number is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Phone Number is NOT Enabled & Clickable");
		}

		if (repo.TextBoxCheckById(bind.register_LowerTextNumber, bind.phone_Number) == true) {
			OUTPUT("PASS - Phone Number is Correct");
		} else {
			OUTPUTFAIL("FAIL - Phone Number is NOT Correct");
		}

		/*
		 * OUTPUT("--- Tapping Telephone Number ---");
		 * 
		 * repo.TriggerClickById(bind.register_LowerTextNumber);
		 * 
		 * repo.pause(2000);
		 * 
		 * OUTPUT("--- Checking Call Options Offered---");
		 * 
		 * repo.pause(5000);
		 * 
		 * expectedResult = "Complete action using";
		 * 
		 * if (repo.TextBoxCheckById(bind.android_Title, expectedResult) == true) {
		 * OUTPUT("PASS - Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Text is NOT Correct"); }
		 * 
		 * OUTPUT("--- Tapping Phone Icon ---");
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickByXPath(bind.phone_IconXP);
		 * 
		 * OUTPUT("--- Checking Correct Telephone Number is Offered By Call Function ---"
		 * );
		 * 
		 * if (repo.TextBoxCheckById(bind.phone_NumberField, bind.phone_Number) == true)
		 * { OUTPUT("PASS - Phone Number is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Phone Number is NOT Correct"); }
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.dont_Password);
		 */
// Entry field - Membership number

		OUTPUT("--- Checking Membership Number Field ---");

		repo.pause(3000);

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView") == true) {
			OUTPUT("PASS - Membership Card Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Membership Card Icon is NOT Displayed");
		}

		if (repo.IsAvailableById(bind.register_MemberNumberInput, "clickable") == true) {
			OUTPUT("PASS - Membership number Field Is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Membership number Field Is NOT Clickable");
		}

		expectedResult = "Membership number";

		if (repo.TextBoxCheckById(bind.register_MemberNumberInput, expectedResult)) {
			OUTPUT("PASS - Membership number Is Displayed In Field");
		} else {
			OUTPUTFAIL("FAIL - Membership number Is NOT Displayed In Field");
		}

		id = "uk.co.rac.roadside:id/membership_description";
		expectedResult = "This is the small number at the very bottom of your RAC Membership card.";

		if (repo.TextBoxCheckIgnoreFormatById(id, expectedResult)) {
			OUTPUT("PASS - Text box start underneath Membership number field is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text box start underneath Membership number field is NOT Correct");
		}

// Entry field - Postcode

		OUTPUT("--- Checking Postcode Field ---");

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView") == true) {
			OUTPUT("PASS - Locator Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Locator Icon is NOT Displayed");
		}

		if (repo.IsAvailableById(bind.register_PostCodeInput, "clickable") == true) {
			OUTPUT("PASS - Postcode Field Is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Postcode Field Is NOT Clickable");
		}

		expectedResult = "Postcode";

		if (repo.TextBoxCheckById(bind.register_PostCodeInput, expectedResult)) {
			OUTPUT("PASS - Postcode Is Displayed In Field");
		} else {
			OUTPUTFAIL("FAIL - Postcode Is NOT Displayed In Field");
		}

// Entry field - First Name

		OUTPUT("--- Checking First Name Field ---");

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.ImageView") == true) {
			OUTPUT("PASS - 1st Person Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - 1st Person Icon is NOT Displayed");
		}

		if (repo.IsAvailableById(bind.register_FirstNameInput, "clickable") == true) {
			OUTPUT("PASS - First Name Field Is Clickable");
		} else {
			OUTPUTFAIL("FAIL - First Name Field Is NOT Clickable");
		}

		expectedResult = "First name";

		if (repo.TextBoxCheckById(bind.register_FirstNameInput, expectedResult)) {
			OUTPUT("PASS - First Name Is Displayed In Field");
		} else {
			OUTPUTFAIL("FAIL - First Name Is NOT Displayed In Field");
		}

		OUTPUT("--- Scrolling to Last name Entry ---");

		elementList = "uk.co.rac.roadside:id/register_scroll_view";
		elementClass = "android.widget.EditText";
		elementText = "Email";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

// Entry field - Last Name 	

		OUTPUT("--- Checking Last Name Field ---");

		/*
		 * if (repo.IsDisplayedByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
		 * == true) { OUTPUT("PASS - 2nd Person Icon is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - 2nd Person Icon is NOT Displayed"); }
		 */

		if (repo.IsAvailableById(bind.register_LastNameInput, "clickable") == true) {
			OUTPUT("PASS - Last Name Field Is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Last Name Field Is NOT Clickable");
		}

		expectedResult = "Last name";

		if (repo.TextBoxCheckById(bind.register_LastNameInput, expectedResult)) {
			OUTPUT("PASS - Last Name Is Displayed In Field");
		} else {
			OUTPUTFAIL("FAIL - Last Name Is NOT Displayed In Field");
		}

// Entry field - Email

		OUTPUT("--- Checking Email Field ---");

		/*
		 * if (repo.IsDisplayedByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
		 * == true) { OUTPUT("PASS - Mail Icon is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Mail Icon is NOT Displayed"); }
		 */

		if (repo.IsAvailableById(bind.register_EmailInput, "clickable") == true) {
			OUTPUT("PASS - Email Field Is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Email Field Is NOT Clickable");
		}

		expectedResult = "Email";

		if (repo.TextBoxCheckById(bind.register_EmailInput, expectedResult)) {
			OUTPUT("PASS - Email Is Displayed In Field");
		} else {
			OUTPUTFAIL("FAIL - Email Is NOT Displayed In Field");
		}

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementList = "uk.co.rac.roadside:id/register_scroll_view";
		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		expectedResult = "Choose a password for your MyRAC account.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_ChoosePWText, expectedResult))

		{
			OUTPUT("PASS - Choose PW Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Choose PW Text is NOT Correct");
		}

		/*
		 * if (repo.IsDisplayedByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
		 * == true) { OUTPUT("PASS - Lock Icon 1 is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Lock Icon 1 is NOT Displayed"); }
		 */

		expectedResult = "Password";

		if (repo.TextBoxCheckById(bind.register_PasswordInput, expectedResult)) {
			OUTPUT("PASS - PW Input Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - PW Input Text is NOT Correct");
		}

		/*
		 * if (repo.IsDisplayedByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.ImageView")
		 * == true) { OUTPUT("PASS - Lock Icon 2 is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Lock Icon 2 is NOT Displayed"); }
		 */

		expectedResult = "Re-enter Password";

		if (repo.TextBoxCheckById(bind.register_ConfirmPasswordInput, expectedResult)) {
			OUTPUT("PASS - Confirm PW Input Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Confirm PW Input Text is NOT Correct");
		}

		if (repo.IsAvailableById(bind.register_ChevronButton, "enabled") == false) {
			OUTPUT("PASS - Register Account Chevron Button is Disabled");
		} else {
			OUTPUTFAIL("FAIL - Register Account Chevron Button is NOT Disabled");
		}

		expectedResult = "REGISTER ACCOUNT";

		if (repo.TextBoxCheckById(bind.register_ChevronButton_Text, expectedResult)) {
			OUTPUT("PASS - Chevron Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Chevron Button Text is NOT Correct");
		}

		repo.Back();
		repo.pause(3000);
		repo.TriggerClickById(bind.login_BackButton);

		OUTPUT("***** COMPLETED WELCOME PAGE > MEMBER LOGIN > DON'T HAVE PW PAGE [MYRAC REG] TESTS*****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}