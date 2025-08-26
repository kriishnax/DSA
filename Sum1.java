//sum of n natural numbers
import java.util.*;
public class Sum1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find the sum of n natural numbers:");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
