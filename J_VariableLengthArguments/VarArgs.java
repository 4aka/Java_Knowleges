package J_VariableLengthArguments;

public class VarArgs {
	// arguments list with variable length (...)
	// (int... v) sets in the end of arguments list
	
	static void vaTest(String message, int ... v) {
		System.out.println(message + v.length);
		System.out.println("Contains: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	// variables arguments list work like array
	// int i[] = {10};
	// int i[] = {1, 2, 3};
	// int i[] = {};
	public static void main(String[] args) {
		vaTest("One arg: ", 10); // 1 arg
		vaTest("Three args: ", 1, 2, 3); // 3 args
		vaTest("No args: "); // no arg
	}
	
	// correct
	int doit(int a, int b, double c, int ... vals) {
		return a = 34;
	}
	
	// incorrect. must be only one variable arguments.
//	int doiterror(int a, int b, double c, int ... vals, double ... moreVlas) {
//		return a = 34;
//	}
}