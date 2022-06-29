package chars.counts;
import java.util.Scanner;
public class DigitMultiplication{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number ");
int number = s.nextInt();
int result=1,remainder=0;
while(number>0){
	remainder = number%10;
	result = result*remainder;
	number=number/10;
		}
	System.out.println("The multiplication value of the enterd number is : "+result);
}
}