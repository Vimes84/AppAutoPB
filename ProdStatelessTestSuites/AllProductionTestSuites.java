package ProdStatelessTestSuites;

// *****IMPORTANT: PLEASE READ BEFORE EXECUTING****** 

//****THIS TEST SUITE IS SETUP FOR USE WITH PRODUCTION DATA****

// THIS WILL RUN ALL TEST SUITES AND THEREFORE ALL TESTS:

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({ ATestSuiteAWelcome.class, ATestSuiteBLoggedOutLITE.class, ATestSuiteCMyRACLiveMember.class,
		ATestSuiteDMyRACCancelledMember.class, ATestSuiteEMyVehicles.class, ATestSuiteFNewsAndRescueMe.class })

@RunWith(Suite.class)
public class AllProductionTestSuites {
}
