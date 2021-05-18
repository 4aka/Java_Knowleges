package testNG_Theory;

import org.testng.annotations.Test;

public class TestsWithDataProvider {
    @Test (dataProvider = "data-provider", dataProviderClass = DataProviderAsClass.class)
    public void myTest (String val) {
        System.out.println("Current Status : " + val);
    }
}