import java.util.Scanner;

/**
 * This program generates a random number from 1 to a max that the user has input.
 * 
 * @author Nick P-A
 * @since 2020/2/13 feb 28 2020
 * @version 1.0
 */
 
 
public class Diceroll {
  static int randomInt;
  static int maxValue;
  
  /**
  * This class generates a random number from 1 to a max that the user has input.
  */
  

  public static void main(String[] args) {
    usingMathClass();
  }
 
  /**
   * This class generates a random number from 1-6 and lets the user try to guess it.
  */
  
  
  
  public static void usingMathClass() {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Choose a max value: ");
    maxValue = userInput.nextInt();
    double randomDouble = Math.random();
    randomDouble = randomDouble * maxValue + 1;
    int randomInt = (int) randomDouble;

    
    System.out.println("The number is " + randomInt);
  }
}

  