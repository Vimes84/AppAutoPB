package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerDashboard {

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
	public void routePlannerNoSearchDash() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - NO SEARCH - DASHBOARD *****");

		repo.LaunchStatelessAllowAll();

		repo.pause(2000);

		// Checking Show Traffic & Incidents Button via Dashboard Button

		OUTPUT("--- CHECKING SHOW TRAFFIC & INCIDENTS BUTTON ---");

		repo.TriggerClickById(bind.rp_DashboardButton);

		repo.ElementWaitThenClickById(bind.dash_ShowTrafficContainer);

		repo.ElementWaitById(bind.lgnd_TrafficLegendIcon);

		if (repo.IsDisplayedById(bind.lgnd_LowIcon)) {
			OUTPUT("PASS - Low impact Icon Displayed");

			if (repo.IsDisplayedById(bind.lgnd_ModerateIcon)) {
				OUTPUT("PASS - Moderate impact Icon Displayed");
			} else {
				OUTPUTFAIL("FAIL - Moderate impact Icon Is Not Displayed");
			}

			if (repo.IsDisplayedById(bind.lgnd_HighIcon)) {
				OUTPUT("PASS - Moderate impact Icon Displayed");
			} else {
				OUTPUTFAIL("FAIL - Moderate impact Icon Is Not Displayed");
			}

			expectedResult = "Traffic legend";

			if (repo.TextBoxCheckByxPath(bind.lgnd_TrafficLegendTextXP, expectedResult)) {
				OUTPUT("PASS - Traffic Legend Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Traffic Legend Text is NOT Correct");
			}

			expectedResult = "Low impact";

			if (repo.TextBoxCheckByxPath(bind.lgnd_LowTextXP, expectedResult)) {
				OUTPUT("PASS - Low impact Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Low impact Text is NOT Correct");
			}

			expectedResult = "Moderate impact";

			if (repo.TextBoxCheckByxPath(bind.lgnd_ModerateTextXP, expectedResult)) {
				OUTPUT("PASS - Moderate impact Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Moderate impact Text is NOT Correct");
			}

			expectedResult = "High impact";

			if (repo.TextBoxCheckByxPath(bind.lgnd_HighTextXP, expectedResult)) {
				OUTPUT("PASS - High impact Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - High impact Text is NOT Correct");
			}

		} else {
			OUTPUTFAIL("FAIL - Traffic Legend is NOT Displayed");
		}

		repo.ElementDisappearById(bind.lgnd_TrafficLegendIcon);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-994-TrafficAndIncidentsOnMap.jpg";
		repo.CaptureScreenshot(Filename);

		repo.TriggerClickById(bind.rp_DashboardButton);

		repo.ElementWaitThenClickById(bind.dash_ShowTrafficContainer);

		try {
			if (repo.IsDisplayedById(bind.lgnd_LowIcon) == true) {
				OUTPUTFAIL("FAIL - Traffic Legend is displayed when Hide Traffic Events is selected");
			}
		} catch (NoSuchElementException ignored) {
			OUTPUT("PASS - Traffic Legend is NOT displayed when Hide Traffic Events is selected");
		}

		repo.pause(3000);

		OUTPUT("***** TAKING A SCREENSHOT *****");

		String Filename2 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
				+ todaysDate + "/" + todaysDate + "-997-TrafficAndIncidentsHidden.jpg";
		repo.CaptureScreenshot(Filename2);

		// Checking Future Travel Button via Dashboard Button

		OUTPUT("--- CHECKING FUTURE TRAVEL BUTTON ---");

		repo.TriggerClickById(bind.rp_DashboardButton);

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - NO SEARCH - DASHBOARD *****");

	}

}