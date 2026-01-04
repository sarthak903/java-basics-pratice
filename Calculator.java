import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the first number");
       int a = sc.nextInt();
       System.out.println("enter the second number");
       int b = sc.nextInt();
      // char operator;
      // System.out.println("enter the operator");
     //  char op = sc.next().charAt(0);
        int button = sc.nextInt();
        switch(button){
        case 1: System.out.println(a+b);
break;
case 2:System.out.println(a-b);
break;
case 3:System.out.println(a*b);
break;
case 4: System.out.println(a/b);
break;
default: System.out.println("invalid index");
       }
      
    
       
        
       
       
    
    }
}
