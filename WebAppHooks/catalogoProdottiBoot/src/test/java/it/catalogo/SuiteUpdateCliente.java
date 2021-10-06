
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

class SuiteUpdateCliente {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  System.setProperty("webdriver.chrome.whitelistedIps", "");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--no-sandbox","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  @Test
  public void testSuiteUpdateCliente_release_2_2() throws Exception {
    driver.get("http://localhost:8080/clienti/catalogoclienti");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rimuovi dati cliente'])[9]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cognome'])[1]/following::div[1]")).click();
    driver.findElement(By.id("storicospesa")).clear();
    driver.findElement(By.id("storicospesa")).sendKeys("280");
    driver.findElement(By.name("invia")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Rimuovi dati cliente'])[9]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cognome'])[1]/following::div[1]")).click();
    driver.findElement(By.id("storicospesa")).clear();
    driver.findElement(By.id("storicospesa")).sendKeys("170");
    driver.findElement(By.name("invia")).click();
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
