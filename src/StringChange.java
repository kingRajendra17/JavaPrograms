
public class StringChange {

	public static void main(String[] args) {

		String str = "NeUro_GianT_pvT";

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isUpperCase(c)) {
				output.append(Character.toLowerCase(c));
			} else {
				output.append(Character.toUpperCase(c));
			}
		}
		System.out.println(output.toString());

	}

}
