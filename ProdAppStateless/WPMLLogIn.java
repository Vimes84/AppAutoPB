package ProdAppStateless;

import java.net.MalformedURLException;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*import org.omg.CORBA.RepositoryIdHelper;
import io.appium.java_client.MobileBy;*/

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class WPMLLogIn {

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
	public void wpMemberLoginTest() {

		bind = new Repository.ElementRepo();

		OUTPUT("***** EXECUTING WELCOME PAGE > MEMBER LOGIN > LOGIN USER TEST*****");

		repo.pause(10000);

		repo.pause(10000);
		repo.ratePopUpClickById();

// Member Login Page via Welcome Screen

		OUTPUT("--- Ensuring Login Button is displayed before proceeding ---");

		repo.ElementHuntWelcomeById(bind.login_Button);

		OUTPUT("--- Login Button is displayed proceeding with script ---");

		OUTPUT("--- Tapping Member Login ---");

		repo.pause(1000);

		repo.TriggerClickById(bind.login_Button);

/// Member Login Page 

		OUTPUT("--- Checking Member Login is Displayed ---");

		repo.ElementWaitById(bind.email_Entry);

/// Member Login - Correct Details - Valid Email, Valid Password

		OUTPUT("--- Entering Correct Details - Valid Email, Valid Password ---");

		keyedInput = ("devans@rac.co.uk");

		repo.SendKeysById(bind.email_Entry, keyedInput);

		keyedInput = ("Donotchange123");

		repo.SendKeysById(bind.password_Entry, keyedInput);

		OUTPUT("--- Checking Login Chevron Button is Enabled ---");

		OUTPUT("--- Tapping Login Chevron Button ---");

		repo.LoginFailCheck();

		repo.ElementWaitThenClickById(bind.androidDeny);

		OUTPUT("***** COMPLETED WELCOME PAGE > MEMBER LOGIN > LOGIN USER TEST*****");
	}

	@After
	public void tearDown() {

		driver.quit();
	}
}
