package chars.counts;

public class StringReverse {

	public static void main(String[] args) {
		String s = "selenium";
		String m="";
		System.out.println("Given String is : "+s);
		for (int i=s.length()-1; i>=0 ; i--) {
			m=m+(s.charAt(i));
		}
		System.out.println("Reversed String is : "+m);
		StringBuilder l = new StringBuilder("SELENIUM");
		System.out.println("\n"+"Given String is : "+l);
		System.out.println("Reversed String is : "+l.reverse());
	}

}
