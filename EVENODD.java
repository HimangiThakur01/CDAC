//1. write a java program to print 'Hello' on the screen and then print your name on a separate line?//
/*class Assignment1 {
   public static void main(String[] args) {
   System.out.println("Hello\nHimangi Thakur");
   }
}

2. Sum of Two Numbers?*/
class Sum {
  public static void main(String[] args) {
  int num1 = 74;
  int num2 = 36;
  int sum = num1 + num2;
  System.out.println(sum);
  }
}

/*3. Divide Two Numbers
class divide {
  public static void main(String[] args) {
  int num1 = 50;
  int num2 = 3;
  int num3 = num1/num2;
  System.out.println(num3);
  }
}

4. Write a Java program to print the result of the following operations.
Test Data:
a. -5+8*6
b. (55+9)%9
c. 20+-3*5/8
d. 5+15/3*2-8%3 
class Operations {
  public static void main(String[] args) {
  int a = -5+8*6;
  int b = (55+9)%9;
  int c = 20+-3*5/8;
  int d = 5+15/3*2-8%3;
  System.out.println("result -5+8*6: " + a );
  System.out.println("result (55+9)%9: " + b);
  System.out.println("result 20+-3*5/8: " + c);
  System.out.println("result 5+15/3*2-8%3: " + d);
  }
}*/

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
  . Input a number: 8
import java.util.Scanner;
 class Table {
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("enter the number: ");
   int a = in.nextInt();
   for (int i = 1; i <= 10; i++)  {
      System.out.println( a + " * " + i + " = "  + (a * i) ); }
  }
}

8.Write a java program to swap the values of two variables without using a third variable.
 Test Data:
  . Input first number: 10
  . Input second number: 20
class Swap {
  public static void main(String[] args) {
  System.out.println("Before Swapping");
  int a = 10;
  int b = 20;
  System.out.println("value of a is :" + a);
  System.out.println("value of b is :" + b);
  System.out.println("After Swappping");
  a = a + b;
  b = a - b;
  a = a - b;
  System.out.println("value of a is :" + a);
  System.out.println("value of b is :" + b);
  }
}

9.Write a java program that calculates the area of a circle.
Test Data:
 . Input the radius: 7
 . Formula: Area = pi*radius^2
class Radius {
 public static void main(String[] args) {
   int radius = 7;
   double pi = 3.14, area;
   area = pi * radius * radius;
   System.out.println("Area of circle is :" + area);
   }
}

10.Check if a Number is Even or Odd.*/
  import java.util.Scanner;  
  class EVENODD {
     public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
     System.out.println("enter a number :");

      int a = in.nextInt(); 
      if (a % 2 == 0)
        System.out.println("the number :" + a + " : is even ");
      else
        System.out.println("the number :" + a + " : is odd ");}
        }
}      

   

































