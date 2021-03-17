package J_AccesPrivateClass;

public class AccesMain {

	public static void main(String[] args) {
		
		Acces acces = new Acces();
		
		acces.setAlpha(-99); // set value
		/*
		 * К приватной переменной необходимо создавать несколько методов
		 * для доступа к ней. set + var name
		 * 					  get + var name
		 */
		System.out.println(acces.getAlpha());
		
		// Невозможно задать значение переменной стандартным способом:
		// int a = acces.setAlpha();
		// acces.setAlpha() = 123;
		
		// Для открытых переменных все осталось так же:
		
		acces.beta = 88;
		acces.gamma = 77;
		
		// !!! В классе Б доступны переменные класса А, только если эти переменные 
		// пренадлежат всему классу А, а не его методам.
	}
}