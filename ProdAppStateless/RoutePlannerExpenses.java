package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


@SuppressWarnings("unused")
public class RoutePlannerExpenses {

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

		OUTPUT("***** EXECUTING - ROUTE & TRAFFIC - BUSINESS EXPENSES *****");

// Launching via Google Play Store

		repo.LaunchStatelessAllowAll();

		// Allowing Search through contacts

		repo.TriggerClickById(bind.srch_ContainerMap);

		repo.TriggerClickById(bind.srch_ContactsContainer);

		repo.TriggerClickById(bind.androidAllow);

		repo.pause(3000);

		// Adding Locations to the Recent Location List

		OUTPUT("--- Adding London to Recent List ---");

		keyedInput = "London";

		repo.SendKeysById(bind.srch_ContainerList, keyedInput);

		repo.TriggerClickByXPath(bind.srch_FirstContainerXP);

		repo.TriggerClickById(bind.srched_ClearTextMap);

		// Adding RAC to London to Recent Routes List

		OUTPUT("--- Adding RAC to London to Recent Routes List ---");

		repo.TriggerClickById(bind.rp_PlanRouteButton);

		repo.TriggerClickByXPath(bind.pr_DestinationTextXP);

		repo.TriggerClickByXPath(bind.pr_RecentFirstLocContXP);

		repo.ElementWaitById(bind.rp_SettingsButton);

		repo.TriggerClickById(bind.pr_CloseButton);

		// Checking Expenses Calculator

		OUTPUT("--- CHECKING EXPENSES CALCULATOR PAGE ---");

		repo.TriggerClickById(bind.rp_DashboardButton);

		repo.TriggerClickById(bind.dash_ExpensesContainer);

		repo.ElementWaitThenClickById(bind.pr_StatelessExpensesRecRoute);

		repo.ElementWaitById(bind.exp_Title);

		expectedResult = "BUSINESS EXPENSES CALCULATOR";

		if (repo.TextBoxCheckIgnoreFormatById(bind.exp_Title, expectedResult)) {
			OUTPUT("PASS - Title Text is Correct");
		} else {
			OUTPUTFAIL("FAIL - Title Text is Correct");
		}

		if (repo.IsEnabledClickableById(bind.exp_BackButton)) {
			OUTPUT("PASS - Back Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Back Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.exp_BackImageXP)) {
			OUTPUT("PASS - Back Button image is displayed");
		} else {
			OUTPUTFAIL("FAIL - Back Button image is NOT displayed");
		}

		if (repo.IsEnabledClickableById(bind.exp_ShareButton)) {
			OUTPUT("PASS - Share Button is Enabled & Clickable");
		} else {
			OUTPUTFAIL("FAIL - Share Button is NOT Enabled & Clickable");
		}

		if (repo.IsDisplayedByXPath(bind.exp_ShareButtonImageXP)) {
			OUTPUT("PASS - Share Button image is displayed");
		} else {
			OUTPUTFAIL("FAIL - Share Button image is NOT displayed");
		}

		if (repo.IsDisplayedByXPath(bind.exp_DistanceCircleXP)) {
			OUTPUT("PASS - Distance circle image is displayed");
		} else {
			OUTPUTFAIL("FAIL - Distance circle image is NOT displayed");
		}
// ***Great Park Road Location Testing Starts Here***

		expectedResult = "Great Park Road";

		if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location1RoadTextXP, expectedResult)) {
			OUTPUT("*** CURRENT LOCATION IS GREAT PARK ROAD ***");

			expectedResult = "117.27";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DistanceText, expectedResult)) {
				OUTPUT("PASS - Distance Text 1 is Correct");
			} else {
				OUTPUTFAIL("FAIL - Distance Text 1 is Correct");
			}

			expectedResult = "MILES";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DistanceText2, expectedResult)) {
				OUTPUT("PASS - Distance Text 2 is Correct");
			} else {
				OUTPUTFAIL("FAIL - Distance Text 2 is NOT Correct");
			}

			if (repo.IsDisplayedByXPath(bind.exp_Location1IconXP)) {
				OUTPUT("PASS - Current Location marker image is displayed");
			} else {
				OUTPUTFAIL("FAIL - Current Location marker image is NOT displayed");
			}

			expectedResult = "Great Park Road";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location1RoadTextXP, expectedResult)) {
				OUTPUT("PASS - Current Location Road Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Current Location Road Text is NOT Correct");
			}

			expectedResult = "Great Park Road, Bristol BS32 4QN, United Kingdom";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location1AddressTextXP, expectedResult)) {
				OUTPUT("PASS - Current Location Address Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Current Location Address Text is NOT Correct");
			}

			if (repo.IsDisplayedByXPath(bind.exp_Location2IconXP)) {
				OUTPUT("PASS - Destination marker image is displayed");
			} else {
				OUTPUTFAIL("FAIL - Destination marker image is NOT displayed");
			}

			expectedResult = "London";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location2RoadTextXP, expectedResult)) {
				OUTPUT("PASS - Destination Road Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Destination Road Text is NOT Correct");
			}

			expectedResult = "London, UK";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location2AddressTextXP, expectedResult)) {
				OUTPUT("PASS - Destination Address Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Destination Address Text is NOT Correct");
			}

			if (repo.IsEnabledClickableById(bind.exp_PencePerMileValue)) {
				OUTPUT("PASS - PPM Value is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL - PPM Value is NOT Enabled & Clickable");
			}

			expectedResult = "45p";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PencePerMileValue, expectedResult)) {
				OUTPUT("PASS - PPM Value is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Value is Correct");
			}

			expectedResult = "Pence per mile";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PencePerMileTextXP, expectedResult)) {
				OUTPUT("PASS - PPM Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Text is NOT Correct");
			}

			expectedResult = "Tap to change";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PencePerMileTapTextXP, expectedResult)) {
				OUTPUT("PASS - PPM Tap to change text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Tap to change text is NOT Correct");
			}

			if (repo.IsEnabledClickableById(bind.exp_AddPassToggle)) {
				OUTPUT("PASS - Additional Passengers Toggle is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL -Additional Passengers Toggle is NOT Enabled & Clickable");
			}

			expectedResult = "Are additional passengers charged at an extra rate?";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_AddPassTextXP, expectedResult)) {
				OUTPUT("PASS - Additional Passengers text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Additional Passengers text is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_TotalSinglePoundIcon)) {
				OUTPUT("PASS - Pound icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Pound icon is NOT displayed");
			}

			expectedResult = "Your business expense for 117.27 miles is";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalSingleText, expectedResult)) {
				OUTPUT("PASS - Your business expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Your business expense text is NOT Correct");
			}

			expectedResult = "£52.77";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalSingleValue, expectedResult)) {
				OUTPUT("PASS - Your business expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Your business expense value is Correct");
			}

			OUTPUT("--- COMPARING DISTANCE & COST VALUES TO THE MAP SCREEN WITH DRIVER ONLY---");

			if (repo.CompareDistance() == true) {
				OUTPUT("PASS - Distance on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Distance on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			if (repo.CompareCost(bind.exp_TotalSingleValue) == true) {
				OUTPUT("PASS - Cost on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Cost on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- COMPARING COST VALUE TO THE MAP SCREEN WITH HIGHER PPM ---");

			repo.ClearFieldByID(bind.exp_PencePerMileValue);

			keyedInput = "65";

			repo.SendKeysById(bind.exp_PencePerMileValue, keyedInput);

			repo.TriggerClickById(bind.exp_DistanceText);

			if (repo.CompareCost(bind.exp_TotalSingleValue) == true) {
				OUTPUT("PASS - Adjusted cost on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Adjusted cost on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH ADDITIONAL PASSENGER SELECTED ---");

			repo.TriggerClickById(bind.exp_AddPassToggle);

			elementList = "uk.co.rac.roadside:id/scrollView";
			elementClass = "android.widget.TextView";
			elementText = "Driver expense";

			repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

			expectedResult = "1";

			if (repo.TextBoxCheckById(bind.exp_PassNumValue, expectedResult)) {
				OUTPUT("PASS - Number value of passengers is Correct");
			} else {
				OUTPUTFAIL("FAIL - Number value of passengers is NOT Correct");
			}

			/*
			 * expectedResult = "Number of passengers";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatNoSpaceByXPath(bind.exp_PassNumTextXP,
			 * expectedResult)) { OUTPUT("PASS - Number of passengers text is Correct"); }
			 * else { OUTPUTFAIL("FAIL - Number of passengers text is NOT Correct"); }
			 */

			expectedResult = "0p";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassPPMValue, expectedResult)) {
				OUTPUT("PASS - Cost per mile for passengers is Correct");
			} else {
				OUTPUTFAIL("FAIL - Cost per mile for passengers is NOT Correct");
			}

			expectedResult = "Pence per mile";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassPPMText, expectedResult)) {
				OUTPUT("PASS - PPM text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM text is NOT Correct");
			}

			/*
			 * expectedResult = "For the additional passengers";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatNoSpaceByXPath(bind.exp_PassAddPassTextXP,
			 * expectedResult)) { OUTPUT("PASS - For the additional text is Correct"); }
			 * else { OUTPUTFAIL("FAIL - For the additional text is NOT Correct"); }
			 * 
			 * expectedResult = "Tap to change";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PassTapTextXP,
			 * expectedResult)) { OUTPUT("PASS - Tap to change text is Correct"); } else {
			 * OUTPUTFAIL("FAIL - Tap to change text is NOT Correct"); }
			 */

			if (repo.IsDisplayedById(bind.exp_DriverIcon)) {
				OUTPUT("PASS - Driver Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Driver Icon is NOT displayed");
			}

			expectedResult = "Driver expense";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DriverText, expectedResult)) {
				OUTPUT("PASS - Driver expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Driver expense text is NOT Correct");
			}

			expectedResult = "£52.77";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DriverValue, expectedResult)) {
				OUTPUT("PASS - Driver expense cost is Correct");
			} else {
				OUTPUTFAIL("FAIL - Driver expense cost is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_PassengerIcon)) {
				OUTPUT("PASS - Passenger Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Passenger Icon is NOT displayed");
			}

			expectedResult = "Passenger expense";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassegerText, expectedResult)) {
				OUTPUT("PASS - Passenger expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense text is NOT Correct");
			}

			expectedResult = "£0.00";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger cost value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger cost value is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_TotalIcon)) {
				OUTPUT("PASS - Total Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Total Icon is NOT displayed");
			}

			expectedResult = "Total business expenses for 117.27 miles is";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalText, expectedResult)) {
				OUTPUT("PASS - Total expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense text is NOT Correct");
			}

			expectedResult = "£52.77";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense value is NOT Correct");
			}

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH 1 ADDITIONAL PASSENGER ---");

			repo.ClearFieldByID(bind.exp_PassPPMValue);

			keyedInput = "25";

			repo.SendKeysById(bind.exp_PassPPMValue, keyedInput);

			repo.TriggerClickById(bind.exp_PassengerValue);

			expectedResult = "£29.32";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense text is NOT Correct");
			}

			expectedResult = "£82.09";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense text is NOT Correct");
			}

			if (repo.CompareCost(bind.exp_TotalValue) == true) {
				OUTPUT("PASS - Total cost on expenses matches The Map Dashboard with 1 additional passenger");
			} else {
				OUTPUTFAIL("FAIL - Total cost on expenses does not match The Map Dashboard 1 additional passenger");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH 2 ADDITIONAL PASSENGERS ---");

			repo.TriggerClickById(bind.exp_AddPassToggle);

			elementList = "uk.co.rac.roadside:id/scrollView";
			elementClass = "android.widget.TextView";
			elementText = "Driver expense";

			repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

			repo.ClearFieldByID(bind.exp_PassNumValue);

			keyedInput = "2";

			repo.SendKeysById(bind.exp_PassNumValue, keyedInput);

			repo.ClearFieldByID(bind.exp_PassPPMValue);

			keyedInput = "25";

			repo.SendKeysById(bind.exp_PassPPMValue, keyedInput);

			repo.TriggerClickById(bind.exp_PassengerValue);

			expectedResult = "£29.32";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense value is NOT Correct");
			}

			expectedResult = "£111.41";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense value is NOT Correct");
			}

			if (repo.CompareCost(bind.exp_TotalValue) == true) {
				OUTPUT("PASS - Total cost on expenses matches The Map Dashboard with 2 additional passengers");
			} else {
				OUTPUTFAIL("FAIL - Total cost on expenses does not match The Map Dashboard 2 additional passengers");
			}

			repo.SwitchBackStateless();

			OUTPUT("***** TAKING A SCREENSHOT OF THE SHARE OPTIONS *****");

			repo.TriggerClickById(bind.exp_ShareButton);

			repo.pause(3000);

			String Filename1 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
					+ todaysDate + "/" + todaysDate + "-995-ShareOptions.jpg";
			repo.CaptureScreenshot(Filename1);

			repo.Back();

			repo.Back();

			repo.ElementWaitThenClickById(bind.pr_CloseButton);

// ***Unnamed Road Location Testing Starts Here***

		} else {
			OUTPUT("*** CURRENT LOCATION IS UNNAMED ROAD ***");

			expectedResult = "117.28";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DistanceText, expectedResult)) {
				OUTPUT("PASS - Distance Text 1 is Correct");
			} else {
				OUTPUTFAIL("FAIL - Distance Text 1 is Correct");
			}

			expectedResult = "MILES";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DistanceText2, expectedResult)) {
				OUTPUT("PASS - Distance Text 2 is Correct");
			} else {
				OUTPUTFAIL("FAIL - Distance Text 2 is NOT Correct");
			}

			if (repo.IsDisplayedByXPath(bind.exp_Location1IconXP)) {
				OUTPUT("PASS - Current Location marker image is displayed");
			} else {
				OUTPUTFAIL("FAIL - Current Location marker image is NOT displayed");
			}

			expectedResult = "Unnamed Road";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location1RoadTextXP, expectedResult)) {
				OUTPUT("PASS - Current Location Road Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Current Location Road Text is NOT Correct");
			}

			expectedResult = "Unnamed Road, Bradley Stoke, Bristol BS32 4QN, UK";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location1AddressTextXP, expectedResult)) {
				OUTPUT("PASS - Current Location Address Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Current Location Address Text is NOT Correct");
			}

			if (repo.IsDisplayedByXPath(bind.exp_Location2IconXP)) {
				OUTPUT("PASS - Destination marker image is displayed");
			} else {
				OUTPUTFAIL("FAIL - Destination marker image is NOT displayed");
			}

			expectedResult = "London";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location2RoadTextXP, expectedResult)) {
				OUTPUT("PASS - Destination Road Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Destination Road Text is NOT Correct");
			}

			expectedResult = "London, UK";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_Location2AddressTextXP, expectedResult)) {
				OUTPUT("PASS - Destination Address Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Destination Address Text is NOT Correct");
			}

			if (repo.IsEnabledClickableById(bind.exp_PencePerMileValue)) {
				OUTPUT("PASS - PPM Value is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL - PPM Value is NOT Enabled & Clickable");
			}

			expectedResult = "45p";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PencePerMileValue, expectedResult)) {
				OUTPUT("PASS - PPM Value is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Value is Correct");
			}

			expectedResult = "Pence per mile";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PencePerMileTextXP, expectedResult)) {
				OUTPUT("PASS - PPM Text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Text is NOT Correct");
			}

			expectedResult = "Tap to change";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PencePerMileTapTextXP, expectedResult)) {
				OUTPUT("PASS - PPM Tap to change text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM Tap to change text is NOT Correct");
			}

			if (repo.IsEnabledClickableById(bind.exp_AddPassToggle)) {
				OUTPUT("PASS - Additional Passengers Toggle is Enabled & Clickable");
			} else {
				OUTPUTFAIL("FAIL -Additional Passengers Toggle is NOT Enabled & Clickable");
			}

			expectedResult = "Are additional passengers charged at an extra rate?";

			if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_AddPassTextXP, expectedResult)) {
				OUTPUT("PASS - Additional Passengers text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Additional Passengers text is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_TotalSinglePoundIcon)) {
				OUTPUT("PASS - Pound icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Pound icon is NOT displayed");
			}

			expectedResult = "Your business expense for 117.28 miles is";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalSingleText, expectedResult)) {
				OUTPUT("PASS - Your business expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Your business expense text is NOT Correct");
			}

			expectedResult = "£52.78";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalSingleValue, expectedResult)) {
				OUTPUT("PASS - Your business expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Your business expense value is Correct");
			}

			OUTPUT("--- COMPARING DISTANCE & COST VALUES TO THE MAP SCREEN WITH DRIVER ONLY---");

			if (repo.CompareDistance() == true) {
				OUTPUT("PASS - Distance on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Distance on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			if (repo.CompareCost(bind.exp_TotalSingleValue) == true) {
				OUTPUT("PASS - Cost on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Cost on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- COMPARING COST VALUE TO THE MAP SCREEN WITH HIGHER PPM ---");

			repo.ClearFieldByID(bind.exp_PencePerMileValue);

			keyedInput = "65";

			repo.SendKeysById(bind.exp_PencePerMileValue, keyedInput);

			repo.TriggerClickById(bind.exp_DistanceText);

			if (repo.CompareCost(bind.exp_TotalSingleValue) == true) {
				OUTPUT("PASS - Adjusted cost on expenses matches The Map Dashboard");
			} else {
				OUTPUTFAIL("FAIL - Adjusted cost on expenses does not match The Map Dashboard");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH ADDITIONAL PASSENGER SELECTED ---");

			repo.TriggerClickById(bind.exp_AddPassToggle);

			elementList = "uk.co.rac.roadside:id/scrollView";
			elementClass = "android.widget.TextView";
			elementText = "Driver expense";

			repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

			expectedResult = "1";

			if (repo.TextBoxCheckById(bind.exp_PassNumValue, expectedResult)) {
				OUTPUT("PASS - Number value of passengers is Correct");
			} else {
				OUTPUTFAIL("FAIL - Number value of passengers is NOT Correct");
			}

			/*
			 * expectedResult = "Number of passengers";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatNoSpaceByXPath(bind.exp_PassNumTextXP,
			 * expectedResult)) { OUTPUT("PASS - Number of passengers text is Correct"); }
			 * else { OUTPUTFAIL("FAIL - Number of passengers text is NOT Correct"); }
			 */

			expectedResult = "0p";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassPPMValue, expectedResult)) {
				OUTPUT("PASS - Cost per mile for passengers is Correct");
			} else {
				OUTPUTFAIL("FAIL - Cost per mile for passengers is NOT Correct");
			}

			expectedResult = "Pence per mile";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassPPMText, expectedResult)) {
				OUTPUT("PASS - PPM text is Correct");
			} else {
				OUTPUTFAIL("FAIL - PPM text is NOT Correct");
			}

			/*
			 * expectedResult = "For the additional passengers";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatNoSpaceByXPath(bind.exp_PassAddPassTextXP,
			 * expectedResult)) { OUTPUT("PASS - For the additional text is Correct"); }
			 * else { OUTPUTFAIL("FAIL - For the additional text is NOT Correct"); }
			 * 
			 * expectedResult = "Tap to change";
			 * 
			 * if (repo.TextBoxCheckIgnoreFormatByXPath(bind.exp_PassTapTextXP,
			 * expectedResult)) { OUTPUT("PASS - Tap to change text is Correct"); } else {
			 * OUTPUTFAIL("FAIL - Tap to change text is NOT Correct"); }
			 */

			if (repo.IsDisplayedById(bind.exp_DriverIcon)) {
				OUTPUT("PASS - Driver Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Driver Icon is NOT displayed");
			}

			expectedResult = "Driver expense";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DriverText, expectedResult)) {
				OUTPUT("PASS - Driver expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Driver expense text is NOT Correct");
			}

			expectedResult = "£52.78";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_DriverValue, expectedResult)) {
				OUTPUT("PASS - Driver expense cost is Correct");
			} else {
				OUTPUTFAIL("FAIL - Driver expense cost is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_PassengerIcon)) {
				OUTPUT("PASS - Passenger Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Passenger Icon is NOT displayed");
			}

			expectedResult = "Passenger expense";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassegerText, expectedResult)) {
				OUTPUT("PASS - Passenger expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense text is NOT Correct");
			}

			expectedResult = "£0.00";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger cost value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger cost value is NOT Correct");
			}

			if (repo.IsDisplayedById(bind.exp_TotalIcon)) {
				OUTPUT("PASS - Total Icon is displayed");
			} else {
				OUTPUTFAIL("FAIL - Total Icon is NOT displayed");
			}

			expectedResult = "Total business expenses for 117.28 miles is";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalText, expectedResult)) {
				OUTPUT("PASS - Total expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense text is NOT Correct");
			}

			expectedResult = "£52.78";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense value is NOT Correct");
			}

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH 1 ADDITIONAL PASSENGER ---");

			repo.ClearFieldByID(bind.exp_PassPPMValue);

			keyedInput = "25";

			repo.SendKeysById(bind.exp_PassPPMValue, keyedInput);

			repo.TriggerClickById(bind.exp_PassengerValue);

			expectedResult = "£29.32";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense text is NOT Correct");
			}

			expectedResult = "£82.10";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense text is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense text is NOT Correct");
			}

			if (repo.CompareCost(bind.exp_TotalValue) == true) {
				OUTPUT("PASS - Total cost on expenses matches The Map Dashboard with 1 additional passenger");
			} else {
				OUTPUTFAIL("FAIL - Total cost on expenses does not match The Map Dashboard 1 additional passenger");
			}

			repo.SwitchBackStateless();

			OUTPUT("--- CHECKING EXPENSES SCREEN WITH 2 ADDITIONAL PASSENGERS ---");

			repo.TriggerClickById(bind.exp_AddPassToggle);

			elementList = "uk.co.rac.roadside:id/scrollView";
			elementClass = "android.widget.TextView";
			elementText = "Driver expense";

			repo.scrollToElementUsing_Text(elementList, elementClass, elementText);

			repo.ClearFieldByID(bind.exp_PassNumValue);

			keyedInput = "2";

			repo.SendKeysById(bind.exp_PassNumValue, keyedInput);

			repo.ClearFieldByID(bind.exp_PassPPMValue);

			keyedInput = "25";

			repo.SendKeysById(bind.exp_PassPPMValue, keyedInput);

			repo.TriggerClickById(bind.exp_PassengerValue);

			expectedResult = "£29.32";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_PassengerValue, expectedResult)) {
				OUTPUT("PASS - Passenger expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Passenger expense value is NOT Correct");
			}

			expectedResult = "£111.42";

			if (repo.TextBoxCheckIgnoreFormatById(bind.exp_TotalValue, expectedResult)) {
				OUTPUT("PASS - Total expense value is Correct");
			} else {
				OUTPUTFAIL("FAIL - Total expense value is NOT Correct");
			}

			if (repo.CompareCost(bind.exp_TotalValue) == true) {
				OUTPUT("PASS - Total cost on expenses matches The Map Dashboard with 2 additional passengers");
			} else {
				OUTPUTFAIL("FAIL - Total cost on expenses does not match The Map Dashboard 2 additional passengers");
			}

			repo.SwitchBackStateless();

			OUTPUT("***** TAKING A SCREENSHOT OF THE SHARE OPTIONS *****");

			repo.TriggerClickById(bind.exp_ShareButton);

			repo.pause(3000);

			String Filename1 = "C:/Users/evansd6/Desktop/Mobile Automation/Test Screenshots/Linked - Drive Prod - S7/SuiteGRoute&Traffic/"
					+ todaysDate + "/" + todaysDate + "-995-ShareOptions.jpg";
			repo.CaptureScreenshot(Filename1);

			repo.Back();

			repo.Back();

			repo.ElementWaitThenClickById(bind.pr_CloseButton);

		}

		OUTPUT("***** COMPLETED - ROUTE & TRAFFIC - BUSINESS EXPENSES *****");

	}

}