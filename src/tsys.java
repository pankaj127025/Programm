
public class tsys {
	public static void main(String[] args) {
		String p = "Pankaj@123#";

		StringBuffer alphabet = new StringBuffer();
		StringBuffer numbers = new StringBuffer();
		StringBuffer specialcharacter = new StringBuffer();

		for (int i = 0; i < p.length(); i++) {
			if (Character.isAlphabetic(p.charAt(i)))
				alphabet.append(p.charAt(i));

			else if (Character.isDigit(p.charAt(i)))
				alphabet.append(p.charAt(i));
			else
				specialcharacter.append(p.charAt(i));

		}
		System.out.println(specialcharacter);
	}

}
