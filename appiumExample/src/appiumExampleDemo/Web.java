package appiumExampleDemo;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Web extends Capability {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void beforeMethod() throws MalformedURLException {
		driver = Capablities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TestCase1() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("IBM");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<AndroidElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Thread.sleep(3000);
		for(int i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'IBM - Wikipedia')]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
	}
}
