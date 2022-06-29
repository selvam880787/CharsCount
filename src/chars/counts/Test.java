package chars.counts;

public class Test {

	public static void main(String[] args) {
		String str = "welcome to java class";
		String[] sp = str.split(" ");
		String res = "";

		for (String s : sp) {
			
			char c = s.charAt(0);

			String sub = s.substring(1);

			res = res + Character.toUpperCase(c) + sub + " ";

		}

		System.out.println(res);

	}

}
