import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter the First number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
          System.out.println("Enter the button");
        System.out.println("1:Add  2:Sub  3:Mul  4:Div  5:Mod  6:Square");
        int button = sc.nextInt();
    
    
        switch(button){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            if(b==0){
                System.out.println("b cannot be zero");
            }
            else {
                System.out.println(a/b);
            }
            break;
            case 5:System.out.println(a%b);
            if(a%b==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
            break;
            case 6: System.out.println(a^b);
            int power =1;
            for(int i =1;i<= b;i++){
                power = power*a;
                System.out.println(power);
            }
            break;
            default:System.out.println("invalid button");
        
        }

        
        
      }
    }

