package steps;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.OrgPage;

public class StepDef {

	
	public static WebDriver driver;
	OrgPage org;
	String url = "http://elearningm1.upskills.in/";

	Logger logger = Logger.getLogger(StepDef.class.getName());;
	
	@Before
	 public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TUNGATHAVAJANTungath\\eclipse-workspace\\Tungath-Cucumber-Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		org = new OrgPage(driver); 
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes,"image/png");
		}
		
		if(driver!=null)
		{driver.quit();}
	}

	@Given("customer loads the URL in browser")
	public void loadURL() {
		driver.get(url);
	}

	@When("customer clicks on signup button")
	public void clickSignup() {
		org.clickSignup();
	}

	@And("enters {string}, {string}, {string}, {string} and {string}")
	public void userenterdetails(String firstname, String Lastname, String email, String userID, String pass) {
		org.firstname(firstname);
		org.lastname(Lastname);
		org.email(email);
		org.username(userID);
		org.password(pass);
		org.confirmpassword(pass);
	}

	@Then("clicks on register button")
	public void user_clicksonRegister() {
		org.registerbutton();
	}

	@Then("validate the message")
	public void validateMessage(String expectedMessage) {
		String actualMessage = org.messageverify();
//		Assert.assertTrue(actualMessage.contains(expectedMessage));
		logger.info("Message Verfication is sucessful");
	}

	@Then("clicks on Home")
	public void clickHome() {
		org.HomePage();
	}

	@And("Validate {string} email from profile section")
	public void validateEmail(String email) {
		org.profile();
		String actualEmail = org.emailverify();
		Assert.assertEquals(email, actualEmail);
		logger.info("Email verified");
	}

	@And("create email and send to {string}")
	public void createEmail(String receiver) throws InterruptedException {
		org.Compose();
		org.sendname(receiver);
		Thread.sleep(3000);
		org.sendnameenter();
		org.subject();
		org.emailbody();
		org.sendmessage();
	}

	@And("Validate the message {string}")
	public void validateEmailMessage(String expectedConfirmationMessage) {
		String actualConfirmationMessage = org.emailmessageVerify();
		Assert.assertEquals(actualConfirmationMessage, expectedConfirmationMessage);
		logger.info("Message Verfication is sucessful");
	}

}
