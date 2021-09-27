
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

class TestSuiteErrorFailureProva1 {
private static WebDriver driver;
private boolean acceptNextAlert = true;
private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver";
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	 @Test
	  public void provaSuWikipedia_release_1_0() {
		  
		  //SpringApplication.run(CatalogoProdottiBootApplication.class);

			System.out.println("La suit di Test è iniziata");
			  
			driver.get("https://en.wikipedia.org/wiki/Web_container");
		    driver.findElement(By.linkText("Jakarta (Parte in parentesi aggiunta per far fallire test) quServlets")).click();
		    driver.findElement(By.linkText("PHP")).click();
		    //driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).click();
		    driver.findElement(By.linkText("interpreter")).click();
		    driver.findElement(By.linkText("intermediate representation")).click();
		    driver.findElement(By.linkText("data structure")).click();
		    
		    System.out.println("La suit di Test è terminata");
		    
		    
		  
		}
	 
	  
	 //Causa failure dato che fallisce un assert
	  @Test
	  public void testLocalHost2_Hooks_release_1_2() throws Exception {
		  
		
		
		System.out.println("La suit di Test è iniziata");
		  
		driver.get("http://localhost:8080/prodotti");
		System.out.println("Connesso a localhost:8080/prodotti");
		
		TimeUnit.SECONDS.sleep(1);
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).sendKeys("Batteria");
	    
	    System.out.println("Vediamo il valore del getText() stampato a video:");
	    System.out.println("Valore: "+driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).getAttribute("value")+" !!!");
	    
	    assertEquals("Violoncello", driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).getAttribute("value"));
	    
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).sendKeys("Strumento Musicale");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).sendKeys("180");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-32]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).sendKeys("Racchetta");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).sendKeys("Articolo Padel");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).sendKeys("80");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-32]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][11]//*[@x-test-hook-50]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-14]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("120");
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][11]//*[@x-test-hook-49]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][10]//*[@x-test-hook-49]")).click();
	 
	    System.out.println("La suit di Test è terminata");
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
