
//File risulta attualmente aggiornato per webdriver chrome headless!
package it.catalogo.test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class SuiteUpdateLocHooks {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testSuiteUpdateLocHooks_loc_Hooks_release_1_0() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][1]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("Marca Nike");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("95");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][2]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("4 Fornelli");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("380");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][3]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).sendKeys("TV S150x");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("900");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][3]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-10]")).sendKeys("TV S50x");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("800");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][2]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("8 Fornelli");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("770");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][1]//*[@x-test-hook-50]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-13]")).sendKeys("Marca Adidas");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("100");
    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
  }



 @AfterAll
	  public static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
