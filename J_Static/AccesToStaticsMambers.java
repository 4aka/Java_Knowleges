package J_Static;

public class AccesToStaticsMambers {
	/*
	 * static позволяет создать член класса (например метод или переменную)
	 * к которой будет разрешен доступ без создания объекта класса через нотацию "ClassName.member". 
	 */
	public static void main(String[] args) {
		StaticMambersClass smc = new StaticMambersClass();
		StaticMambersClass smcTest = new StaticMambersClass();
		/*
		 * через создание объекта. Значение этой переменной не 
		 * повлияет на исходное значение переменной в базовом классе.
		 */
		smc.x = 10;
		smcTest.x = 20;
		System.out.println("smc.x: " + smc.x); // result 10
		System.out.println("smcTest.x: " + smcTest.x); // result 20
		
		System.out.println();
		StaticMambersClass.y = 123; // через имя класса. // result 123
		System.out.println("StaticMambersClass.y: " + StaticMambersClass.y); 
		StaticMambersClass.y = 789;
		/*
		 * через объект.Но так как "у" статичная, то значение изменяется на 789.
		 * так как все объекты пользуются одной и той же статической переменной.
		 */
 		System.out.println("smc.y: " + StaticMambersClass.y); // result 789. because static!

		System.out.println();
		int result = smc.test(123, 45, 789); // через объект // result  
		System.out.println("By Object result: " + result);
		int res =    StaticMambersClass.test(456, 123); // через имя класса
		System.out.println("By Class name result: " + res);
	}
}
