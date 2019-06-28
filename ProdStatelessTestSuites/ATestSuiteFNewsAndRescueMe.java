package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE THAT MethodRepo LINE desiredCapabilities.setCapability("noReset", "false");

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • Motoring News Page
// • Rescue Me (Location Enabled)
// • Rescue Me (Location Disabled)

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.MotoringNews.class, ProdAppStateless.RescueMeLocationEnabled.class,
		ProdAppStateless.RescueMeLocationDisabled.class })

@RunWith(Suite.class)
public class ATestSuiteFNewsAndRescueMe {
}
