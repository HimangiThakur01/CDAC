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
- Yes, I have multiple main methods in the code with different parameters, like String[] and int[].when I run the program, only the main(String[] args) method will be called by default, not the main(int[] args) method.

Snippet6:
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
public class Main {
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
public class Main {
 public static void main(String[] args) {
  int[] arr = {1,2,3};
  System.out.println(arr[5]);
  }
}










