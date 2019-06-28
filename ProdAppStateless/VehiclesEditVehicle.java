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


public class VehiclesEditVehicle {

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

	public void appMyVehiclesEditVehicleTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - EDIT VEHICLE - MY VEHICLES PAGE TESTS *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.Onboarding();

		// Logging into MyRAC Account with 1 Added Vehicle

		OUTPUT("--- Logging into MyRAC Account with 1 Added Vehicle ---");

		OUTPUT("--- My Vehicles Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("PREGOLIVETEST@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

		repo.pause(10000);

// Editing the added Vehicle

		repo.pause(6000);

		repo.TriggerClickById(bind.addedVehicle_Name);

		repo.pause(4000);

		repo.TriggerClickById(bind.addedVehicle_Edit);

		repo.TriggerClickById(bind.vehicleImage_DefaultImage);

		repo.TriggerClickById(bind.permission_Allow);

		repo.pause(2000);

		repo.TriggerClickById(bind.popUp_CentreButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.vehicleImage_DefaultImage);

		try {
			repo.TriggerClickById(bind.popUp_CentreButton);
		} catch (NoSuchElementException ignored) {
			System.out.println("*** Delete button is not displayed ***");
		} catch (StaleElementReferenceException ignored) {
			System.out.println("*** Delete button is not displayed ***");
		}

		OUTPUT("*** Amending Vehicle Details ***");

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.ClearFieldByID(bind.vehicleName_Entry);

		keyedInput = "CHANGE NAME";

		repo.SendKeysById(bind.vehicleName_Entry, keyedInput);

		repo.ClearFieldByID(bind.vehicleReg_Entry);

		keyedInput = "R3GCH4NG3";

		repo.SendKeysById(bind.vehicleReg_Entry, keyedInput);

		repo.ClearFieldByID(bind.vehicleMake_Entry);

		OUTPUT("*** Still Amending Vehicle Details ***");

		keyedInput = "CMAKE";

		repo.SendKeysById(bind.vehicleMake_Entry, keyedInput);

		repo.ClearFieldByID(bind.vehicleModel_Entry);

		keyedInput = "CModel";

		repo.SendKeysById(bind.vehicleModel_Entry, keyedInput);

		repo.TriggerClickById(bind.editVehicle_Done);

		repo.pause(3000);

// Editing a Vehicle - MY VEHICLE - EDITED VEHICLE

		OUTPUT("--- Checking MY VEHICLE - Edited Vehicle Details ---");

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-91-MyVehiclesEditedVehicle.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		expectedResult = "MY VEHICLE";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - My Vehicle Header Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - My Vehicle Header Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.addedVehicle_Delete) == true) {
			OUTPUT("PASS - Delete Vehicle Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Delete Vehicle Button is Not Enabled & Clickable");
		}

		if (repo.IsEnabledClickableById(bind.addedVehicle_Edit) == true) {
			OUTPUT("PASS - Edit Vehicle Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Edit Vehicle Button is Not Enabled & Clickable");
		}

		expectedResult = "NOT COVERED";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_CoverStatus, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Cover Status is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Cover Status is Correct");
		}

		expectedResult = "CMAKE CMODEL";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_MakePlusModel, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Make & Model Are Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Make & Model Are NOT Correct");
		}

		expectedResult = "R3GCH4NG3";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Reg, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Reg is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Reg is Correct");
		}

		expectedResult = "CHANGE NAME";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Name, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Name is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Name is NOT Correct");
		}

		expectedResult = "NOT COVERED";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_CoverStatus, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Cover Status is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Cover Status is NOT Correct");
		}

// Editing a Vehicle - MY VEHICLES - EDITED VEHICLE CHECKS

		repo.Back();

		repo.pause(3000);

		OUTPUT("--- Checking MY VEHICLES - Edited Vehicle Details ---");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-92-MyVehiclesEditedVehicle2.jpg";
		repo.CaptureScreenshot(Filename2);

		expectedResult = "MY VEHICLES";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - My Vehicles Header Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - My Vehicles Header Text is NOT Correct");
		}

		expectedResult = "VEHICLES NOT COVERED BY THE RAC";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicle_NotCovered, expectedResult)) {
			OUTPUT("PASS - Vehicles Not Covered by The RAC Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Vehicles Not Covered by The RAC Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.vehicleCover_Info) == true) {
			OUTPUT("PASS - Info Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Info Button is Not Enabled & Clickable");
		}

		if (repo.IsDisplayedById(bind.addedVehicle_Photo) == true) {
			OUTPUT("PASS - Added Vehicle Photo Is Displayed Displayed");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Photo Is NOT Displayed");
		}

		expectedResult = "CMAKE CMODEL";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Make, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Make & Model Are Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Make & Model Are NOT Correct");
		}

		expectedResult = "R3GCH4NG3";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Reg, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Reg is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Reg is Correct");
		}

		expectedResult = "CHANGE NAME";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Name, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Name is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Name is NOT Correct");
		}

		expectedResult = "NOT COVERED";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_CoverStatus, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Cover Status is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Cover Status is Correct");
		}

		OUTPUT("***** COMPLETED - EDIT VEHICLE - MY VEHICLES PAGE TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
