package J_ConstructorsMethods;

//import ConstructorsMethods.CallConstructor.Extend.Third;

class CallConstructor {
	CallConstructor(){
		System.out.println("'A' constructor");
	}
	
	static class Extend extends CallConstructor{
		Extend() {
			System.out.println("'B' constructor");
		}
		
//		class Third extends Extend{
//			Third() {
//				System.out.println("'C' constructor");
//			}
		}
//	}
	
//	public static void main() {
//		Third c = new Third();
//	}
}