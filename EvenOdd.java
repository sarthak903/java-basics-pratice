import java.util.*;
public class Modulo {
    public static void Claculate(int n){
        if(n % 2 ==0){
            System.out.println("Even");
        }
        else if (n % 2 !=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Invaild number:");
        }
        return;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        // call
        Claculate(n);
    }
    

}
    
