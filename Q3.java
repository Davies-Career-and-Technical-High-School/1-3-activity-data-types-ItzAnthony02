import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in); 
      System.out.println("Only respond with true or false");
      System.out.println("Is java a programing language? true or false");
      boolean bool1 = scan.nextBoolean();
      System.out.println("Only number can be stored by variables in java. true or false");
      boolean bool2 = scan.nextBoolean();
      System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false");
      boolean bool3 = scan.nextBoolean();

    System.out.println("Your answer: " + bool1 + ". " + "Correct answer: true");
    System.out.println("Your answer: " + bool2 + ". " + "Correct answer: false");
    System.out.println("Your answer: " + bool3 + ". " + "Correct answer: true");



    }
}