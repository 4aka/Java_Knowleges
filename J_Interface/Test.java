package J_Interface;

public interface Test {

    int one = 123;
    int two = 0;

    void eat();
    void draw();
}

class MammalInt implements Test {

    public void eat() {
        System.out.println("������������� ������");
    }

    public void draw() {
        System.out.println("������������� ������������");
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.draw();
    }
}
