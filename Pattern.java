import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number");
      int num = scanner.nextInt();
      int i,j,k;
      for(i=0;i<num;i++){
          k =num;
          for(j=0;j<num;j++){
            if(i>j){
                System.out.print(k-- +" ");
            }
            else{
            System.out.print(k +" ");
            }
          }
          System.out.println();
      }
    }
}
