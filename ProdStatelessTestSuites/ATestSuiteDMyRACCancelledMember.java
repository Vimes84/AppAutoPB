package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE THAT MethodRepo LINE desiredCapabilities.setCapability("noReset", "false");

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • MyRAC > Logged In > Cancelled Member
// • MyRAC > Logged In > Cancelled Member > Personal Details

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.MyRACLoggedInCancelledCover.class, ProdAppStateless.MyRACLICancPersonalDetails.class })

@RunWith(Suite.class)
public class ATestSuiteDMyRACCancelledMember {
}
