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


public class MyRACLoggedInLiveCover {

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
	public void MyRACLoggedInLiveTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("*************************************************** EXECUTING TEST SUITE C - LIVE MEMBER **************************************************");

		OUTPUT("*******************************************************************************************************************************************");

		OUTPUT("***** EXECUTING LOGGED IN - MYRAC PAGE TESTS - LIVE MEMBER *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_MyracXP);

		repo.Onboarding();

		// Logging into a Live MyRAC Member

		OUTPUT("--- Logging into a Live MyRAC Member ---");

		OUTPUT("--- MyRAC Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("devans@rac.co.uk");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Donotchange123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

		repo.ElementWaitById(bind.card_MemberCard);

		// MyRAC Logged In - Membership Overview - Cancelled Member

		OUTPUT("--- Checking Details on the Membership Card ---");

		if (repo.IsDisplayedById(bind.card_MemberCard)) {
			OUTPUT("PASS - Membership Card is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Membership Card is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.card_ChevronXP)) {
			OUTPUT("PASS - Membership Card Chevron is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Membership Card Chevron is Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.card_RacXP)) {
			OUTPUT("PASS - Membership Card RAC Logo is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Membership Card RAC Logo is Displayed");
		}

		expectedResult = "Mr Dean Evans";

		if (repo.TextBoxCheckIgnoreFormatById(bind.card_MemberName, expectedResult)) {
			OUTPUT("PASS - Member Name is Correct");
		} else {
			OUTPUTFAIL("FAIL - Member Name is NOT Correct");
		}

		expectedResult = "Membership no. 102666090811";

		if (repo.TextBoxCheckIgnoreFormatById(bind.card_MemberNumber, expectedResult)) {
			OUTPUT("PASS - Member Number is Correct");
		} else {
			OUTPUTFAIL("FAIL - Member Number is NOT Correct");
		}

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteCMyRACLiveMember/"
				+ todaysDate + "/" + todaysDate + "-MyRACLoggedInLive.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		OUTPUT("--- Checking Details underneath the Membership Card ---");

		expectedResult = "Mr Dean Evans";

		if (repo.TextBoxCheckIgnoreFormatById(bind.member_Name, expectedResult)) {
			OUTPUT("PASS - Member Name is Correct");
		} else {
			OUTPUTFAIL("FAIL - Member Name is NOT Correct");
		}

		expectedResult = "Membership number";

		if (repo.TextBoxCheckIgnoreFormatById(bind.member_NumberText, expectedResult)) {
			OUTPUT("PASS - Member Number Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Member Number Text is NOT Correct");
		}

		expectedResult = "102666090811";

		if (repo.TextBoxCheckIgnoreFormatById(bind.member_Number, expectedResult)) {
			OUTPUT("PASS - Member Number is Correct");
		} else {
			OUTPUTFAIL("FAIL - Member Number is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.personalDetails_Button) == true) {
			OUTPUT("PASS - Personal Details Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Personal Details Button is NOT Enabled & Clickable");
		}

		expectedResult = "PERSONAL DETAILS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.personalDetails_BText, expectedResult)) {
			OUTPUT("PASS - Personal Details Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Personal Details Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to Type Of Membership Section ---");

		elementList = "uk.co.rac.roadside:id/viewpager";
		elementClass = "android.widget.TextView";
		elementText = "Onward Travel";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("--- Checking Type Of Membership Section ---");

		expectedResult = "TYPE OF MEMBERSHIP";

		if (repo.TextBoxCheckIgnoreFormatById(bind.type_HeaderText, expectedResult)) {
			OUTPUT("PASS - Type Of Membership Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Type Of Membership Text  is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.type_BeneficiariesIconXP)) {
			OUTPUT("PASS - Beneficiary Type Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Beneficiary Type Icon is Displayed");
		}

		expectedResult = "Joint";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.type_BeneficiariesTextXP, expectedResult)) {
			OUTPUT("PASS - Beneficiary Type Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Beneficiary Type Text  is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.type_ProductOneIconXP)) {
			OUTPUT("PASS - Product One Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Product One Icon is Displayed");
		}

		expectedResult = "Roadside";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.type_ProductOneTextXP, expectedResult)) {
			OUTPUT("PASS - Product One Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Product One Text  is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.type_ProductTwoIconXP)) {
			OUTPUT("PASS - Product Two Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Product Two Icon is Displayed");
		}

		expectedResult = "At Home";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.type_ProductTwoTextXP, expectedResult)) {
			OUTPUT("PASS - Product Two Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Product Two Text  is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.type_ProductThreeIconXP)) {
			OUTPUT("PASS - Product Three Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Product Three Icon is Displayed");
		}

		expectedResult = "Recovery";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.type_ProductThreeTextXP, expectedResult)) {
			OUTPUT("PASS - Product Three Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Product Three Text  is NOT Correct");
		}

		if (repo.IsDisplayedByXPath(bind.type_ProductFourIconXP)) {
			OUTPUT("PASS - Product Four Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Product Four Icon is Displayed");
		}

		expectedResult = "Onward Travel";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.type_ProductFourTextXP, expectedResult)) {
			OUTPUT("PASS - Product Four Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Product Four Text  is NOT Correct");
		}

		OUTPUT("--- Scrolling to Breakdown Extras ---");

		elementText = "BREAKDOWN EXTRAS";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("--- Checking Breakdown Extras Section ---");

		expectedResult = "BREAKDOWN EXTRAS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.bdextras_HeaderText, expectedResult)) {
			OUTPUT("PASS - Breakdown Extras Header Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Breakdown Extras Header Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to COMPLIMENTARY EXTRAS ---");

		elementText = "COMPLIMENTARY EXTRAS";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		/*
		 * expectedResult =
		 * "We’re sorry, but because of a technical glitch at our end we couldn’t retrieve information about your Breakdown Extras at this time. We’re working to fix the problem."
		 * ;
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatById(bind.bdextras_NA, expectedResult)) {
		 * OUTPUT("PASS - Breakdown Extras Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Breakdown Extras Text is NOT Correct"); }
		 */

		OUTPUT("--- Checking Complimentary Extras Section ---");

		expectedResult = "COMPLIMENTARY EXTRAS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.compextras_HeaderText, expectedResult)) {
			OUTPUT("PASS - Complimentary Extras Header Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Complimentary Extras Header Text is NOT Correct");
		}

		OUTPUT("--- Scrolling to Legal Care ---");

		elementText = "Legal Care";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteCMyRACLiveMember/"
				+ todaysDate + "/" + todaysDate + "-MyRACLoggedInLiveBDExtras.jpg";
		repo.CaptureScreenshot(Filename2);

		/*
		 * if (repo.IsDisplayedByXPath(bind.compextras_AccidentCareIconXP)) {
		 * OUTPUT("PASS - Accident Care Icon is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Accident Care Icon is Displayed"); }
		 * 
		 * expectedResult = "Accident Care";
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatByXPath(bind.compextras_AccidentCareTextXP,
		 * expectedResult)) { OUTPUT("PASS - Accident Care Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Accident Care Text  is NOT Correct"); }
		 * 
		 * if (repo.IsDisplayedByXPath(bind.compextras_KeyReturnIconXP)) {
		 * OUTPUT("PASS - Key Return Icon is Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Key Return Icon is Displayed"); }
		 * 
		 * expectedResult = "Key Return";
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatByXPath(bind.compextras_KeyReturnTextXP,
		 * expectedResult)) { OUTPUT("PASS - Key Return Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Key Return Text  is NOT Correct"); }
		 */

		OUTPUT("--- Scrolling to View My Documents ---");

		elementText = "VIEW MY DOCUMENTS";

		repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

		try {

			if (repo.IsDisplayedByXPath(bind.compextras_LegalCareIconXP)) {
				OUTPUT("PASS - Legal Care Icon is Displayed");
			} else {
				OUTPUTFAIL("FAIL - Legal Care Icon is Displayed");
			}

		} catch (NoSuchElementException ignored) {
			System.err.println("*** Legal Care XPath not hit ***");
		} catch (StaleElementReferenceException ignored) {
			System.err.println("*** Legal Care XPath not hit ***");
		}

		try {

			expectedResult = "Legal Care";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.compextras_LegalCareTextXP, expectedResult)) {
				OUTPUT("PASS - Legal Care Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Legal Care Text  is NOT Correct");
			}
		} catch (NoSuchElementException ignored) {
			System.err.println("*** Legal Care XPath not hit ***");
		} catch (StaleElementReferenceException ignored) {
			System.err.println("*** Legal Care XPath not hit ***");
		}

		OUTPUT("--- Checking Page Bottom ---");

		expectedResult = "Membership expires:";

		if (repo.TextBoxCheckIgnoreFormatById(bind.expiry_Text, expectedResult)) {
			OUTPUT("PASS - Cancellation Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Cancellation Text  is NOT Correct");
		}

		expectedResult = "30/06/2019";

		if (repo.TextBoxCheckIgnoreFormatById(bind.expiry_Date, expectedResult)) {
			OUTPUT("PASS - Cancellation Date is Correct");
		} else {
			OUTPUTFAIL("FAIL - Cancellation Date is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.live_CalendarButton) == true) {
			OUTPUT("PASS - Calendar Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Calendar Button is NOT Enabled & Clickable");
		}

		expectedResult = "ADD TO CALENDAR";

		if (repo.TextBoxCheckIgnoreFormatById(bind.live_CalendarText, expectedResult)) {
			OUTPUT("PASS - Calendar Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Calendar Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.myracloggedin_CallRacButton) == true) {
			OUTPUT("PASS - Call RAC Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Call RAC is NOT Enabled & Clickable");
		}

		expectedResult = "CALL RAC";

		if (repo.TextBoxCheckIgnoreFormatById(bind.myracloggedin_CallRacText, expectedResult)) {
			OUTPUT("PASS - Call RAC Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Call RAC Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.myracloggedin_ViewDocsButton) == true) {
			OUTPUT("PASS - View Docs Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - View Docs is NOT Enabled & Clickable");
		}

		expectedResult = "VIEW MY DOCUMENTS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.myracloggedin_ViewDocsText, expectedResult)) {
			OUTPUT("PASS - View Docs Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - View Docs Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.myracloggedin_TCsButton) == true) {
			OUTPUT("PASS - T&Cs Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - T&Cs is NOT Enabled & Clickable");
		}

		expectedResult = "T&Cs";

		if (repo.TextBoxCheckIgnoreFormatById(bind.myracloggedin_TCsText, expectedResult)) {
			OUTPUT("PASS - T&Cs Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - T&Cs Docs Text is NOT Correct");
		}

		/*
		 * expectedResult =
		 * "You will be taken outside the app to view your documents and you will require your MyRAC username & password."
		 * ;
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatByXPath(bind.myrac_FooterTextXP,
		 * expectedResult)) { OUTPUT("PASS - Footer Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Footer Text is NOT Correct"); }
		 */

		OUTPUT("***** COMPLETED LOGGED IN - MYRAC PAGE TESTS - LIVE MEMBER *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
