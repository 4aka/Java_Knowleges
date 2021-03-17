package J_StaticBlocks;

public class StaticBlock {
	
	/*
	 * Статические блоки используются для:
	 * - инициализации данных которые потребуются далее в коде,
	 * - установки соединения с удаленным узлом.
	 * - настройки статических переменных.
	 * *Статический блок выполняется при первой загрузке класса.  
	 */
	static int test;
	static double dTest;
	
	static {
		System.out.println("Внутри статического блока");
		dTest = Math.sqrt(2.0);
		test = (int) (dTest * 2);
	}
	
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}