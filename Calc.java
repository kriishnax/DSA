import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the operations + - * /");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+': System.out.print( a + b );
            break;
            case '-': System.out.print( a-b );
            break;
            case '*': System.out.print( a * b );
            break;
            case '/': System.out.print( a / b );
            break;

           
                
            default: System.out.println("wrong operator");
                break;
        }


    }
}
