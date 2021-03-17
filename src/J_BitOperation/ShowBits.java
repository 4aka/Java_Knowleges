package J_BitOperation;

public class ShowBits {

	int numBits;
	
	ShowBits(int n){
		numBits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		mask <<= numBits-1;
		int spacer = 0;
		for(; mask != 0; mask >>>= 1) {
			if((val & mask) != 0) {
				System.out.print("1");
			} else {
				System.out.print("0");
			}
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);
		
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("87987 in binary: ");
		i.show(87987);
		
		System.out.println("237658768 in binary: ");
		li.show(237658768);
		
		System.out.println("Младшие 8 бит числа 87987");
		b.show(87987);
	}
}