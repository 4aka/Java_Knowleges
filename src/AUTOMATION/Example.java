package AUTOMATION;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Logger;
import org.junit.After;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// FROM http://qaru.site/questions/1566860/selenium-webdriver-how-do-i-run-multiple-tests-one-after-the-other-in-the-same-window


public class Example {
	String username, password, siteid;
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private final StringBuffer verificationErrors = new StringBuffer();
	// static Logger log = Logger.getLogger(LoginScript.class);

	// @BeforeSuite (alwaysRun=true)
	// @Parameters({ "url","username","password","site" })

	public void setUp(String env, String user, String pwd, String ste) throws Exception {
		username = user;
		password = pwd;
		siteid = ste;

		driver = new FirefoxDriver();
		driver.get(env);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLoginScript() throws Exception {
		// Maximize window
		driver.manage().window().maximize();

		// Login
		driver.findElement(By.id("TBSiteID")).clear();
		driver.findElement(By.id("TBSiteID")).sendKeys(siteid);
		driver.findElement(By.id("TBUserName")).clear();
		driver.findElement(By.id("TBUserName")).sendKeys(username);
		driver.findElement(By.name("TBPassword")).clear();
		driver.findElement(By.name("TBPassword")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		// log.info("Found requested site");

	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
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