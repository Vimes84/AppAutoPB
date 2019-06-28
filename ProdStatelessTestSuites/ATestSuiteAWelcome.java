package ProdStatelessTestSuites;

// *****IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

//****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE THAT MethodRepo LINE desiredCapabilities.setCapability("noReset", "true");
// • REINSTALL THE RAC APP
// • LOAD THE APP TO THE APP WELCOME PAGE
// • TAP JOIN THE RAC BUTTON AND ENSURE CHROME IS LOADED, IF NOT, SELECT CHROME > ALWAYS

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • Welcome Page
// • Welcome Page > Member Login Page
// • Welcome Page > Member Login Page > Forgotten Password Page
// • Welcome Page > Member Login Page > Don't Have a Password Page 
// • Welcome Page > Member Login Page > Don't Have a Password Page > Registration Scenarios
// • Welcome Page > Member Login Page > Login to MyRAC

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.WelcomePage.class, ProdAppStateless.WPMemberLogin.class,
		ProdAppStateless.WPMLlForgotPWTest.class, ProdAppStateless.WPRegisterNoDetails.class,
		ProdAppStateless.WPRegister.class, ProdAppStateless.WPMLLogIn.class })

@RunWith(Suite.class)
public class ATestSuiteAWelcome {

}
