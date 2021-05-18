package testNG_Theory;

import org.testng.annotations.DataProvider;

public class DataProviderAsClass {
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"Value Passed"}
        };
    }
}