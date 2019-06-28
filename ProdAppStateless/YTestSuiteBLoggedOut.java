package ProdAppStateless;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE APP IS LOADED TO THE ROUTE PLANNER ONBOARDING SCREEN 
// • IF THIS SUITE HAS BEEN RUN FOLLOWING WELCOME SUITE (AS INTENDED) - THIS SHOULD AUTOMATICALLY BE THE CASE

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • Onboarding Screens
// • MyRAC (Logged Out)
// • MyRAC > Member Login
// • My Vehicles (Logged Out)
// • My Vehicles > Member Login

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ OnboardingScreens.class, MyRACLoggedOut.class, YMyRACMemberLogin.class, VehiclesLoggedOut.class,
		YMyVehMemberLogin.class })

@RunWith(Suite.class)
public class YTestSuiteBLoggedOut {
}