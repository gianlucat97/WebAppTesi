package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuiteCreateAndAssertHooks {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSuiteCreateAndAssertHooks_loc_Hooks_release_1_1() throws Exception {
    driver.get("http://localhost:8080/prodotti");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).sendKeys("Il ritratto di Dorian Gray");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).sendKeys("Libro");
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).clear();
    driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).sendKeys("10");
    assertEquals("Il ritratto di Dorian Gray", driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-24]")).getAttribute("value"));
	assertEquals("Libro", driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-27]")).getAttribute("value"));
	assertEquals("10", driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-30]")).getAttribute("value"));
	driver.findElement(By.xpath("//*[@x-test-tpl-20]//*[@x-test-hook-32]")).click();
    driver.findElement(By.xpath("//*[@x-test-tpl-35]//*[@x-test-hook-44][10]//*[@x-test-hook-49]")).click();
  }

  @After
  public void tearDown() throws Exception {
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
