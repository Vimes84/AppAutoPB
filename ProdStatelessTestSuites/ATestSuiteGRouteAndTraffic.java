package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE THAT MethodRepo LINE desiredCapabilities.setCapability("noReset", "false");

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • RoutePlanner (Pre-Location Search)
// • RoutePlanner > Settings
// • RoutePlanner > Location Search
// • RoutePlanner > Plan Route
// • RoutePlanner > Business Expenses Calculator
// • RoutePlanner (Location Disabled)

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.RoutePlannerNoSearch.class, ProdAppStateless.RoutePlannerSettings.class,
		ProdAppStateless.RoutePlannerLocationSearch.class, ProdAppStateless.RoutePlannerRoutePlanning.class,
		ProdAppStateless.RoutePlannerExpenses.class, ProdAppStateless.RoutePlannerNoLocation.class })

@RunWith(Suite.class)
public class ATestSuiteGRouteAndTraffic {
}
