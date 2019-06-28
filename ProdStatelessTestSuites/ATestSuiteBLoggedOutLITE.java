package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ~~~ CREATED TO INCLUDE LITE VERSION TESTS FOR MEMBER LOGIN ON MYRAC AND MY VEHICLES ~~~
// ~~~ AS THE FULL TEST SCRIPTS ARE EXECUTED UNDER WELCOME > MEMBER LOGIN ~~~

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE APP IS LOADED TO THE ROUTE PLANNER ONBOARDING SCREEN 
// • IF THIS SUITE HAS BEEN RUN FOLLOWING WELCOME SUITE (AS INTENDED) - THIS SHOULD AUTOMATICALLY BE THE CASE

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • Onboarding Screens
// • MyRAC (Logged Out)
// • MyRAC > Member Login LITE
// • My Vehicles (Logged Out)
// • My Vehicles > Member Login LITE

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.OnboardingScreens.class, ProdAppStateless.MyRACLoggedOut.class,
		ProdAppStateless.MyRACMemberLoginLITE.class, ProdAppStateless.VehiclesLoggedOut.class,
		ProdAppStateless.VehMemberLoginLITE.class })

@RunWith(Suite.class)
public class ATestSuiteBLoggedOutLITE {
}