package J_ENUM;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enum {

    // Перечислиения
    enum regType {
        // Типы активации. Исползуется в случае если параметр должен принять одно из трех(например) ВОЗМОЖНЫХ значений.
        // передача конктретного значения исползуемого в выпадающем меню.
        MANUAL("#md-option-0"), AUTO("#md-option-1"), EMAIL("#md-option-2");
        private final String selector;

        /*
         * Конструктор. Для использования как параметра при создании метода.
         * тип - regType, значение селектора - regType (manual, auto, email)
         * */
        private regType(String selector) {
            this.selector = selector;
        }

        // Получить селектор
        public String getSelector() {
            return selector;
        }
    }


    public void settingsGeneral(regType regType) {
        System.out.println("General settings...");

        FirefoxDriver driver = new FirefoxDriver();

        // Activation type users account.
        driver.findElement(By.cssSelector("app-general-settings > form > md-select > div")).click();
        driver.findElement(By.id(regType.getSelector())).click();

        System.out.println("General settings...OK");
    }
}