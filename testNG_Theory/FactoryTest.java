package testNG_Theory;

import org.testng.Assert;
import org.testng.annotations.*;

class FactoryTest {

    //-----------------------------------------------------------------------------
    @Parameters("table")
    @Factory
    public Object[] createParameterizedTest(@Optional("SOME_TABLE") String table) {
        return new Object[] { new GenericTableTest(table) };
    }
    //-----------------------------------------------------------------------------

    @DataProvider
    public Object[][] tablesData() {
        return new Object[][]{
                {"FIRST_TABLE"},
                {"SECOND_TABLE"},
                {"THIRD_TABLE"},
        };
    }

    @Factory(dataProvider = "tablesData")
    public Object[] createTest(String table) {
        return new Object[]{new GenericTableTest(table)};
    }
}

class GenericTableTest extends Assert {
    private final String table;

    public GenericTableTest(final String table) {
        this.table = table;
    }

    @Test
    public void testTable() {
        System.out.println(table);
        // do some testing staff here
    }
}