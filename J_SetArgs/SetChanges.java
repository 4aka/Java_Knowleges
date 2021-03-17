package J_SetArgs;

public class SetChanges {
	
	int a;
	int b;
	
	/*
	 * Если метод main будет находится в другом классе результат не изменится.
	 */
	public static void main(String[] args) {
		SetChanges ob = new SetChanges(15, 20);
		System.out.println("ob.a & ob.b befor call to method: " + ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a & ob.b after call to method: " + ob.a + " " + ob.b);
		
		// ob.a & ob.b befor call to method: 15  20
		// ob.a & ob.b after call to method: 35 -20
	}
	
	// Конструктор класса
	public SetChanges(int i, int j) {
		a = i;
		b = j;
		System.out.println("a & b: " + a + " " + b);
		System.out.println("i & j: " + i + " " + j);
	}
	
	// Передаваемый параметр является объектом, а не значением переменной.
	// А точнее ссылкой на объект.
	void change(SetChanges ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
		System.out.println("ob.a: " + ob.a);
		System.out.println("ob.b: " + ob.b);
	}
}
