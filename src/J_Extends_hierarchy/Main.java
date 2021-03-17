package J_Extends_hierarchy;

public class Main {

	public static void main(String[] args) {
		ExtendThird t1 = new ExtendThird("black", "full", 12.0, 23.0);
		ExtendThird t2 = new ExtendThird("white", "contour", 10.0, 13.0);
		
		System.out.println("Info about t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Square: " + t1.area());
		
		System.out.println();
		
		System.out.println("Info about t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Square: " + t2.area());
	}
}

/*
 * Иерархия их трех классов.
 * ExtendSecond наследуется от SuperFirst.
 * ExtendThird наследуется от SuperFirst и ExtendSecond. 
 * Наследуемый класс может расширять свой супер класс и т.д.
 * 
 * Вызов super() обращается к ближайшему конструктору Супер класса.
 */ 
