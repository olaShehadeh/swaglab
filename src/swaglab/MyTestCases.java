
package swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	
	WebDriver driver = new ChromeDriver();

@BeforeTest

public void mySetup() throws InterruptedException {
	String myURL ="https://www.saucedemo.com/";

	driver.get(myURL);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
}

@Test
public void CheckTheWebsiteTitle() throws InterruptedException {

	driver.get("https://www.google.com");
	Thread.sleep(2000);

	System.out.println(driver.getTitle());
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.manage().window().fullscreen();

}

@AfterTest
public void AfterTesting() {

}

}