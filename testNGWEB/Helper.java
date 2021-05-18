package testNGWEB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Helper {

    public static WebElement waitElement(WebDriver driver, String xpath, int seconds) {
        return new WebDriverWait(driver, seconds)
                .until(visibilityOf(driver.findElement(By.xpath(xpath))));
    }

    public static void waitNotVisibility(WebDriver driver, WebElement element, int seconds) {
        new WebDriverWait(driver, seconds)
                .until(elementToBeClickable(element));
    }

    public static void assertTrue(WebElement element, String data) {
        Assert.assertTrue(true, String.valueOf(element.getText().equals(data)));
        System.out.println("E-mail was checked");
    }
}
