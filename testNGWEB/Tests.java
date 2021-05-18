package testNGWEB;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static testNGWEB.Helper.assertTrue;
import static testNGWEB.Helper.waitElement;

public class Tests extends RunClass {

    @BeforeSuite
    void before() {
        driver.get("https://www.lambdatest.com/");
        waitElement(driver, "//*[@id=\"useremail\"]", 10);
        System.out.println("Page was opened");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"123@mail.ru"},
                {"sdfdf"},
                {"asdasdasdasdasdasdas"}
        };
    }

    @Test(dataProvider = "data-provider")
    public void closeAttentionWindow(String mail) {
        PageObjects action = new PageObjects();

        action.setEMail(driver, mail);
        assertTrue(action.userMail(driver), mail);
        action.userMail(driver).clear();
    }
}