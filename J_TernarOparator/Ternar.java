package J_TernarOparator;

public class Ternar {

	public static void main(String[] args) {
		
		// ? - тернарный оператор.
		// выражение_1 ? выражение_2 : выражение_3
		// выражение_1 - логическое. boolean true or false
		// выражение_2 и выражение_3 любого типа кроме void
		
		// Если выражение_1 дает результат true, то выполняется выражение_2
		// Если выражение_1 дает результат false, то выполняется выражение_3
		
		// Предотвращение деления на 0
		int result;
		
		for(int i = -5; i < 6; i++) {
			result = i != 0 ? 100/i : 0;
			if(i != 0) {
				System.out.println("100 / " + i + " equal " + result);
			} 
		}
		
		for(int i = -5; i < 6; i++) {
			if(i != 0 ? true : false) {
				System.out.println("100 / " + i + " equal " + 100/i);
			}
		}
	}
}