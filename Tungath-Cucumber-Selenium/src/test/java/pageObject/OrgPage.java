package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrgPage {


	WebDriver driver;
	By signup = By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a");
	By firstname = By.xpath("//*[@id=\"registration_firstname\"]");
	By lastname = By.xpath("//*[@id=\"registration_lastname\"]");
	By email = By.xpath("//*[@id=\"registration_email\"]");
	By username = By.xpath("//*[@id=\"username\"]");
	By pass = By.xpath("//*[@id=\"pass1\"]");
	By confirmpass = By.xpath("//*[@id=\"pass2\"]");
	By register = By.xpath("//*[@id=\"registration_submit\"]");
	By message = By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]");
	By home = By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]/a");
	By profile = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a");
	By email1 = By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p");
	By compose = By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a");
	By sendto = By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input");
	By sendtoEnter = By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input");
	By subject = By.xpath("//*[@id=\"compose_message_title\"]");
	By body = By.xpath("/html/body");
	By sendmessage = By.xpath("//*[@id=\"compose_message_compose\"]");
	By confirmmessage = By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]");
	
	public OrgPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignup() {
		driver.findElement(signup).click();
	}

	public void firstname(String firstName) {
		driver.findElement(firstname).sendKeys(firstName);
	}

	public void lastname(String lastName) {
		driver.findElement(lastname).sendKeys(lastName);
	}

	public void email(String email1) {
		driver.findElement(email).sendKeys(email1);
	}

	public void username(String userName) {
		driver.findElement(username).sendKeys(userName);
	}

	public void password(String passWord) {
		driver.findElement(pass).sendKeys(passWord);
	}

	public void confirmpassword(String confirmpassword) {
		driver.findElement(confirmpass).sendKeys(confirmpassword);
	}

	public void registerbutton() {

		driver.findElement(register).click();
	}

	public String messageverify() {
		return driver.findElement(message).getText();
	}

	public void HomePage() {
		driver.findElement(home).click();
	}

	public void profile() {
		driver.findElement(profile).click();
	}

	public String emailverify() {
		return driver.findElement(email1).getText();
	}

	public void Compose() {
		driver.findElement(compose).click();
	}

	public void sendname(String sendname) {
		driver.findElement(sendto).sendKeys(sendname);
	}

	public void sendnameenter() {
		driver.findElement(sendtoEnter).sendKeys(Keys.ENTER);
	}

	public void subject() {
		driver.findElement(subject).sendKeys("Tungath Testing");
	}

	public void emailbody() {
		driver.findElement(body)
				.sendKeys("This is for my Selenium Assignment - Tungath");
	}

	public void sendmessage() {
		driver.findElement(sendmessage).click();
	}

	public String emailmessageVerify() {
		return driver.findElement(confirmmessage).getText();
	}
}
