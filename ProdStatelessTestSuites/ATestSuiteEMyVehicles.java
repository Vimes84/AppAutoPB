package ProdStatelessTestSuites;

// ******IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

// ****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// BEFORE RUNNING THIS TEST SUITE:
// • ENSURE APP IS POINTED AT PROD MYRAC
// • ENSURE THAT MethodRepo LINE desiredCapabilities.setCapability("noReset", "false");

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
