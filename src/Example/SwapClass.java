package Example;

public class SwapClass {
	
	int a;
	
	SwapClass(int i) {
		a = i;
	}
	
	public static void swap() {
		SwapClass sw1 = new SwapClass(5);
		System.out.println(sw1);
		
		SwapClass sw2 = new SwapClass(2);
		System.out.println(sw2);
	}

	public static void main(String[] args) {
		

	}
}
