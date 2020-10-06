import java.util.Scanner;


class Q2 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in); 
      System.out.println("What is your name?");
        /* Write your code here */
      String name =  scan.nextLine();
      System.out.println("How old are you?.");
      Integer num =  scan.nextInt();
      System.out.print("Hi "+ name + " you are " + num + " years old.");
      
    }
}