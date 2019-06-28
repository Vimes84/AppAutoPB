package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;

@SuppressWarnings("unused")
public class WPRegister {

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

		OUTPUT("***** EXECUTING WELCOME PAGE > MEMBER LOGIN > REGISTRATION TESTS*****");

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

// Register Account Button - Incomplete Form

		OUTPUT("*** Register Account Button - Incomplete Form ***");

		OUTPUT("--- Intentionally Skipping - Membership Number Input ---");

		OUTPUT("--- Keying Post Code ---");

		keyedInput = "BS324QN";

		repo.SendKeysAndHideById(bind.register_PostCodeInput, keyedInput);

		OUTPUT("--- Keying First Name ---");

		keyedInput = "Brian";

		repo.SendKeysAndHideById(bind.register_FirstNameInput, keyedInput);

		OUTPUT("--- Scrolling to Last name Entry ---");

		elementList = "uk.co.rac.roadside:id/register_scroll_view";
		elementClass = "android.widget.EditText";
		elementText = "Email";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Last Name ---");

		keyedInput = "Blessed";

		repo.SendKeysAndHideById(bind.register_LastNameInput, keyedInput);

		OUTPUT("--- Keying Email Address ---");

		keyedInput = "brianblessed@mailinator.com";

		repo.SendKeysAndHideById(bind.register_EmailInput, keyedInput);

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Password ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		OUTPUT("--- Keying Password Confirmation ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		if (repo.IsAvailableById(bind.register_ChevronButton, "enabled") == false) {
			OUTPUT("PASS - Register Account Button is Disabled when Membership Number field is not populated");
		} else {
			OUTPUTFAIL("FAIL - Register Account Button is Enabled when Membership Number field is not populated");
		}

		OUTPUT("--- Scrolling back up to Membership Number Field ---");

		elementClass = "android.widget.EditText";
		elementText = "Membership number";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("--- Keying Membership Number ---");

		keyedInput = "1020195928495";

		repo.SendKeysAndHideById(bind.register_MemberNumberInput, keyedInput);

		OUTPUT("--- Clearing Post Code Field & Checking Register Account Button---");

		repo.ClearFieldByID(bind.register_PostCodeInput);

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		if (repo.IsAvailableById(bind.register_ChevronButton, "enabled") == false) {
			OUTPUT("PASS - Register Account Button is Disabled when Post Code field is not populated");
		} else {
			OUTPUTFAIL("FAIL - Register Account Button is Enabled when Post Code field is not populated");
		}

		OUTPUT("--- Scrolling back up to Post Code Field ---");

		elementClass = "android.widget.EditText";
		elementText = "Postcode";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("--- Keying Post Code ---");

		keyedInput = "BS324QN";

		repo.SendKeysAndHideById(bind.register_PostCodeInput, keyedInput);

		OUTPUT("--- Scrolling back down to Register Account and checking now Enabled ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		if (repo.IsAvailableById(bind.register_ChevronButton, "enabled") == true) {
			OUTPUT("PASS - Register Account Button is Enabled when all fields now populated");
		} else {
			OUTPUTFAIL("FAIL - Register Account Button is NOT Enabled when all fields now populated\"");
		}

		OUTPUT("--- Navigating back to the Welcome Page to make ready for next Registration ---");

		repo.Back();

		repo.pause(2000);

		repo.Back();

// Registration Attempt 1 - Invalid Details

		OUTPUT("--- Tapping Member Login ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(3000);

		OUTPUT("--- Tapping Don't have a password yet? ---");

		repo.TriggerClickById(bind.dont_Password);

		OUTPUT("*** Registration Attempt 1 - Invalid Details ***");

		OUTPUT("--- Keying Membership Number ---");

		keyedInput = "1020195928495";

		repo.SendKeysAndHideById(bind.register_MemberNumberInput, keyedInput);

		OUTPUT("--- Keying Post Code ---");

		keyedInput = "BS324QN";

		repo.SendKeysAndHideById(bind.register_PostCodeInput, keyedInput);

		OUTPUT("--- Keying First Name ---");

		keyedInput = "Brian";

		repo.SendKeysAndHideById(bind.register_FirstNameInput, keyedInput);

		OUTPUT("--- Scrolling to Last name Entry ---");

		elementClass = "android.widget.EditText";
		elementText = "Email";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Last Name ---");

		keyedInput = "Blessed";

		repo.SendKeysAndHideById(bind.register_LastNameInput, keyedInput);

		OUTPUT("--- Keying Email Address ---");

		keyedInput = "brianblessed@mailinator.com";

		repo.SendKeysAndHideById(bind.register_EmailInput, keyedInput);

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Password ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		OUTPUT("--- Keying Password Confirmation ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		OUTPUT("--- Tapping Register Account ---");

		repo.TriggerClickById(bind.register_ChevronButton);

		OUTPUT("--- Waiting for Error Message ---");

		repo.ElementWaitById(bind.register_TopError);

		if (repo.IsDisplayedById(bind.register_TopError) == true) {
			OUTPUT("PASS - Error Message Banner is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Error Message Banner is NOT Displayed");
		}

		expectedResult = "Some of your RAC information (membership no. or postcode) is incorrect. Please check it and try again.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_TopError, expectedResult)) {
			OUTPUT("PASS - Error Message Is Correct");
		} else {
			OUTPUTFAIL("FAIL - Error Message Is NOT Correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "RegAttempt1-InvalidDetails.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Navigating back to the Welcome Page to make ready for next Registration ---");

		repo.Back();

		repo.pause(2000);

		repo.Back();

// Registration Attempt 2 - Details Not Matching Drive - Member No'
// Existing UAT Membership with a missing digit in member number 20011000313891 (Actual - 200110003138918)

		OUTPUT("*** Registration Attempt 2 - Details Not Matching Drive - Membership No' ***");

		OUTPUT("--- Tapping Member Login ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(3000);

		OUTPUT("--- Tapping Don't have a password yet? ---");

		repo.TriggerClickById(bind.dont_Password);

		OUTPUT("--- Keying Membership Number ---");

		keyedInput = "20011000313891";

		repo.SendKeysAndHideById(bind.register_MemberNumberInput, keyedInput);

		OUTPUT("--- Keying Post Code ---");

		keyedInput = "BS324QN";

		repo.SendKeysAndHideById(bind.register_PostCodeInput, keyedInput);

		OUTPUT("--- Keying First Name ---");

		keyedInput = "Automation";

		repo.SendKeysAndHideById(bind.register_FirstNameInput, keyedInput);

		OUTPUT("--- Scrolling to Last name Entry ---");

		elementClass = "android.widget.EditText";
		elementText = "Email";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Last Name ---");

		keyedInput = "Test";

		repo.SendKeysAndHideById(bind.register_LastNameInput, keyedInput);

		OUTPUT("--- Keying Email Address ---");

		keyedInput = "automationtest@mailinator.com";

		repo.SendKeysAndHideById(bind.register_EmailInput, keyedInput);

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Password ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		OUTPUT("--- Keying Password Confirmation ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		OUTPUT("--- Tapping Register Account ---");

		repo.TriggerClickById(bind.register_ChevronButton);

		OUTPUT("--- Waiting for Error Message ---");

		repo.ElementWaitById(bind.register_TopError);

		if (repo.IsDisplayedById(bind.register_TopError) == true) {
			OUTPUT("PASS - Error Message Banner is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Error Message Banner is NOT Displayed");
		}

		expectedResult = "Some of your RAC information (membership no. or postcode) is incorrect. Please check it and try again.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_TopError, expectedResult)) {
			OUTPUT("PASS - Error Message Is Correct");
		} else {
			OUTPUTFAIL("FAIL - Error Message Is NOT Correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "RegAttempt2-NoMatch-MemberNo.jpg";
		repo.CaptureScreenshot(Filename2);

		OUTPUT("--- Navigating back to the Welcome Page to make ready for next Registration ---");

		repo.Back();

		repo.pause(2000);

		repo.Back();

// Registration Attempt 3 - Details Not Matching Drive - First Name
// Existing UAT Membership with an incorrect First Name "Fairy" (Actual - Automation)	

		OUTPUT("*** Registration Attempt 3 - Details Not Matching Drive - First Name ***");

		OUTPUT("--- Tapping Member Login ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(3000);

		OUTPUT("--- Tapping Don't have a password yet? ---");

		repo.TriggerClickById(bind.dont_Password);

		OUTPUT("--- Keying Membership Number ---");

		keyedInput = "200110003138918";

		repo.SendKeysAndHideById(bind.register_MemberNumberInput, keyedInput);

		OUTPUT("--- Keying Post Code ---");

		keyedInput = "BS324QN";

		repo.SendKeysAndHideById(bind.register_PostCodeInput, keyedInput);

		OUTPUT("--- Keying First Name ---");

		keyedInput = "Fairy";

		repo.SendKeysAndHideById(bind.register_FirstNameInput, keyedInput);

		OUTPUT("--- Scrolling to Last name Entry ---");

		elementClass = "android.widget.EditText";
		elementText = "Email";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Last Name ---");

		keyedInput = "Test";

		repo.SendKeysAndHideById(bind.register_LastNameInput, keyedInput);

		OUTPUT("--- Keying Email Address ---");

		keyedInput = "automationtest@mailinator.com";

		repo.SendKeysAndHideById(bind.register_EmailInput, keyedInput);

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.pause(3000);

		OUTPUT("--- Keying Password ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		OUTPUT("--- Keying Password Confirmation ---");

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		OUTPUT("--- Tapping Register Account ---");

		repo.TriggerClickById(bind.register_ChevronButton);

		OUTPUT("--- Waiting for Error Message ---");

		repo.ElementWaitById(bind.register_TopError);

		if (repo.IsDisplayedById(bind.register_TopError) == true) {
			OUTPUT("PASS - Error Message Banner is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Error Message Banner is NOT Displayed");
		}

		expectedResult = "Some of your RAC information (membership no. or postcode) is incorrect. Please check it and try again.";

		if (repo.TextBoxCheckIgnoreFormatById(bind.register_TopError, expectedResult)) {
			OUTPUT("PASS - Error Message Is Correct");
		} else {
			OUTPUTFAIL("FAIL - Error Message Is NOT Correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "RegAttempt3-NoMatch-FirstName.jpg";
		repo.CaptureScreenshot(Filename3);

		OUTPUT("--- Inserting Correct First Name ---");

		elementClass = "android.widget.EditText";
		elementText = "Fairy";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.ClearFieldByID(bind.register_FirstNameInput);

		keyedInput = "Automation";

		repo.SendKeysAndHideById(bind.register_FirstNameInput, keyedInput);

		// Registration Attempt 4 - Password Mismatch

		OUTPUT("*** Registration Attempt 4 - Password Mismatch ***");

		OUTPUT("--- Scrolling to Page Bottom ---");

		elementClass = "android.widget.TextView";
		elementText = "REGISTER ACCOUNT";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		keyedInput = "Test@123";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		keyedInput = "Test@1234";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		OUTPUT("--- Tapping Register Account ---");

		repo.TriggerClickById(bind.register_ChevronButton);

		OUTPUT("--- Waiting for Error Message ---");

		repo.ElementWaitById(bind.register_PWError);

		expectedResult = "The passwords do not match";

		if (repo.TextBoxCheckById(bind.register_PWError, expectedResult)) {
			OUTPUT("PASS - PW Error Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - PW Error Message is NOT Correct");
		}

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "RegAttempt4-PWMismatch.jpg";
		repo.CaptureScreenshot(Filename4);

		// Registration Attempt 5 - Incorrect Password Format

		OUTPUT("*** Registration Attempt 5 - Incorrect Password Format ***");

		repo.ClearFieldByID(bind.register_PasswordInput);

		repo.ClearFieldByID(bind.register_ConfirmPasswordInput);

		keyedInput = "Test";

		repo.SendKeysAndHideById(bind.register_PasswordInput, keyedInput);

		keyedInput = "Test";

		repo.SendKeysAndHideById(bind.register_ConfirmPasswordInput, keyedInput);

		OUTPUT("--- Tapping Register Account ---");

		repo.TriggerClickById(bind.register_ChevronButton);

		OUTPUT("--- Waiting for Error Message ---");

		repo.ElementWaitById(bind.register_PWError);

		expectedResult = "Password needs to be at least 8";

		if (repo.TextBoxStartsWithById(bind.register_PWError, expectedResult)) {
			OUTPUT("PASS - PW Error Message is Correct");
		} else {
			OUTPUTFAIL("FAIL - PW Error Message is NOT Correct");
		}

		String Filename5 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "RegAttempt5-PWIncorrectFormat.jpg";
		repo.CaptureScreenshot(Filename5);

		OUTPUT("--- Navigating back to the Welcome Page to make ready for next Registration ---");

		repo.Back();

		repo.pause(2000);

		repo.Back();

		OUTPUT("***** COMPLETED WELCOME PAGE > MEMBER LOGIN > REGISTRATION TESTS*****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}