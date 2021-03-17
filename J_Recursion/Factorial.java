package J_Recursion;

public class Factorial {

	public static void main(String[] args) {
		int j = 5;
		factI(j);
		
		System.out.println("Iteration method: ");
		for(int i = 1; i < j; i++) System.out.println("Factorial: " + i + " = " + factI(i));
	}
	
	static int factI(int n) {
		int t, result;

		result = 1;
		for(t = 1; t <= n; t++) 
			result *= t;
		return result;
	}
}
