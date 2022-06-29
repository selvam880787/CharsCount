package chars.counts;

public class Reversing_String{

public static void main(String[] args) {

String input = "java programming with selenium and jira";

String rev="";

String output = "";

String words[] = input.split(" ");

	for(int i=0;i>=words.length;i++) {
		String word=words[i];

		for(int j=word.length()-1;j>=0;j--) {
			rev = rev+word.charAt(j)+" " ;
		}
	output = output+rev+" ";
	System.out.println(output);
	}
}
}
