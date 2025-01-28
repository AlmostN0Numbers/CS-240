// Reid Morin
// CS 240 
// 1-28-25
// Generates a lottery number, has the user input a guess, and then checks to see if the guess contains any matches to the lottery number
public class Exercise03_15 {
  public static void main(String[] args) {
      // Generate a lottery num
      int lottery = (int)(Math.random() * 1000);
      // Prompt the user 
      java.util.Scanner input = new java.util.Scanner(System.in);
      System.out.print("Enter your lottery pick (three digits): ");
      int guess = input.nextInt();
      // Extract int of the lottery and guess 
      int l1 = lottery / 100;         // First digit of lottery
      int l2 = (lottery % 100) / 10;  // Second digit of lottery
      int l3 = lottery % 10;          // Third digit of lottery
      int g1 = guess / 100;           // First digit of guess
      int g2 = (guess % 100) / 10;    // Second digit of guess
      int g3 = guess % 10;            // Third digit of guess
      System.out.println("Lottery number is " + lottery);
      // Check for exact 
      if (guess == lottery) {
          System.out.println("Exact match: you win $10,000");
      }
      // Check for match all digits in any order
      else if ((g1 == l1 || g1 == l2 || g1 == l3) &&
               (g2 == l1 || g2 == l2 || g2 == l3) &&
               (g3 == l1 || g3 == l2 || g3 == l3)) {
          System.out.println("Match all digits: you win $3,000");
      }
      // Check for match two digits in any order
      else if ((g1 == l1 || g1 == l2 || g1 == l3) &&
               (g2 == l1 || g2 == l2 || g2 == l3) ||
               (g1 == l1 || g1 == l2 || g1 == l3) &&
               (g3 == l1 || g3 == l2 || g3 == l3) ||
               (g2 == l1 || g2 == l2 || g2 == l3) &&
               (g3 == l1 || g3 == l2 || g3 == l3)) {
          System.out.println("Match two digits: you win $2,000");
      }
      // Check for match one digit
      else if (g1 == l1 || g1 == l2 || g1 == l3 ||
               g2 == l1 || g2 == l2 || g2 == l3 ||
               g3 == l1 || g3 == l2 || g3 == l3) {
          System.out.println("Match one digit: you win $1,000");
      }
      // No match
      else {
          System.out.println("Sorry, no match");
      }
      input.close();
  }
}
