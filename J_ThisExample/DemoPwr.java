package J_ThisExample;

public class DemoPwr {

	public static void main(String[] args) {
		
		// new object with sending parameters.
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);

		System.out.println(x.b + " � ������� " + x.e + " ����� " + x.get_pwr());
		System.out.println(y.b + " � ������� " + y.e + " ����� " + y.get_pwr());
		System.out.println(z.b + " � ������� " + z.e + " ����� " + z.get_pwr());
	}
}
