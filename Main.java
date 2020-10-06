import java.util.Scanner;

/**
 * program that writes x amount of numbers in a row
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  // ask the user for a positive integer
    System.out.println("Please enter a positive integer");
    int num = input.nextInt();

    // create row of numbers up until the users chosen number
    for (int i = 1; i < num; i++) {
      System.out.print(i + ", ");

    }
    // finally print the number they originally chose, this number has no comma after it
    System.out.print(num);
    
  }
}
