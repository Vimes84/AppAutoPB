package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE APP IS LOADED PASSED THE ONBOARDING SCREENS
// • ENSURE APP IS SET TO DISALLOW STORAGE ACCESS
// • IF THIS SUITE HAS BEEN RUN FOLLOWING MYRAC CANCELLED MEMBER SUITE (AS INTENDED) - THIS SHOULD AUTOMATICALLY BE THE CASE

// THIS TEST SUITE WILL TEST THE FOLLOWING:
// • My Vehicles > No Vehicle
// • My Vehicles > Add Vehicle
// • My Vehicles > Edit Vehicle
// • My Vehicles > Set Reminders

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ProdAppStateless.VehiclesNoVehicle.class, ProdAppStateless.VehiclesAddVehicle.class, ProdAppStateless.VehiclesEditVehicle.class,
		ProdAppStateless.VehiclesSetReminders.class })

@RunWith(Suite.class)
public class ATestSuiteEMyVehicles {
}
