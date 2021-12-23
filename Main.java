import java.util.Scanner;    // Needed for the Scanner class
class Main {
  public static void main(String[] args) {
    int num;    // holds value of integer

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      // Get an integer.
      System.out.print("Enter integer : ");
      num = console.nextInt();

      // Get absolute value of num
      num = (num < 0) ? -num : num;
      
      System.out.println("Absolute value is " + num);
  }
}