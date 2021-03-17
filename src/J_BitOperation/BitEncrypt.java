package J_BitOperation;

public class BitEncrypt {
	
	public static void main(String[] args) {
		encription(88, "Test message");
		System.out.println("****************************");
		encription(0101010, "@#$$#%$%^%^**(()*()*(^&*&$#$$@##@@@!!!");
		System.out.println("****************************");
		encription(00000001, "Viola");
		System.out.println("****************************");
		encription(1, "This is a test");
	}
	
	public static String encription(int key, String encryptMsg) {
		String gotMsg = encryptMsg;
		String encmsg = "";
		String decmsg = "";
		int gotKey = key;
		
		System.out.println("Getted message: ");
		System.out.println(gotMsg);
		
		for(int i = 0; i < gotMsg.length(); i++) {
			// T  = 01010100 ^
			// 88 = 01011000 => 00001100
			// e  = 0110 0101,
			// 88 = 0101 1000 => 00111101
			
			// encrypted message: =+,x59++9?= = 12 symbols
			// got message:       Test message = 12 symbols
			
			// ************************************
			// Encryption makes with ALT code table. Tables are located in resources.
			// ************************************
			encmsg = encmsg + (char) (gotMsg.charAt(i) ^ gotKey);
		}
		System.out.println("Ecrypted message: ");
		System.out.println(encmsg);

		for(int i = 0; i < gotMsg.length(); i++) {
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ gotKey);
			// При применении исключающего ИЛИ дважды - результат 
			// шифрования будет равен исходному сообщению.
			// R1 = Х ^ Y; R2 = R1 ^ Y; 
		}
		
		System.out.println("Decrypted message: ");
		System.out.println(decmsg);
		
		return decmsg;
	}
}
