package Example;

public class Prefix_Postfix {

	public static void main(String[] args) {

		// инкремент дикремент, префикс и постфикс
		int x = 0;
		x = x + 1;
		x = x++;
		System.out.println(x); // 1
		
		int y = 0;
		y = y - 1;
		y = y--;
		System.out.println(y); // -1
		
		int a = 0;
		a = --a;
		System.out.println(a); // -1
		
		int b = 0;
		b = ++b;
		System.out.println(b); // 1
	}

}
