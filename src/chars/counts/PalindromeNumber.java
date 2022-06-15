package chars.counts;
import java.util.Scanner;

public class PalindromeNumber {
			public static void main(String[] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number to check to palindrome or not");
			int number = s.nextInt();
			int input = number;
			int remainder = 0;
			int result = 0;
			while(input>0){
				remainder = input % 10;
				result = (result*10)+remainder;
				input = input / 10;
				
			}
			if(number==result){
			System.out.println("Entered Number is Palindrome !");
			}
			else{
				System.out.println("Entered Number is not Palindrome !");
			}
			
		}
		
	}

