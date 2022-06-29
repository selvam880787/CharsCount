package chars.counts;
import java.util.Scanner;
public class Fibonacci{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number to find Fibonacci :"+"\n");
int number = s.nextInt();
int a=-1;
int b=1;
int c=0;
while(c<number){
System.out.print(c+"\t");
a=b;
b=c;
c = a+b;
}
}
}


