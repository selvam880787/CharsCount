package chars.counts;
import java.util.Scanner;
public class DigitSum{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number ");
int number = s.nextInt();
int input = number;
int remainder=0,quotient=0,result=0;
while(input>0){
	remainder = input%10;
	quotient = input/10;
	result = result+remainder;
	input=quotient;
	}
System.out.println("Total of the number is : "+result);
}
}