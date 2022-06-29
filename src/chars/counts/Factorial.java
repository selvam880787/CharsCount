package chars.counts;
import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner s = new  Scanner(System.in);
System.out.println("Enter the number to find factorial");
int number = s.nextInt();
int input = number;
int result=1;
int fact=1;
while(number>1){
	result = result * number;
	number = number - 1;
	if(number==0){
		break;
	}
}
for(int i=1;i<=input;i++){
	fact=fact*i;
}
System.out.println("Facorial for given number is :"+result);
System.out.println("\n"+"Facorial for given number is :"+fact);
}
}