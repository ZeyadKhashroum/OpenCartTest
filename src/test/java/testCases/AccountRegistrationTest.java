
package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.RegistrationPage;


public class AccountRegistrationTest {

	public WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.opencart.com/en-gb?route=common");
		driver.manage().window().maximize();
		
		
	}
	@AfterClass
	public void closeWindow()
	{
		//driver.quit();
	}
	@Test
   public void VerifyAccountRegistration() throws InterruptedException
   {
	   HomePage hp = new HomePage(driver);
	   hp.ClickOff();
	   hp.registration();
	   RegistrationPage regpage = new RegistrationPage(driver);
	   regpage.SetFirstName("amm");
	   regpage.SetLastName("hdv");
	   regpage.SetEmail("asdfsf@gmail.com");
	   regpage.Setpassword("wertyu");
       Thread.sleep(10000);
	   regpage.SetPrivacyPolicy();
	   regpage.continu();
	   String confmsg=regpage.getConfMsg();
	   Assert.assertEquals(confmsg, "Your Account Has Been Created!");
   }
   

    }


//import java.time.Duration;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.logging.log4j.Logger;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.apache.commons.lang3.RandomStringUtils;
//
//public class AccountRegistrationTest {
//
//    public WebDriver driver;
//    public Logger logger;
//
//    @BeforeClass
//    public void setup() {
//        driver = new ChromeDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("http://localhost/opencart/");
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
//
//    public String randomString() {
//        String generatedString = RandomStringUtils.randomAlphabetic(5);
//        return generatedString;
//    }
//}




