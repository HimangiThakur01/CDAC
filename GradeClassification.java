/*Snippet 1: 
public class Main {
  public void main(String[] args){
    System.out.println("Hello, World!");
  }
}
What error do you get when running this code?
- Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args) 

Snippet 2:
public class Main {
  static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
What happens when you compile and run this code?
- Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Snippet 3:
public class Main {
 public static int main(String[] args) {
   System.out.println("Hello, World!");
   return 0;
   }
}
What error do you encounter? why is void used in the main method?
- Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args) 

Snippet 4:*/
/*public class Main {
 public static void main() {
   System.out.println("Hello, World!");
   }
}
What happens when you compile and run this code? why is String[] args needed?
- Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application.

Snippet 5:
public class Main {
  public static void main(String[] args) {
    System.out.println("Main method with String[] args");
  }
  public static void main(int[] args) {
    System.out.println("Overloaded main method with int[] args");
  }
}
Can you have multiple main method in this code? what you observe?
- Yes, I have multiple main methods in the code with different parameters, like String[] and int[].when I run the program, only the main(String[] args) method will be called by default, not the main(int[] args) method.*/

/*Snippet6:
public class Main {
 public static void main(String[] args) {
   int x = y + 10;
   System.out.println(x);
 }
}
What error occurs? Why must variables be declared?
- error: cannot find symbol
   int x = y + 10;
           ^
  symbol:   variable y
  location: class Main.

Snippet 7:
public class Main {
  public static void main(String[] args) {
    int x = "Hello";
    System.out.println(x);
    }
}
What compilation error do you see? why does java enforce type safety?
- error: incompatible types: String cannot be converted to int
    int x = "Hello";
- Java enforces type safety to prevent mistakes like using the wrong types of data together. It helps catch errors early, making the program more reliable and easier to understand.

Snippet 8:
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!"
  }
}
What syntax errors are present? How do they affect compilation?
- error: ')' expected
    System.out.println("Hello, World!"
- This ensures that the method call is properly closed, allowing the code to compile without syntax errors

Snippet 9:*/
/*public class Main {
  public static void main(String[] args) {
    int class = 10;
    System.out.print(class);
  }
}
What error occurs? why can't reserved keywords be used as identifiers?
 error: not a statement
    int class = 10;
    ^
Main.java:96: error: ';' expected
    int class = 10;
       ^
Main.java:96: error: <identifier> expected
    int class = 10;
             ^
Main.java:97: error: <identifier> expected
    System.out.print(class);
                    ^
Main.java:97: error: illegal start of type
    System.out.print(class);
                     ^
Main.java:97: error: <identifier> expected
    System.out.print(class);
                          ^
Main.java:99: error: reached end of file while parsing
}
 ^
7 errors

- Reserved keywords in Java cannot be used as identifiers because they have predefined meanings that are essential to the language's syntax and functionality. Using these keywords as identifiers would lead to confusion and potential errors in the program.*/

/*Snippet 10:
public class Main {
 public void display() {
  System.out.println("No parameters");
 }
 public void display(int num) {
   System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
   display();
   display(5);
 }
}
What happes when you compile and run this code? Is method overloading allowed?
- This code will not compile because display() is called inside main() without an object, but display() is a non-static method. Method overloading is allowed, but to fix the error, create an object of Main and call display() using obj.display();. Then, it will work correctly.

Snippet 11:*/
/*public class Main {
 public static void main(String[] args) {
  int[] arr = {1,2,3};
  System.out.println(arr[5]);
  }
}
What runtime exception do you encounter? Why does it occur?
- This code gives an ArrayIndexOutOfBoundsException because arr[5] tries to access the 6th element, but the array has only 3 elements (indexes 0 to 2). This happens when you try to access an index that does not exist in the array, causing the program to crash at runtime.

Snippet 12:
public class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.println("Infinite Loop");
    }
  }
}
What happens when you run this code? How can you avoid infinite loops?
- This code creates an infinite loop, printing "Infinite Loop" forever because while (true) never stops. To avoid this, use a condition that eventually becomes false, like while (count < 5), or add a break statement inside the loop to exit when needed.

Snippet 13:
public class Main {
  public static void main(String[] args) {
    String str = null;
    System.out.println(str.length());
  }
}
What exception is thrown? Why does it occur?
- This code throws a NullPointerException because str is null, meaning it has no value. When str.length() is called, the program tries to find the length of something that doesn’t exist, causing a crash. To fix this, check if str is null before calling .length().*/

/*Snippet 14:
public class Main {
  public static void main(String[] args) {
    double num ="Hello";
    System.out.println(num);
  }
}
What compilation error occurs? Why does java enforce data type constraints?
- This code gives a compilation error because "Hello" is a String, but num is a double, and Java does not allow assigning different data types directly. Java enforces data type constraints to prevent errors, ensure memory efficiency, and make programs more reliable by catching mistakes before running them.

Snippet 15:
public class Main {
  public static void main(String[] args) {
    int num1 = 10;
    double num2 = 5.5;
    int result = num1 + num2;
    System.out.println(result);
What error occurs when compiling this code? How should you handle different data types in operations? 
- This code gives a compilation error because num1 + num2 results in a double, but result is an int, causing a type mismatch. To fix this, either change result to double or use type casting like int result = (int) (num1 + num2); to handle different data types properly.*/

/*Snippet 16: 
public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 
What is the result of this operation? Is the output what you expected?
The output is 2.0, not 2.5 as expected. This happens because num / 4 does integer division (10 and 4 are both integers), so 10 / 4 gives 2, and then it's stored as double. To get 2.5, use double result = num / 4.0;.*/

/*Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 }
}
What compilation error occurs? Why is the ** operator not valid in Java?
- This code gives a compilation error because ** is not a valid operator in Java for exponentiation. Java does not support ** like Python. Instead, use Math.pow(a, b), but note it returns a double, so write int result = (int) Math.pow(a, b); to store it as an integer.

Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
What is the output of this code? How does operator precedence affect the result?
- The output is 20, not 30. This happens because operator precedence applies: * (multiplication) is done before + (addition). So, b * 2 gives 10, then a + 10 gives 20. To change the order, use parentheses: result = (a + b) * 2; will give 30.

Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
What runtime exception is thrown? Why does division by zero cause an issue in Java?
- This code throws an ArithmeticException because dividing an integer by zero is not allowed in Java. Division by zero is undefined in mathematics, so Java stops the program to prevent incorrect results. To avoid this, always check if the denominator is zero before dividing: if (b != 0).*/

/*Snippet 20: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} 
What syntax error occurs? How does the missing semicolon affect compilation? 
- This code gives a syntax error because the semicolon (;) is missing after System.out.println("Hello, World"). Java needs a semicolon to end a statement. Without it, the compiler doesn't know where the statement ends, causing an error. To fix this, add ; at the end: System.out.println("Hello, World");.

Snippet 21:
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 
What does the compiler say about mismatched braces?
- The compiler gives an error because the closing brace (}) is missing at the end. Java needs matching opening { and closing } braces to know where a block of code starts and ends. To fix this, add a closing brace } after the last line.*/

/*Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
What syntax error occurs? Can a method be declared inside another method?
- This code gives a syntax error because a method cannot be declared inside another method in Java. Here, displayMessage() is inside main(), which is not allowed. To fix this, move displayMessage() outside main(). Java requires methods to be declared inside a class, not inside another method.

Snippet 23: 
public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
} 
Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?
- The default case prints because there are no break statements in the switch case. Once case 2 matches, it keeps executing the next cases until the end.

Snippet 24: 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 
Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 
- This happens because there are no break statements in the switch case. When level is 1, it starts at case 1 and keeps executing all cases below it.*/

/*Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work? 
- This code does not compile because switch only works with int, char, byte, short, String, or enum, but score is double, which is not allowed.

Fix:
Change double score to int score, or use if-else instead of switch.

Snippet 26: 
public class Switch { 
 public static void main(String[] args) { 
  int number = 5; 
  switch(number) { 
     case 5: 
       System.out.println("Number is 5");
       break;
     case 5:
       System.out.println("This is another case 5");
       break;
     default:
       System.out.println("This is the default case");
     }
   }
}
Why does the compiler complain about duplicate case labels? what happens when you have two identical case labels in the same switch block?
- The compiler gives an error because case 5 appears twice, which is not allowed. Each case must be unique.

Fix:
Remove the duplicate case 5 or merge both cases into one.


Java Programming with Conditional Statements 

Question 1: Grade Classification 
Write a program to classify student grades based on the following criteria: 
If the score is greater than or equal to 90, print "A" 
If the score is between 80 and 89, print "B" 
If the score is between 70 and 79, print "C" 
If the score is between 60 and 69, print "D" 
If the score is less than 60, print "F" */

import java.util.Scanner;

public class GradeClassification {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the student's score: ");
    int score = scanner.nextInt();

    if (score >= 90) {
      System.out.println("Grade: A");
    } else if (score >= 80) {
      System.out.println("Grade: B");
    } else if (score >= 70) {
      System.out.println("Grade: C");
    } else if (score >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
    
    scanner.close();
  }
}


































































