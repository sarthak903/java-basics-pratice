import java.util.*;
public class Book {
 // public static int CalculateProduct(int a,int b){
//return a*b;
    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        
        int factorial =1;

        for(int i = n;i>=1;i--){
            factorial = factorial*i;

        }
        System.out.println(factorial);
        return;
    }
  public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      printFactorial(n);

  }
    
}
