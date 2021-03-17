package J_Recursion;

public class RecursionExample {

	public static void main(String[] args) {
		int j = 5;
		factR(j);
		
//		System.out.println("Recursion method: ");
//		for(int i = 1; i < j; i++) System.out.println("Factorial: " + i + " = " + factR(i));
	}
	
	// Recurtion method for getting factorial "n".
	static int factR(int n) {
		int result;

		/*
		 *  Вызов метода повторяется до тех пор пока n не станет равным 1.
		 *  e.t.c.
		 *  first call n = 5
		 *  	5 * 24 = 120
		 *  	Second call n = 4 
		 *  		4 * 6 = 24
		 *  		Third call n = 3 Вызов метода при n = 3 влечет за собой вызов с n = 2, n = 1, затем 3 * результат n = 2 * результат  n = 1.
		 *  			3 * 2 = 6
		 *  			fourth call n = 2 Вызов метода при n = 2 влечет за собой вызов с n = 1, затем 2 * результат n = 1
		 *  				2 * 1 = 2
		 *  				fifth call n = 1 
		 *  
		 *  ************
		 *  2 = 1*2 = 2
		 *  3 = 1*2*3 = 6
		 *  4 = 1*2*3*4 = 24
		 *  5 = 1*2*3*4*5 = 120
		 *  ************
		 */

		if(n == 1) return 1; 
		/*
		 * Необходимо использовать "условие" в таких методах, так как
		 * рекурсия может быть бесконечной.
		 * Так же следует использовать println для контроля работы метода.
		 */
			result = factR(n - 1) * n;
			System.out.println("n: " + n);
			System.out.println("result: " + result);
			System.out.println();
		return result;
	}
}
