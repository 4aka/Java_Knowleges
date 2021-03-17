package J_Arrays;

public class FindInfoInArray {

	public static void main(String[] args) {

		// Создание массива.
		String[][] numbers = {
				{ "Tom", "123456-789" }, 
				{ "Ann", "123456-789" }, 
				{ "Den", "123456-789" },
				{ "Tim", "123456-789" } 
		};
		int i;

		if (args.length != 1) {
			System.out.println("Использование: Java Phone <имя>");
		} else {
			// Если заданное имя совпадет с каким то элементом цикла
			// оно выведется на экран с номером
			// args[0] - входящий параметр в main. 
			for (i = 0; i < numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			if (i == numbers.length) {
				System.out.println("Имя не найдено!");
			}
		}
	}
}