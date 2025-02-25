/*5.Write a java program that takes two numbers as input and displays the product of the two number.
Test data:
  . Input first number:25
  . Input second number:5
import java.util.Scanner;
 class Multiply {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Input first number: ");
    int a = in.nextInt();
    System.out.println("Input second number: ");
    int b = in.nextInt();
    System.out.println( a + " x " + b + " = "  + a * b );}
}*/

/*6.Write a java program to print the sum, multiplication, subtraction, division, and remainder of two numbers.
Test Data:
  . Input first number: 125
  . Input first number: 24
import java.util.Scanner;
 class ArithmeticOP {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Input first number: ");
    int a = in.nextInt();
    System.out.println("Input second number: ");
    int b = in.nextInt();
    System.out.println( a + " + " + b + " = "  + (a + b) );
    System.out.println( a + " - " + b + " = "  + (a - b) );
    System.out.println( a + " * " + b + " = "  + (a * b) ); 
    System.out.println( a + " / " + b + " = "  + (a / b) );
    System.out.println( a + " mod " + b + " = "  + (a % b) );
    }
} 

7.Write a java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
  . Input a number: 8*/
import java.util.Scanner;
 class Table {
   public static void main(String[] args);
 {
  Scanner in = new Scanner(System.in);
  System.out.println("enter the number: ");
  int a = in.nextInt();
  for (int i = 1; i <= 10; i++){
  System.out.println( a + " * " + i + " = "  + (a * i) ); }
  }
}