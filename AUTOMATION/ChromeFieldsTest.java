package AUTOMATION;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeFieldsTest {

	private static WebDriver driver;
	public static final String path = System.getProperty("user.dir");
	public static final String currentDir = path + "/resources/";
	// set firefox location
	static String ChromePath = "";
	static String baseUrl = "";

	@BeforeClass
	public static void setUpOnce() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(baseUrl);
	}

	@Test
	public static void fieldTest() throws InterruptedException {
		Thread.sleep(1000);
		for (int i = 0; i < values.length; i++) {
			Thread.sleep(1000);
			driver.findElement(By.id("TODOElementFindElement")).click();
			driver.findElement(By.id("TODOElementFindElement")).clear();
			driver.findElement(By.id("TODOElementSetValue")).sendKeys(values[i]);
			Thread.sleep(500);
			driver.findElement(By.id("TODOElementExecute")).click();
			Thread.sleep(500);
			getInfo();

			driver.findElement(By.id("TODOElementFindElement")).clear();
			Thread.sleep(500);
			// Maybe it will be need
			// driver.navigate().refresh(); // or
			// Actions action = new Actions(driver);
			// action.sendKeys(Keys.F5).build().perform();
		}
	}

	public static void getInfo() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.id("TODO_element"));
		String status = element.getAttribute("value");
		if (status.equals("TODO_error")) {
			System.out.println("error_text");
		} else {
			System.out.println("test passed");
		}
	}

	static String values[] = { "null", // null
			"", // null
			"0", // zero
			"0.235689", // double
			"0.0000000045", // double
			"0123456789", // int
			"123456789", // int

			"A", "abcdef", // String
			"абвгде", //
			"Aa Bb Cc Dd", "Аа Бб Вв Гг", "Ё Ъ Й", "          ",

			"/!\\№;%:?*()_+", "~`", "\"|\"", "\'\'", "?",

			"संस्कृता वाच्", "أ ب ج د ﻩ و ز ح ط ي ك ل م ن س ع ف ص ق ر ش ت ث خ ذ ض ظ غ",

			// ~300 symbols
			"0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789",
			// ~600 symbols
			"0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 01234567890123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789 0123456789" +
					" 0123456789 0123456789 0123456789",

			"select * from notes nt where nt.subject = ‘password‘;",
			"select * from notes nt where nt.subject = ‘ ‘ or 1=1;–",

			"( ) < > & * ‘ | = ? ; [ ] ^ ~ ! . ” % @ / \\ : + , ` " };
}
