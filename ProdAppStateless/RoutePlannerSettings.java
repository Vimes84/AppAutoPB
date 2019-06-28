package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerSettings {

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
	public void RoutePlannerSettingsTests() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - SETTINGS TESTS *****");

		repo.LaunchStatelessAllowAll();

		// Route & Traffic Settings Page Tests - Hybrid Map

		OUTPUT("--- Checking Hybrid Map Option ---");

		repo.TriggerClickById(bind.rp_SettingsButton);

		OUTPUT("--- Waiting for Hybrid Option and Clicking ---");

		repo.ElementWaitThenClickByXPath(bind.stngs_TypeMap_HybridXP);

		repo.pause(2000);

		OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");

		repo.TriggerClickByXPath(bind.stngs_CloseXP);

		repo.ElementWaitById(bind.rp_SettingsButton);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-6-HybridMapType.jpg";
		repo.CaptureScreenshot(Filename);

		OUTPUT("--- Performing Vertical Swipe ---");

		repo.verticalSwipeByPercentage(0.3, 0.9, 0.5);

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-7-HybridMapTypePostSwipe.jpg";
		repo.CaptureScreenshot(Filename2);

		repo.TriggerClickById(bind.rp_LocationButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.rp_SettingsButton);

		// Route & Traffic Settings Page Tests - Satellite Map

		OUTPUT("--- Checking Satellite Map Option ---");

		repo.ElementWaitThenClickByXPath(bind.stngs_TypeMap_SatXP);

		repo.pause(2000);

		OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");

		repo.TriggerClickByXPath(bind.stngs_CloseXP);

		repo.ElementWaitById(bind.rp_SettingsButton);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename3 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-8-SatMapType.jpg";
		repo.CaptureScreenshot(Filename3);

		OUTPUT("--- Performing Horizontal Swipe ---");

		repo.horizontalSwipeByPercentage(0.1, 0.9, 0.5);

		repo.pause(2000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename4 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-9-SatMapTypePostSwipe.jpg";
		repo.CaptureScreenshot(Filename4);

		repo.TriggerClickById(bind.rp_LocationButton);

		repo.pause(2000);

		repo.TriggerClickById(bind.rp_SettingsButton);

		repo.ElementWaitThenClickByXPath(bind.stngs_TypeMap_MapXP);

		repo.TriggerClickByXPath(bind.stngs_CloseXP);

		/*
		 * // Route & Traffic Settings Page Tests - Traffic Flow Toggle
		 * 
		 * OUTPUT("--- Checking Traffic Flow Toggle ---");
		 * 
		 * repo.ElementWaitById(bind.stngs_OverlayToggle_TrafficFlow);
		 * 
		 * repo.AssertCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficFlowXP);
		 * 
		 * repo.pause(2000);
		 * 
		 * OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");
		 * 
		 * repo.TriggerClickByXPath(bind.stngs_CloseXP);
		 * 
		 * repo.ElementWaitById(bind.rp_SettingsButton);
		 * 
		 * OUTPUT("***** TAKING A SCREENSHOT *****");
		 * 
		 * String Filename5 =
		 * "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
		 * + todaysDate + "/" + todaysDate + "-10-TrafficFlowToggle.jpg";
		 * repo.CaptureScreenshot(Filename5);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 * 
		 * repo.ElementWaitById(bind.stngs_OverlayToggle_TrafficFlow);
		 * 
		 * repo.AssertUnCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficFlowXP);
		 */
		// Route & Traffic Settings Page Tests - Traffic Incidents Toggle

		/*
		 * OUTPUT("--- Checking Traffic Incidents Toggle ---");
		 * 
		 * repo.AssertCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");
		 * 
		 * repo.TriggerClickByXPath(bind.stngs_CloseXP);
		 * 
		 * OUTPUT("--- Checking Traffic Legend Toggle 1 ---");
		 * 
		 * repo.ElementWaitById(bind.lgnd_TrafficLegendIcon);
		 * 
		 * if (repo.IsDisplayedById(bind.lgnd_LowIcon)) {
		 * OUTPUT("PASS - Low impact Icon Displayed");
		 * 
		 * if (repo.IsDisplayedById(bind.lgnd_ModerateIcon)) {
		 * OUTPUT("PASS - Moderate impact Icon Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Moderate impact Icon Is Not Displayed"); }
		 * 
		 * if (repo.IsDisplayedById(bind.lgnd_HighIcon)) {
		 * OUTPUT("PASS - Moderate impact Icon Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Moderate impact Icon Is Not Displayed"); }
		 * 
		 * expectedResult = "Traffic legend";
		 * 
		 * if (repo.TextBoxCheckByxPath(bind.lgnd_TrafficLegendTextXP, expectedResult))
		 * { OUTPUT("PASS - Traffic Legend Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Traffic Legend Text is NOT Correct"); }
		 * 
		 * expectedResult = "Low impact";
		 * 
		 * if (repo.TextBoxCheckByxPath(bind.lgnd_LowTextXP, expectedResult)) {
		 * OUTPUT("PASS - Low impact Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Low impact Text is NOT Correct"); }
		 * 
		 * expectedResult = "Moderate impact";
		 * 
		 * if (repo.TextBoxCheckByxPath(bind.lgnd_ModerateTextXP, expectedResult)) {
		 * OUTPUT("PASS - Moderate impact Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - Moderate impact Text is NOT Correct"); }
		 * 
		 * expectedResult = "High impact";
		 * 
		 * if (repo.TextBoxCheckByxPath(bind.lgnd_HighTextXP, expectedResult)) {
		 * OUTPUT("PASS - High impact Text is Correct"); } else {
		 * OUTPUTFAIL("FAIL - High impact Text is NOT Correct"); }
		 * 
		 * } else { OUTPUTFAIL("FAIL - Traffic Legend is NOT Displayed"); }
		 * 
		 * repo.ElementDisappearById(bind.lgnd_TrafficLegendIcon);
		 * 
		 * OUTPUT("***** TAKING A SCREENSHOT *****");
		 * 
		 * String Filename6 =
		 * "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
		 * + todaysDate + "/" + todaysDate + "-11-TrafficIncidentsToggle.jpg";
		 * repo.CaptureScreenshot(Filename6);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 * 
		 * repo.ElementWaitById(bind.stngs_OverlayToggle_TrafficIncident);
		 * 
		 * repo.AssertUnCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * repo.AssertCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");
		 * 
		 * repo.TriggerClickByXPath(bind.stngs_CloseXP);
		 * 
		 * repo.ElementWaitById(bind.lgnd_TrafficLegendIcon);
		 * 
		 * OUTPUT("--- Checking Traffic Legend Toggle 2 ---");
		 * 
		 * if (repo.IsDisplayedById(bind.lgnd_TrafficLegendIcon)) {
		 * OUTPUT("PASS - Traffic Legend Icon Displayed"); } else {
		 * OUTPUTFAIL("FAIL - Traffic Legend Icon Is Not Displayed"); }
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 * 
		 * repo.ElementWaitById(bind.stngs_OverlayToggle_TrafficIncident);
		 * 
		 * repo.AssertUnCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * repo.pause(2000);
		 * 
		 * repo.AssertCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");
		 * 
		 * repo.TriggerClickByXPath(bind.stngs_CloseXP);
		 * 
		 * repo.pause(2000);
		 * 
		 * OUTPUT("--- Checking Traffic Legend Toggle 3 (No Traffic Legend) ---");
		 * 
		 * try { if (repo.IsDisplayedByIdNoCheck(bind.lgnd_TrafficLegendIcon)) {
		 * OUTPUTFAIL("FAIL - Traffic Legend is displayed for a 3rd time"); } } catch
		 * (NoSuchElementException ignored) { System.out.println("*** PASS ***"); }
		 * 
		 * // Route & Traffic Settings Page Tests - Roadworks Toggle
		 * 
		 * OUTPUT("--- Checking Roadworks Toggle ---");
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 * 
		 * repo.ElementWaitById(bind.stngs_OverlayToggle_TrafficIncident);
		 * 
		 * repo.AssertUnCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_TrafficIncidentXP);
		 * 
		 * repo.AssertCheckedById(bind.stngs_MapTabXP, bind.stngs_TypeMap_MapXP,
		 * bind.stngs_OverlayToggle_RoadworksXP);
		 * 
		 * OUTPUT("--- Closing Settings and waiting for Return to Main Screen ---");
		 * 
		 * repo.TriggerClickByXPath(bind.stngs_CloseXP);
		 * 
		 * repo.ElementDisappearById(bind.stngs_LoadingData);
		 * 
		 * repo.ElementWaitById(bind.rp_SettingsButton);
		 * 
		 * OUTPUT("***** TAKING A SCREENSHOT *****");
		 * 
		 * String Filename7 =
		 * "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
		 * + todaysDate + "/" + todaysDate + "-12-RoadworksToggle.jpg";
		 * repo.CaptureScreenshot(Filename7);
		 * 
		 * repo.TriggerClickById(bind.rp_SettingsButton);
		 */

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - SETTINGS TESTS *****");

	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
