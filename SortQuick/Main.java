package SortQuick;

public class Main {

	public static void main(String[] args) {
		char[] a = { 'j', 'r', 'z', 'a', 'u', 'w', 'm', 'f', 'k', 'a', 'i', 'z', 'c', 'e', 'q' };
		int i;

		System.out.println("Исходный массив: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println();

		Sort.qsort(a);

		System.out.println("Отсортированный массив: ");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
