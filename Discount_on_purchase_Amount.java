import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the purchase amount:");
      double  prchAmount = scanner.nextDouble();
      if(prchAmount>=500 && prchAmount<=1000){
          prchAmount = prchAmount - prchAmount/10;
      }
      else if(prchAmount>1000){
          prchAmount = prchAmount - (prchAmount/10 *2);
      }
      System.out.println(prchAmount);
    }
}
