import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int  number = scanner.nextInt();
      int reverseNumber = 0;
      while(number !=0){
          int digit = number % 10;
          reverseNumber = reverseNumber * 10 + digit;
          number = number/10;
      }
      System.out.println(reverseNumber);
    }
}
