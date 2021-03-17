package J_Static;

public class StaticInnerClass {
	
	// static method.
	static int test() {
		int x = 6;
		int y = 45;
		int z = x + y;
		return z;
	}
	
	// Non static method
	int test2() {
		int x = 56;
		return x;
	}
	
	// Inner class
	static class test{
		int f = test();
		
		// non static. error.
//		int g = test2();
	}
}
