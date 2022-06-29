package chars.counts;
import java.util.Scanner;
public class StringPalindrome{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the string");
String input = s.next();
String rev="";
for(int i=input.length()-1;i>=0;i--){
	rev = rev + input.charAt(i);
	}
if(input.equals(rev)){
	System.out.println("The string is palindrome");
}else{
	System.out.println("The string is not palindrome");
}
}
}