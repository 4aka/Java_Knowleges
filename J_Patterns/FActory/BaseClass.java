package J_Patterns.FActory;

public class BaseClass {
    public void grindCoffee() {
        // перемалываем кофе
    }

    public void makeCoffee() {
        // делаем кофе
    }

    public void pourIntoCup() {
        // наливаем в чашку
    }
}

//------------------------------------EXTENDS CLASSES

class Americano extends BaseClass {

}

class Cappuccino extends BaseClass {

}

class CaffeLatte extends BaseClass {

}

class Espresso extends BaseClass {

}

//-------------------------------------ENUM with types of coffee

enum CoffeeType {
    ESPRESSO,
    AMERICANO,
    CAFFE_LATTE,
    CAPPUCCINO
}

//-------------------------------------FACTORY

class Factory {
    public BaseClass createCoffee(CoffeeType type) {
        BaseClass coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }
        return coffee;
    }
}

//-------------------------------------HOW TO USE

class CoffeeShop {

    private final Factory coffeeFactory;

    public CoffeeShop(Factory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public BaseClass orderCoffee(CoffeeType type) {
        BaseClass coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}