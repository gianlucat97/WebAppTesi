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

class testSuiteHooks_release_1_0 {

	  private static WebDriver driver;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();

	  @BeforeAll
	  public static void setUp() throws Exception {
		
		  // Init chromedriver
		  String chromeDriverPath = "/home/runner/work/WebAppTesi/WebAppTesi/chromedriver_v94_linux64/chromedriver" ;
		  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		  driver = new ChromeDriver(options);  
		  
		  
		  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
		void provaSuWikipedia() {
		  
		  //SpringApplication.run(CatalogoProdottiBootApplication.class);

			System.out.println("La suit di Test è iniziata");
			  
			driver.get("https://en.wikipedia.org/wiki/Web_container");
		    driver.findElement(By.linkText("Jakarta Servlets")).click();
		    driver.findElement(By.linkText("PHP")).click();
		    driver.findElement(By.linkText("interpreter")).click();
		    driver.findElement(By.linkText("intermediate representation")).click();
		    driver.findElement(By.linkText("data structure")).click();
		    
		    System.out.println("La suit di Test è terminata");
		    
		    
		  
		}
	 
	  
	  @Test
	  public void testtestSuiteHooksChromeHeadless() throws Exception {
		  
		
		//String[] par = {"-cp"};
		//CatalogoProdottiBootApplication.main(par);
		
		System.out.println("La suit di Test è iniziata");
		  
		driver.get("http://localhost:8080/prodotti");
		System.out.println("Connesso a localhost:8080/prodotti");
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("//*[@x-test-tpl-35450]//*[@x-test-hook-34524]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-3524]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-46520]//*[@x-test-hook-3524]")).sendKeys("Casse");
	    driver.findElement(By.xpath("//*[@x-test-tpl-5420]//*[@x-test-hook-5427]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5420]//*[@x-test-hook-6727]")).sendKeys("Articolo Musicale");
	    driver.findElement(By.xpath("//*[@x-test-tpl-4620]//*[@x-test-hook-7630]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-65420]//*[@x-test-hook-6730]")).sendKeys("75");
	    driver.findElement(By.xpath("//*[@x-test-tpl-4620]//*[@x-test-hook-6732]")).click();
	    driver.findElement(By.xpath("//body")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-6720]//*[@x-test-hook-6774]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-6720]//*[@x-test-hook-76524]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5620]//*[@x-test-hook-5624]")).sendKeys("Chitarra");
	    driver.findElement(By.xpath("//*[@x-test-tpl-6520]//*[@x-test-hook-6527]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-6520]//*[@x-test-hook-7827]")).sendKeys("Strumento Musicale");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).sendKeys("100");
	    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-32]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][9]//*[@x-test-hook-50]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-6]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("60");
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][10]//*[@x-test-hook-50]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-14]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).clear();
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-16]")).sendKeys("120");
	    driver.findElement(By.xpath("//*[@x-test-tpl-5]//*[@x-test-hook-18]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][10]//*[@x-test-hook-49]")).click();
	    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][9]//*[@x-test-hook-49]")).click();
	 
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
