package Guleri;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
    System.out.println("do you wnt to check is two number are divisible or not\n" +
            "please enter any two numbers:");
   int num1 = input.nextInt();
   int num2=input.nextInt();
   try{
       double quotient=(double)(num1/num2);
       double remainder=(double)(num1%num2);
       System.out.println(num1+" /"+ num2+" :quotient = "+ quotient +"& remainder = "+remainder);
   }
   catch(ArithmeticException e)
   {
       System.err.println("Error : invalid argument");
   }
        System.out.println("thanks for using this program");
    }
}
