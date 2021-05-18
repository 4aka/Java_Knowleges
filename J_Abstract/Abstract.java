package J_Abstract;

abstract class Abstract1 {

    Abstract1() {
        System.out.println("constructor");
    }

    public void method() {
        System.out.println("not abs method");
    }

    public int sum(int one, int two) {
        return one + two;
    }

    public abstract int name();

    public abstract int name(int a, int z);
}

class Ext extends Abstract1{

    @Override
    public int name() {
        return 0;
    }

    @Override
    public int name(int a, int z) {
        return super.sum(a, z);
    }
}

class Main {

    public static void main(String[] args) {
        Ext e = new Ext();

        e.name();
        e.name(12, 34);

        e.sum(12, 34);
        e.method();
    }
}
