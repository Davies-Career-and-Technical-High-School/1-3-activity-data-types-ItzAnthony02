import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
      System.out.println("Please enter a double.");
        /* Write your code here */
      double num1 =  scan.nextDouble();
      System.out.println("Please enter another double.");
      double num2 =  scan.nextDouble();
      System.out.print(num2 + " ");
      System.out.print(num1);
    }
}