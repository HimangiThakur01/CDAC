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
}*/

/*8.Write a java program to swap the values of two variables without using a third variable.
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
}*/

/*9.Write a java program that calculates the area of a circle.
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

10.Check if a Number is Even or Odd.
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

11. Find the largest of three numbers 
import java.util.Scanner;
  public class Largestno {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(" enter first number :" + a);
    int a = in.nextInt();
    System.out.println(" enter second number :" + b);
    int b = in.nextInt();
    System.out.println(" enter third number :" + c);
    int c = in.nextInt();
    int largest = (a > b ) ? ((a > c) ? a : c ) : ((b > c) ? b : c);
    System.out.println(" the largest number is :" + largest);
    in.close();
     }
}

12. Reverse a Number*/
/*import java.util.Scanner;

public class mate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
  
13.Calculate the Average of Three Numbers
Write a Java program to calculate the average of three numbers.
Test Data:
Input first number: 20
Input second number: 40
Input third number: 60
import java.util.Scanner;

public class AverageCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Input second number: ");
    double num2 = scanner.nextDouble();

    System.out.print("Input third number: ");
    double num3 = scanner.nextDouble();
    double average = (num1 + num2 + num3) / 3;

    System.out.println("The average is: " + average);

    scanner.close();
  }
}

14. Print the Fibonacci Series
Write a Java program to print the Fibonacci series up to the 10th number.
public class FibonacciSeries {
  public static void main(String[] args) {
    int n = 10; 
    int first = 0, second = 1;

    System.out.println("Fibonacci Series up to " + n + " terms:");

    for (int i = 1; i <= n; i++) {
      System.out.print(first + " ");

      int next = first + second;
      first = second;
      second = next;
    }
  }
}
   
15.Find the Factorial of a Number
Write a Java program to find the factorial of a number.*/

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    long factorial = 1;

    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }

    System.out.println("Factorial of " + num + " is: " + factorial);

    scanner.close();
  }
}

16. Check Whether a Number Is Prime
Write a Java program to check whether a number is prime or not.

import java.util.Scanner;

public class PrimeNumberCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    boolean isPrime = true;

    if (num <= 1) {
      isPrime = false;
    } else {
      
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      System.out.println(num + " is a Prime number.");
    } else {
      System.out.println(num + " is not a Prime number.");
    }

    scanner.close();
  }
}

17. Print the First N Natural Numbers
Write a Java program to print the first N natural numbers, where N is provided by the user.
Test Data:
Input a number: 6

import java.util.Scanner;

public class NaturalNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int N = scanner.nextInt();

    System.out.println("The first " + N + " natural numbers are:");

    for (int i = 1; i <= N; i++) {
      System.out.print(i + " ");
    }

    scanner.close();
  }
}

18. Convert Celsius to Fahrenheit
Write a Java program to convert a temperature from Celsius to Fahrenheit.
Test Data:
Input temperature in Celsius: 25 
Formula: Fahrenheit = (Celsius * 9/5) + 32

import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input temperature in Celsius: ");
    double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    scanner.close();
  }
}

19. Calculate the Power of a Number
Write a Java program that calculates the power of a number. Take two numbers as input: the 
base and the exponent, and compute the result of base raised to the power of exponent.
Test Data:
Input base number: 3
Input exponent number: 4

import java.util.Scanner;

public class PowerCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input base number: ");
    int base = scanner.nextInt();

    System.out.print("Input exponent number: ");
    int exponent = scanner.nextInt();

    double result = Math.pow(base, exponent);

    System.out.println(base + " raised to the power " + exponent + " is: " + result);

    scanner.close();
  }
}

20. Count the Number of Digits in a Number
Write a Java program that counts the number of digits in a given number.
Test Data:
Input number: 123456 

import java.util.Scanner;

public class DigitCounter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number: ");
    int num = scanner.nextInt();

    int count = 0;
    int temp = num;

    while (temp != 0) {
      temp /= 10;  
      count++; 
    }

    System.out.println("Number of digits in " + num + " is: " + count);

    scanner.close();
  }
}























