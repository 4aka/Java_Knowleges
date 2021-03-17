package J_Extends;

public class Main {

	public static void main(String[] args) {
		Extend t1 = new Extend("black", 12.0, 23.0);
		Extend t2 = new Extend("white", 10.0, 13.0);
		
		System.out.println("Info about t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Square: " + t1.area());
		
		System.out.println();
		
		System.out.println("Info about t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Square: " + t2.area());
	}
}