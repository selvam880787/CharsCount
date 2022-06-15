package chars.counts;

public class String_Mirroring {

	public static void main(String[] args) {

//		initializing a string
		String input = "Welcome To Java Class";
		System.out.println("Given String : " + input);
		String output = "";

//	 split the string by the spaces
		String words[] = input.split(" ");

		for (int i = 0; i < words.length; i++) {
//	      getting individual words from that string array
			String word = words[i];

			String revWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
//	    	  reversing the word
				revWord = revWord + word.charAt(j);
			}
			output = output + revWord + " ";
		}

		// Displaying the string after reverse
		System.out.print("Reversed string : " + output);
	}
}
