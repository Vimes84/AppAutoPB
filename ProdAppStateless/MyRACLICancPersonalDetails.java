package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

@SuppressWarnings("unused")
public class MyRACLICancPersonalDetails {

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
	public void MyRACLoggedInCancelledTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING LOGGED IN - MYRAC PERSONAL DETAILS PAGE TESTS - CANCELLED MEMBER *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_MyracXP);

		repo.Onboarding();

		// Logging into a Cancelled MyRAC Member

		OUTPUT("--- Logging into a Cancelled MyRAC Member ---");

		OUTPUT("--- MyRAC Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("PREGOLIVETEST@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

		repo.pause(15000);

// MyRAC Logged In - Button Checks - Cancelled Member

		repo.pause(5000);

		OUTPUT("--- Scrolling to the Bottom of the MyRAC Overview Page ---");

		elementList = "uk.co.rac.roadside:id/viewpager";
		elementClass = "android.widget.TextView";
		elementText = "VIEW MY DOCUMENTS";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("--- Checking Buttons ---");

		repo.TriggerClickById(bind.cancelled_RenewButton);

		/* repo.TriggerClickByXPath(bind.phone_IconXP); */

		/*
		 * if (repo.TextBoxCheckById(bind.phone_NumberField, bind.phone_Number)) {
		 * OUTPUT("PASS - Phone number via Renew is correct"); } else {
		 * OUTPUTFAIL("FAIL - Phone number via Renew is NOT correct"); }
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(3000);
		 */

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.myracloggedin_CallRacButton);

		/* repo.TriggerClickByXPath(bind.phone_IconXP); */

		/*
		 * if (repo.TextBoxCheckById(bind.phone_NumberField, bind.phone_Number)) {
		 * OUTPUT("PASS - Phone number via Call RAC is correct"); } else {
		 * OUTPUTFAIL("FAIL - Phone number via Call RAC is NOT correct"); }
		 * 
		 * repo.Back();
		 * 
		 * repo.pause(3000);
		 */

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.myracloggedin_ViewDocsButton);

		expectedResult = "/myrac#/";

		if (repo.TextBoxEndsWithByXPath(bind.url_FieldXP, expectedResult)) {
			OUTPUT("PASS - URL Matches");
		} else {
			OUTPUTFAIL("FAIL - URL does not Match");
		}

		repo.Back();

		repo.pause(3000);

		repo.TriggerClickById(bind.myracloggedin_TCsButton);

		repo.pause(3000);

		expectedResult = "Terms & Conditions";

		if (repo.TextBoxCheckByxPath(bind.tandc_TitleXP, expectedResult)) {
			OUTPUT("PASS - Terms & Conditions is displayed");
		} else {
			OUTPUTFAIL("FAIL - Terms & Conditions is NOT displayed");
		}

		repo.Back();

		repo.pause(3000);

		OUTPUT("--- Scrolling to Personal Details ---");

		elementText = "Membership number";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		repo.TriggerClickById(bind.personalDetails_Button);

		repo.pause(3000);

		OUTPUT("--- Checking Personal Details ---");

		repo.TriggerClickById(bind.backButton);

		repo.pause(3000);

		repo.TriggerClickById(bind.personalDetails_Button);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteDMyRACCancelledMember/"
				+ todaysDate + "/" + todaysDate + "-MyRACLoggedInCancelledPersonalDetails.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		expectedResult = "PERSONAL DETAILS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - Personal Details Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Personal Details Title Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_NameIconXP)) {
			OUTPUT("PASS - Name Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Name Icon is Displayed");
		}

		expectedResult = "Mr Digital Testpregolive";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_NameText, expectedResult)) {
			OUTPUT("PASS - Name Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Name Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_NumberIconXP)) {
			OUTPUT("PASS - Number Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Number Icon is Displayed");
		}

		expectedResult = "Membership number 200110003614850";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_NumberText, expectedResult)) {
			OUTPUT("PASS - Number Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Number Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_DobIconXP)) {
			OUTPUT("PASS - Dob Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Dob Icon is Displayed");
		}

		expectedResult = "01/01/1955";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_DobText, expectedResult)) {
			OUTPUT("PASS - Dob Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Dob Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_AddressIconXP)) {
			OUTPUT("PASS - Address Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Address Icon is Displayed");
		}

		expectedResult = "Rac Great Park Road Bradley Stoke Bristol Avon BS32 4QN";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_AddressText, expectedResult)) {
			OUTPUT("PASS - Address Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Address Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_EmailIconXP)) {
			OUTPUT("PASS - Email Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Email Icon is Displayed");
		}

		expectedResult = "PREGOLIVETEST@mailinator.com";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_EmailText, expectedResult)) {
			OUTPUT("PASS - Email Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Email Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_PhoneIconXP)) {
			OUTPUT("PASS - Phone Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Phone Icon is Displayed");
		}

		expectedResult = "Mobile: Not provided";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_MobileText, expectedResult)) {
			OUTPUT("PASS - Mobile Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Mobile Text is NOT Correct");
		}

		expectedResult = "Home: 005555555555";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_HomeText, expectedResult)) {
			OUTPUT("PASS - Home Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Home Text is NOT Correct");
		}

		expectedResult = "Work: Not provided";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_WorkText, expectedResult)) {
			OUTPUT("PASS - Work Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Work Text is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.personal_AddIconXP)) {
			OUTPUT("PASS - Add Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Add Icon is Displayed");
		}

		expectedResult = "Mr Digital Testone";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personal_AddText, expectedResult)) {
			OUTPUT("PASS - Add Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Add Text is NOT Correct");
		}

		repo.Back();

		OUTPUT("***** COMPLETED LOGGED IN - MYRAC PERSONAL DETAILS PAGE TESTS - CANCELLED MEMBER *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}