package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class VehiclesAddVehicle {

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

	public void appMyVehiclesAddVehicleTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - ADD VEHICLE - MY VEHICLES PAGE TESTS *****");

		repo.LaunchStatelessAllowAll();

		repo.TabSwitch(bind.appmenu_VehiclesXP);

		repo.Onboarding();

// Logging into MyRAC Account with NO Added Vehicles

		OUTPUT("--- Logging into MyRAC Account with NO Added Vehicles ---");

		OUTPUT("--- My Vehicles Page Loaded ---");

		repo.TriggerClickById(bind.login_Button);

		repo.pause(2000);

		keyedInput = ("PREGOLIVETEST@mailinator.com");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Test@123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		repo.LoginFailCheck();

// Adding a Vehicle - ADDING A VEHICLE IN THE APP Pop Up Checks

		OUTPUT("--- Tapping Add Vehicle and Checking ADDING A VEHICLE IN THE APP Pop up ---");

		repo.pause(10000);

		repo.TriggerClickById(bind.addVehicle_Button);

		repo.pause(1000);

		expectedResult = "ADDING A VEHICLE IN THE APP";

		if (repo.TextBoxCheckById(bind.popUp_Title, expectedResult)) {
			OUTPUT("PASS - Pop up Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Pop up Title Text is NOT Correct");
		}

		/*
		 * expectedResult =
		 * "Adding a vehicle via the app does not yet add it to your RAC membership." +
		 * "Please call us if you would like to add a vehicle to your membership.";
		 * 
		 * if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Message, expectedResult)) {
		 * OUTPUT("PASS - Pop up Message Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Pop up Message Text is NOT Correct"); }
		 */
		expectedResult = "CLOSE";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_LeftButton, expectedResult)) {
			OUTPUT("PASS - Pop up Close Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Pop up Close Text is NOT Correct");
		}

		expectedResult = "CALL RAC";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_CentreButton, expectedResult)) {
			OUTPUT("PASS - Pop up Call RAC Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Pop up Call RAC Text is NOT Correct");
		}

		expectedResult = "ADD VEHICLE";

		if (repo.TextBoxCheckById(bind.popUp_RightButton, expectedResult)) {
			OUTPUT("PASS - Pop up Add Vehicle Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Pop up Add Vehicle Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.popUp_LeftButton) == true) {
			OUTPUT("PASS - Pop Up Left Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Pop Up Left Button is Not Enabled & Clickable");
		}

//	        repo.TriggerClickById(bind.popUp_CentreButton);
//	        
//	        repo.TriggerClickByXPath(bind.phone_IconXP);
//	        
//	        if (repo.TextBoxCheckById(bind.phone_NumberField, bind.phone_Number))
//	        {
//	        	OUTPUT("PASS - Telephone Number is Correct");
//	        }
//	        else
//	        {
//	        	OUTPUTFAIL("FAIL - Telephone Number is NOT Correct");
//	        }
//	        
//	        repo.Back();
//	        
//	        repo.Back();

		if (repo.IsEnabledClickableById(bind.popUp_CentreButton) == true) {
			OUTPUT("PASS - Pop Up Centre Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Pop Up Centre Button is Not Enabled & Clickable");
		}

		repo.TriggerClickById(bind.popUp_RightButton);

		repo.pause(2000);

// Adding a Vehicle - ADD MY VEHICLE Page Checks

		OUTPUT("--- ADD MY VEHICLE Page Checks ---");

		repo.TriggerClickById(bind.backButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.addVehicle_Button);

		OUTPUT("--- Checking if the Pop up is displayed again ---");

		repo.addVehiclePopUpCheck(bind.popUp_Title);

		repo.pause(2000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-6-MyVehiclesAddVehicleBlank.jpg";
		repo.CaptureScreenshot(Filename);

		repo.pause(1000);

		OUTPUT("--- Checking Title Bar ---");

		expectedResult = "ADD MY VEHICLE";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title Text is NOT Correct");
		}

		if (repo.IsAvailableById(bind.acceptButton, "clickable") == false) {
			OUTPUT("PASS - Accept Button is Not Enabled");
		} else {
			OUTPUTFAIL("FAIL - Accept Button is Enabled");
		}

		OUTPUT("--- Checking Vehicle Image ---");

		if (repo.IsDisplayedById(bind.vehicleImage_GreenCircle) == true) {
			OUTPUT("PASS - Green Circle is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Green Circle is NOT Displayed");
		}

		if (repo.IsDisplayedById(bind.vehicleImage_DefaultImage) == true) {
			OUTPUT("PASS - Default Image within Circle is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Default Image within Circle is NOT Displayed");
		}

		expectedResult = "Tap to edit";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicleImage_TapToEditText, expectedResult)) {
			OUTPUT("PASS - Tap to edit text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Tap to edit text is NOT Correct");
		}

		OUTPUT("--- Checking Entry field Icons ---");

		if (repo.IsDisplayedByXPath(bind.vehicleName_IconXP) == true) {
			OUTPUT("PASS - Vehicle Name Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Name Icon is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.vehicleReg_IconXP) == true) {
			OUTPUT("PASS - Vehicle Reg Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Reg Icon is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.vehicleMake_IconXP) == true) {
			OUTPUT("PASS - Vehicle Make Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Make Icon is NOT Displayed");
		}

		if (repo.IsDisplayedByXPath(bind.vehicleModel_IconXP) == true) {
			OUTPUT("PASS - Vehicle Model Icon is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Vehicle Model Icon is NOT Displayed");
		}

		OUTPUT("--- Checking Entry fields Pre-Data Entry ---");

		expectedResult = "Give your vehicle a name";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicleName_Entry, expectedResult)) {
			OUTPUT("PASS - Name Entry Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Name Entry Text is NOT Correct");
		}

		expectedResult = "Registration number";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicleReg_Entry, expectedResult)) {
			OUTPUT("PASS - Registration Entry Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Registration Entry Text is NOT Correct");
		}

		expectedResult = "Make";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicleMake_Entry, expectedResult)) {
			OUTPUT("PASS - Make Entry Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Make Entry Text is NOT Correct");
		}

		expectedResult = "Model";

		if (repo.TextBoxCheckIgnoreFormatById(bind.vehicleModel_Entry, expectedResult)) {
			OUTPUT("PASS - Model Entry Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Model Entry Text is NOT Correct");
		}

// Adding a Vehicle - ADD A VEHICLE - ADD A PICTURE

		repo.TriggerClickById(bind.vehicleImage_TapToEditText);

		repo.pause(2000);

		repo.TriggerClickById(bind.permission_Deny);

		repo.pause(2000);

		repo.TriggerClickById(bind.vehicleImage_TapToEditText);

		if (repo.IsDisplayedById(bind.permission_StopBuggingMe) == true) {
			OUTPUT("PASS - Don't Ask Again is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Don't Ask Again is NOT Displayed");
		}

		repo.TriggerClickById(bind.permission_StopBuggingMe);

		repo.pause(1000);

		if (repo.IsAvailableById(bind.permission_Allow, "enabled") == false) {
			OUTPUT("PASS - Allow Button is Disabled When Tick Box is Selected");
		} else {
			OUTPUTFAIL("FAIL - Allow Button is NOT Disabled When Tick Box is Selected");
		}

		repo.TriggerClickById(bind.permission_StopBuggingMe);

		repo.pause(1000);

		repo.TriggerClickById(bind.permission_Allow);

		OUTPUT("--- Checking Add a Picture Modal ---");

		expectedResult = "ADD A PICTURE";

		if (repo.TextBoxCheckIgnoreFormatById(bind.popUp_Title, expectedResult)) {
			OUTPUT("PASS - Pop Up Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Pop UP Title is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.photo_Button) == true) {
			OUTPUT("PASS - Take a Photo Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Take a Photo Left Button is Not Enabled & Clickable");
		}

		expectedResult = "TAKE A PHOTO";

		if (repo.TextBoxCheckIgnoreFormatById(bind.photo_Text, expectedResult)) {
			OUTPUT("PASS - Take a Photo Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Take a Photo Text is NOT Correct");
		}

		if (repo.IsEnabledClickableById(bind.library_Button) == true) {
			OUTPUT("PASS - Library Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Library Left Button is Not Enabled & Clickable");
		}

		expectedResult = "CHOOSE FROM LIBRARY";

		if (repo.TextBoxCheckIgnoreFormatById(bind.library_Text, expectedResult)) {
			OUTPUT("PASS - Library Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Library Text is NOT Correct");
		}

		/*
		 * repo.TriggerClickById(bind.photo_Button);
		 * 
		 * repo.TriggerClickByName("shutter");
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.photo_OK);
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.vehicleImage_TapToEditText);
		 */

		/*
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.popUp_CentreButton);
		 * 
		 * repo.pause(2000);
		 */

		/* repo.TriggerClickById(bind.vehicleImage_TapToEditText); */

		repo.TriggerClickById(bind.library_Button);

		repo.pause(3000);

		repo.TriggerClickByXPath(bind.library_FirstPictureXP);

		repo.pause(3000);

// Adding a Vehicle - ADD A VEHICLE - ADDING VEHICLE DETAILS	        

		OUTPUT("--- Adding Vehicle Details ---");

		repo.TriggerClickById(bind.vehicleName_Entry);

		keyedInput = "Test Vehicle";

		repo.SendKeysById(bind.vehicleName_Entry, keyedInput);

		if (repo.IsAvailableById(bind.acceptButton, "enabled") == false) {
			OUTPUT("PASS - Accept Button is Not Enabled with 1 field populated");
		} else {
			OUTPUTFAIL("FAIL - Accept Button is Enabled with 1 field populated");
		}

		repo.TriggerClickById(bind.vehicleReg_Entry);

		keyedInput = "RK55UTZ";

		repo.SendKeysById(bind.vehicleReg_Entry, keyedInput);

		if (repo.IsAvailableById(bind.acceptButton, "enabled") == false) {
			OUTPUT("PASS - Accept Button is Not Enabled with 2 fields populated");
		} else {
			OUTPUTFAIL("FAIL - Accept Button is Enabled with 2 fields populated");
		}

		repo.TriggerClickById(bind.vehicleMake_Entry);

		keyedInput = "Toyota";

		repo.SendKeysById(bind.vehicleMake_Entry, keyedInput);

		if (repo.IsAvailableById(bind.acceptButton, "enabled") == false) {
			OUTPUT("PASS - Accept Button is Not Enabled with 3 fields populated");
		} else {
			OUTPUTFAIL("FAIL - Accept Button is Enabled with 3 fields populated");
		}

		repo.TriggerClickById(bind.vehicleModel_Entry);

		keyedInput = "Yaris";

		repo.SendKeysById(bind.vehicleModel_Entry, keyedInput);

		repo.pause(3000);
		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-7-MyVehiclesAddVehicleFilled.jpg";
		repo.CaptureScreenshot(Filename2);

		repo.pause(3000);

		if (repo.IsAvailableById(bind.acceptButton, "enabled") == true) {
			OUTPUT("PASS - Accept Button is Enabled");
			repo.TriggerClickById(bind.acceptButton);
		} else {
			OUTPUTFAIL("FAIL - Accept Button is NOT Enabled");
		}

// Adding a Vehicle - MY VEHICLES - ADDED VEHICLE CHECKS

		OUTPUT("--- Checking Added Vehicle Details ---");

		repo.pause(6000);

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-8-MyVehiclesFilled.jpg";
		repo.CaptureScreenshot(Filename3);

		repo.pause(3000);

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
			OUTPUT("FAIl - Vehicles Not Covered by The RAC Text is NOT Correct");
		}

		if (repo.IsDisplayedById(bind.addedVehicle_Photo) == true) {
			OUTPUT("PASS - Added Vehicle Photo Is Displayed Displayed");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Photo Is NOT Displayed");
		}

		expectedResult = "TOYOTA YARIS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_MakeModel, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Make & Model Are Correct");
		} else {
			OUTPUT("FAIL - Added Vehicle Make & Model Are NOT Correct");
		}

		expectedResult = "RK55UTZ";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Reg, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Reg is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Reg is Correct");
		}

		expectedResult = "Test Vehicle";

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

// Adding a Vehicle - MY VEHICLES - ADDED VEHICLE PAGE

		OUTPUT("--- Clicking on Added Vehicle ---");

		repo.TriggerClickByXPath(bind.addedVehicle_ContainerXP);

		repo.TriggerClickById(bind.backButton);

		repo.pause(3000);

		repo.TriggerClickByXPath(bind.addedVehicle_ContainerXP);

		repo.pause(3000);

		OUTPUT("--- Checking Added Vehicle Expanded ---");

		OUTPUT("^^^-- TAKING A SCREENSHOT --^^^");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteEMyVehicles/"
				+ todaysDate + "/" + todaysDate + "-9-MyVehiclesExpanded.jpg";
		repo.CaptureScreenshot(Filename4);

		repo.pause(1000);

		expectedResult = "MY VEHICLE";

		if (repo.TextBoxCheckIgnoreFormatById(bind.toolbar_Title, expectedResult)) {
			OUTPUT("PASS - My Vehicle Header Text is Correct");
		} else {
			OUTPUT("FAIl - My Vehicle Header Text is NOT Correct");
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

		expectedResult = "TOYOTA YARIS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_MakeModel2, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Make & Model Are Correct");
		} else {
			OUTPUT("FAIl - Added Vehicle Make & Model Are NOT Correct");
		}

		expectedResult = "RK55UTZ";

		if (repo.TextBoxCheckIgnoreFormatById(bind.addedVehicle_Reg, expectedResult)) {
			OUTPUT("PASS - Added Vehicle Reg is Correct");
		} else {
			OUTPUTFAIL("FAIL - Added Vehicle Reg is Correct");
		}

		expectedResult = "Test Vehicle";

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

		OUTPUT("--- Checking Set Reminder Information ---");

		expectedResult = "SET REMINDERS";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setReminder_Title, expectedResult)) {
			OUTPUT("PASS - Set Reminder Title is Correct");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder Title is Correct");
		}

		if (repo.IsEnabledClickableById(bind.setReminder_Icon) == true) {
			OUTPUT("PASS - Set Reminder Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder Button is Not Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.setReminder_ImageXP)) {
			OUTPUT("PASS - Set Reminder Image is Displayed");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder Image is NOT Displayed");
		}

		expectedResult = "Set reminders for MOT, tax, servicing and insurance";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setReminder_Text, expectedResult)) {
			OUTPUT("PASS - Set Reminder Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.setReminder_TapText) == true) {
			OUTPUT("PASS - Set Reminder TapText is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder TapText is Not Enabled & Clickable");
		}

		expectedResult = "Tap here to get started";

		if (repo.TextBoxCheckIgnoreFormatById(bind.setReminder_TapText, expectedResult)) {
			OUTPUT("PASS - Set Reminder Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Set Reminder Text is Correct");
		}

		OUTPUT("***** COMPLETED - ADD VEHICLE - MY VEHICLES PAGE TESTS *****");

		repo.Back();

		driver.closeApp();

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
