package J_Queue;

public class Queue {

	private final char[] q; // Массив для хранения символов.
	private int putloc;
	private int getloc; // извлечение и запись элемнтов.

	public static void main(String[] args) {

		// Queue can be cyclic and non cyclic.
		// can be empty, overflowing, normal
		// Queue - it when first client come
		// and this client be service.

		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println();

		System.out.println("Использование очереди bigQ для сохранения алфавита");
		// Поместить в очередь.
		for (i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}

		// Извлечь из очереди
		System.out.println("Содержание очереди bigQ: ");
		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0) {
				System.out.print(ch + " ");
			}
		}

		System.out.println("\n");

		System.out.println("Использование очереди smallQ для генерации ошибок.");
		for (i = 0; i < 5; i++) {
			System.out.println("Попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();

		// Дополнительные ошибки при обращении к очереди smallQ
		System.out.println("Содержание smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();
			if (ch != (char) 0) {
				System.out.println(ch);
			}
		}
	}

	Queue(int size) {
		q = new char[size + 1]; // Особенность. Один элемент должен остаться неиспользованным.
		putloc = getloc = 0; // Приравниваем к нулю обе операции.
	}

	/*
	 * Проверка переполненоости очереди. Если значение переменной putloc = последней
	 * позиции в массиве, то места в очереди нет.
	 */
	void put(char ch) {
		if (putloc == q.length - 1) {
			System.out.println(" - Очередь заполнена.");
			return;
		}
		// Если место есть - инкрементируем.
		putloc++;
		q[putloc] = ch;
	}

	/*
	 * Проверяется наличие элементов в очереди. Если getloc = putloc то элементов
	 * нет.
	 */
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста.");
			return (char) 0;
		}

		// Если очередь не пуста - инкрементируем.
		getloc++;
		return q[getloc];
	}

}
