package J_StaticBlocks;

public class Main {

	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock("Внутри конструктора");
		System.out.println("Корень квадратный из 2 равен: " + StaticBlock.test);
		System.out.println("test * test равен: (int)" + StaticBlock.dTest);
	}
}
