package testNG_Theory;

import com.diarch.logic.Calc;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.sql.DataSource;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class TheoryClass extends Assert {

    /*
    https://habr.com/ru/post/121234/
     */

    /*
    BeforeSuite
    BeforeTest
    BeforeClass
    BeforeMethod
    Test Case
    AfterMethod
    AfterClass
    AfterTest
    AfterSuite
     */

    private Calc calc = new Calc();

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }

    @BeforeGroups
    public void beforeGroups() throws Exception {
    }

    @AfterGroups
    public void afterGroups() throws Exception {
    }

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @BeforeTest
    public void beforeTest() throws Exception {
    }

    @AfterTest
    public void afterTest() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeSuite
    public void beforeSuite() throws Exception {
    }

    @AfterSuite
    public void afterSuite() throws Exception {
    }

    // ---------------TESTS

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calc.sum(2, 3));
        System.out.println("@Test");
    }

    // ---------------GROUP

    @Test(groups = {"unit1", "integration"})
    public void testingMethod1() {
        System.out.println("testingMethod1");
    }

    @Test(groups = {"unit2", "integration"})
    public void testingMethod2() {
        System.out.println("testingMethod2");
    }

    @Test(groups = {"unit1"})
    public void testingMethod3() {
        System.out.println("testingMethod3");
    }

    @Test(groups = {"unit1", "unit2"})
    public void testingMethod4() {
        System.out.println("testingMethod4");
    }

    // ---------------DEPEND TESTS

    @Test
    public void initEnvironmentTest() {
        System.out.println("This is initEnvironmentTest");
    }

    @Test(dependsOnMethods = {"initEnvironmentTest"})
    public void testmethod() {
        System.out.println("This is testmethod");
    }

    // ---------------DEPEND GROUP

    @Test(groups = {"init"})
    public void initEnvironmentTest1() {
        System.out.println("This is initEnvironmentTest1");
    }

    @Test(groups = {"init"})
    public void initEnvironmentTest2() {
        System.out.println("This is initEnvironmentTest2");
    }

    @Test(dependsOnGroups = {"init"})
    public void testmethod1() {
        System.out.println("This is testmethod");
    }

    // ---------------DATA PROVIDER

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"First", "-Value"},
                {"Second", "-Value"}
        };
    }

    @Test(dataProvider = "data-provider")
    public void myTest(String[] val) {
        System.out.println("Passed Parameter Is : " + val[0] + val[1]);
    }

    // ---------------DATA PROVIDER

    @DataProvider(name = "data-provider2")
    public Object[][] dpMethod2() {
        return new Object[][]{{2, 3, 5}, {5, 7, 12}};
        // a=2, b=3, result=5
    }

    @Test(dataProvider = "data-provider2")
    public void myTest2(int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    // ---------------DATA PROVIDER

    @DataProvider(name = "data-provider3")
    public Object[][] dpMethod3(Method m) {
        switch (m.getName()) {
            case "Sum":
                return new Object[][]{{2, 3, 5}, {5, 7, 12}};
            case "Diff":
                return new Object[][]{{2, 3, -1}, {5, 7, -2}};
        }
        return null;
    }

    @Test(dataProvider = "data-provider3")
    public void Sum(int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    @Test(dataProvider = "data-provider3")
    public void Diff(int a, int b, int result) {
        int diff = a - b;
        Assert.assertEquals(result, diff);
    }

    // --------------------PARAMETRIZED TEST

    private DataSource dataSource;

    @Parameters({"driver", "url", "username", "password"})
    @BeforeClass
    public void setUpDataSource(String driver, String url, @Optional("sa") String username, @Optional String password) {
        // create datasource
        // dataSource = ...
    }

    @Test
    public void testOptionalData() throws SQLException {
         dataSource.getConnection();
        // do some staff
    }

    // -------------------


}