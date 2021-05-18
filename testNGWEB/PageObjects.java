package testNGWEB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static testNGWEB.Helper.waitElement;

public class PageObjects{

    public WebElement userMail(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"useremail\"]"));
    }

    public void setEMail(WebDriver driver, String userMailData) {
        waitElement(driver, "//*[@id=\"useremail\"]", 5).sendKeys(userMailData);
        System.out.println("E-mail was set.");
    }
}