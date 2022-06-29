package chars.counts;
import java.util.Scanner;
public class SentenceReverse{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the sentence");
String sentence = s.nextLine();
String[] sen = sentence.split(" ");
for(int i=0;i<sen.length;i++){
	for(int j=sen[i].length()-1;j>=0;j--){
		System.out.print(sen[i].charAt(j));
	}
	System.out.print(" ");
}
}
}