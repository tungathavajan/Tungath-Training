package appiumExampleDemo;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CaseStudy extends Capability {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void beforeMethod() throws MalformedURLException {
		driver = Capablities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TestCase1() throws InterruptedException {
		driver.get("https://m.cricbuzz.com");
		driver.findElement(By.xpath("//*[@class='cb-ico cb-ico-down']")).click();
		driver.findElement(By.xpath("//*[@class='td-head']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(), 'Top Stories')]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
		String expectedValue = "Top Stories";
		String actualValue = ele.getAttribute("innerText");
		System.out.println(actualValue);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
