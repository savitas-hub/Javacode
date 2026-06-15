package module;

public class assignment68 {

	static int charcter = 0;
	static int charctersp = 0;
	static int numerical = 0;
	static int charcterspecialChar = 0;

	public static void main(String[] args) {
		String str = "My name is@!@12 Savita kk";
		char[] c1 = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			boolean b = Character.isAlphabetic(c1[i]);

			if (b) {
				charcter++;
			}

			boolean b1 = Character.isWhitespace(c1[i]);

			if (b1) {
				charctersp++;
			}

			boolean b2 = Character.isDigit(c1[i]);

			if (b2) {
				numerical++;
			}

		}

		System.out.println("Alphabet Count;->" + charcter);
		System.out.println("space Count;->" + charctersp);
		System.out.println("numerical Count;->" + numerical);
		charcterspecialChar = str.length() - (charcter + charctersp + numerical);
		System.out.println("specialcharcter Count;->" + charcterspecialChar);
	}
}
