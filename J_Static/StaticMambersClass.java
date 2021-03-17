package J_Static;

public class StaticMambersClass {
	
	int x; // через объект
	static int y; // через имя класса.
	
	static int test(int x, int y) { // Override
		return x + y;
	}
	
	int test(int x, int y, int z) {
		return x + y + z;
	}
	
//	static int error(int y) {
//		int sum = x + y; // х - не является статической переменной
//	}

	/*
	 * Ограничения для static методов: 
	 * - В методе типа static могут вызываться только методы static.
	 * - для метода статик доступны только другие данные типа статик.
	 * - в методе статик не должно быть ссылки this.
	 */
}
