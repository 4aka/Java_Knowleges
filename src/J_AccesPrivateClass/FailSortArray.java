package J_AccesPrivateClass;

public class FailSortArray {

	// Отказоустойчивый массив
	
	private final int[] a;     // ссылка на массив
	private final int errval;  // значение которое вернется при выполнении метода get
	
	public int length;
	
	// Конструктору передается значение массива и значение которое
	// должен возвращать метод get.
	public FailSortArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	
	// Вернуть значение элемента с заданным индексом.
	public int get(int index) {
		if(indexOf(index)) return a[index]; // Отслеживание попытки выхода за границы.
		return errval;
	}
	
	// Установить значение элемента с заданным индексом.
	public boolean put(int index, int val) {
		if(indexOf(index)) { // Отслеживание попытки выхода за границы.
			a[index] = val;
			return true;
		}
		return false;
	}
	
	// true если значение не выходит за границы.
	private boolean indexOf(int index) {
		if(index >= 0 & index < length) return true;
		return false;
	}
}