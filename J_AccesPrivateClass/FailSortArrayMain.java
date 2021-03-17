package J_AccesPrivateClass;

public class FailSortArrayMain {

	public static void main(String[] args) {

		FailSortArray fs = new FailSortArray(5, -1);
		int x = 0;

		System.out.println("Обработка ошибок без вывода отчета.");

		for (int i = 0; i < (fs.length * 2); i++)
			fs.put(i, i * 10); // Для обращения к элементам исп. методы доступа

		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i); // Для обращения к элементам исп. методы доступа
			if (x != -1) System.out.println(x + " ");
		}
		System.out.println("");
		
		System.out.println("\nОбработка ошибок с выводом отчета.");
		for (int i = 0; i < (fs.length * 2); i++) {
			fs.put(i, i * 10);
			System.out.println("Индекс" + i + " вне допустимого диапазона");
		}
		
		for (int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -1) System.out.println(x + " ");
			else
			System.out.println("Индекс " + i + "вне допустимого диапазона");
		}
	}
}
