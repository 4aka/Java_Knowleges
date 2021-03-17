package J_UniqSymbol;

public class UniqSymbol {
	public static void train(String[] args) {
		String str = "qwertyuапвrапренгщшгшзщшiopaйцтыфк@№[qwйцу!@#$%^&*()!;;"
				+ "№;:;:%:?%:*?(?)?*(*укеенгнгшшщзфыввапапорплдячсчсямсмтимиьe"
				+ "ertyuiiopasddfsgghfjhjklzxcxcbvbnmsdfghjklzxcvbn56tyu7567шж"
				+ "щджло.;.;..;w;[ekp;ok21qo342359*&%&$#&&&^bnm12334556767897890";

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.println("WOW uniq element is: " + str.charAt(i));
				break;
			}
		}
	}
}