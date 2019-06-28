package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

/*import org.omg.CORBA.RepositoryIdHelper;
import io.appium.java_client.MobileBy;*/

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WPMLlForgotPWTest {

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
	public void wpmlForgotPWTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING WELCOME PAGE > MEMBER LOGIN > FORGOT PW PAGE TESTS*****");

		repo.pause(10000);

		repo.pause(10000);
		repo.ratePopUpClickById();

///// Member Login - Forgotten Password Screen

		OUTPUT("--- Ensuring Login Button is displayed before proceeding ---");

		repo.ElementHuntWelcomeById(bind.login_Button);

		OUTPUT("--- Login Button is displayed proceeding with script ---");

		OUTPUT("--- Tapping Member Login ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(3000);

		OUTPUT("--- Tapping Don't have a password yet? ---");

		repo.TriggerClickById(bind.forgot_Password);

		repo.pause(1000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteAWelcome/"
				+ todaysDate + "/" + todaysDate + "-4-Welcome-ForgotPWPage.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Checking Back button is Enabled and Clickable ---");

		repo.pause(1000);

		if (repo.IsEnabledClickableById(bind.forgotPW_BackButton) == true) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

		OUTPUT("--- Checking Forgotten Password Form is Displayed ---");

		repo.pause(1000);

		if (repo.IsDisplayedById("uk.co.rac.roadside:id/forgot_password_form_container")) {
			OUTPUT("PASS - RAC Logo Is Displayed");
		} else {
			OUTPUTFAIL("FAIL - RAC Logo Is NOT Displayed");
		}

		OUTPUT("--- Checking Text Box is Correct ---");

		expectedResult = "Forgotten your password? Enter your MyRAC email address and we'll send you a reset link";

		if (repo.TextBoxCheckIgnoreFormatById(bind.forgotPW_TextBox, expectedResult)) {
			OUTPUT("PASS - Text Box Start is Correct");
		} else {
			OUTPUTFAIL("FAIL - Text Box Start is NOT Correct");
		}

		OUTPUT("--- Checking Mail icon is Displayed ---");

		repo.pause(1000);

		if (repo.IsDisplayedByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView")) {
			OUTPUT("PASS - Mail icon is displayed");
		} else {
			OUTPUTFAIL("FAIL - Mail icon is NOT displayed");
		}

		OUTPUT("--- Checking Email Entry is Clickable and Populated ---");

		repo.pause(1000);

		if (repo.IsAvailableById(bind.forgotPW_EmailEntry, "clickable") == true) {
			OUTPUT("PASS - Email Entry is Clickable");
		} else {
			OUTPUTFAIL("FAIL - Email Entry is NOT Clickable");
		}

		expectedResult = "Email";

		if (repo.TextBoxCheckById(bind.forgotPW_EmailEntry, expectedResult)) {
			OUTPUT("PASS - Text Box Contains Email");
		} else {
			OUTPUTFAIL("FAIL - Text Box Does NOT Contain Email");
		}

		OUTPUT("--- Checking Send Chevron Button is Disabled ---");

		if (repo.IsAvailableById(bind.forgotPW_SendButton, "enabled") == false) {
			OUTPUT("PASS - Send Chevron Button is Disabled");
		} else {
			OUTPUTFAIL("FAIL - Send Chevron Button is NOT Disabled");
		}

		OUTPUT("--- Checking Send Button Text ---");

		expectedResult = "SEND";

		if (repo.TextBoxCheckById(bind.forgotPW_ButtonText, expectedResult)) {
			OUTPUT("PASS - Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Button Text is NOT Correct");
		}

///// Forgot Password - Entering Invalid Email Address

		OUTPUT("--- Entering Invalid Email Address ---");

		keyedInput = "noatsymbolmailinator.com";

		repo.SendKeysById(bind.forgotPW_EmailEntry, keyedInput);

		if (repo.IsAvailableById(bind.forgotPW_SendButton, "enabled") == true) {
			OUTPUT("PASS - Send Chevron Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Send Chevron Button is NOT Enabled");
		}

		OUTPUT("--- Tapping Send Button ---");

		repo.TriggerClickById(bind.forgotPW_SendButton);

		OUTPUT("--- Checking Error Message is Displayed ---");

		repo.pause(2000);

		try {

			if (repo.IsDisplayedById(bind.error_MessageContainer)) {
				OUTPUT("PASS - Red Banner is Displayed");
			} else {
				OUTPUTFAIL("FAIL - Red Banner is NOT Displayed");
			}

			expectedResult = "Could not find that account. Please try again with correct email address.";

			if (repo.TextBoxCheckIgnoreFormatById(bind.error_Message, expectedResult) == true) {
				OUTPUT("PASS - Error Text Start is Correct");
			} else {
				OUTPUTFAIL("FAIL - Error Text Start is NOT Correct");
			}

		} catch (NoSuchElementException ignored) {

			OUTPUTFAIL("FAIL - Unable to verify logon error message.");

		}

		/*
		 * expectedResult = "Please try again with correct email address.";
		 * 
		 * if (repo.TextBoxEndsWithById(bind.error_Message, expectedResult) == true) {
		 * OUTPUT("PASS - Error Text End is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Error Text End is NOT Correct"); }
		 */

		OUTPUT("--- Checking Send Button Text Changes to Try Again---");

		expectedResult = "TRY AGAIN";

		if (repo.TextBoxCheckById(bind.forgotPW_ButtonText, expectedResult)) {
			OUTPUT("PASS - Button Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Button Text is NOT Correct");
		}

		repo.ClearFieldByID(bind.forgotPW_EmailEntry);

///// Forgot Password - Entering Valid Email Not Registered

		repo.pause(1000);

		OUTPUT("--- Entering Valid Email Not Registered ---");

		keyedInput = "UnregisteredAppUser@mailinator.com";

		repo.SendKeysById(bind.forgotPW_EmailEntry, keyedInput);

		if (repo.IsAvailableById(bind.forgotPW_SendButton, "enabled") == true) {
			OUTPUT("PASS - Send Chevron Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Send Chevron Button is NOT Enabled");
		}

		OUTPUT("--- Tapping Send Button ---");

		repo.TriggerClickById(bind.forgotPW_SendButton);

		OUTPUT("--- Checking Error Message is Displayed ---");

		repo.pause(2000);

		try {

			if (repo.IsDisplayedById(bind.error_MessageContainer)) {
				OUTPUT("PASS - Red Banner is Displayed");
			} else {
				OUTPUTFAIL("FAIL - Red Banner is NOT Displayed");
			}

			expectedResult = "Could not find that account. Please try again with correct email address.";

			if (repo.TextBoxCheckIgnoreFormatById(bind.error_Message, expectedResult) == true) {
				OUTPUT("PASS - Error Text Start is Correct");
			} else {
				OUTPUTFAIL("FAIL - Error Text Start is NOT Correct");
			}

		} catch (NoSuchElementException ignored) {
			OUTPUTFAIL("FAIL - Unable to verify logon error message.");
		}

		/*
		 * expectedResult = "Please try again with correct email address.";
		 * 
		 * if (repo.TextBoxEndsWithById(bind.error_Message, expectedResult) == true) {
		 * OUTPUT("PASS - Error Text End is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Error Text End is NOT Correct"); }
		 */
		///// Forgot Password - Entering Valid Email

		repo.pause(1000);

		OUTPUT("--- Entering Valid Email ---");

		keyedInput = "PREGOLIVETEST@mailinator.com";

		repo.SendKeysById(bind.forgotPW_EmailEntry, keyedInput);

		if (repo.IsAvailableById(bind.forgotPW_SendButton, "enabled") == true) {
			OUTPUT("PASS - Send Chevron Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Send Chevron Button is NOT Enabled");
		}

		OUTPUT("--- Tapping Send Button ---");

		repo.TriggerClickById(bind.forgotPW_SendButton);

		repo.pause(4000);

		OUTPUT("--- Checking Text Box is Correct ---");

		repo.ElementWaitById(bind.forgotPW_SuccessText);

		try {

			expectedResult = "A reset link has been sent to your email address.";

			if (repo.TextBoxCheckIgnoreFormatById(bind.forgotPW_SuccessText, expectedResult) == true) {
				OUTPUT("PASS - Success Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Success Text is NOT Correct");
			}

		} catch (NoSuchElementException ignored) {
			OUTPUTFAIL("FAIL - Unable to verify error message.");
		}

		/*
		 * expectedResult = "your email address.";
		 * 
		 * if (repo.TextBoxEndsWithById(bind.forgotPW_SuccessText, expectedResult) ==
		 * true) { OUTPUT("PASS - Success Text End is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Success Text End is NOT Correct"); }
		 */

		OUTPUT("--- Checking Continue Button ---");

		if (repo.IsAvailableById(bind.forgotPW_SendButton, "enabled") == true) {
			OUTPUT("PASS - Continue Chevron Button is Enabled");
		} else {
			OUTPUTFAIL("FAIL - Continue Chevron Button is NOT Enabled");
		}

		expectedResult = "CONTINUE";

		if (repo.TextBoxCheckById(bind.forgotPW_ButtonText, expectedResult) == true) {
			OUTPUT("PASS - Error Text End is Correct");
		} else {
			OUTPUTFAIL("FAIL - Error Text End is NOT Correct");
		}

		OUTPUT("--- Tapping Continue Button ---");

		repo.TriggerClickById(bind.forgotPW_SendButton);

		OUTPUT("--- Checking Member Login is Displayed ---");

		if (repo.IsDisplayedById("uk.co.rac.roadside:id/form_container")) {
			OUTPUT("PASS - Member Login is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Member Login Is NOT Displayed");
		}

		repo.pause(2000);
		repo.TriggerClickById(bind.login_BackButton);

		repo.pause(3000);

		/*
		 * repo.TriggerClickById(skip_Button);
		 * 
		 * repo.pause(3000);
		 * 
		 * repo.TriggerClickById(bind.androidAllow);
		 */

		OUTPUT("***** COMPLETED WELCOME PAGE > MEMBER LOGIN > FORGOT PW PAGE TESTS*****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}