import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int  number = scanner.nextInt();
      if(number<0)
      {
          System.out.println("Number is negative");
      }
      else
      {
          System.out.println("Number is positive");    
      }
    }
}
