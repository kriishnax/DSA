import java.util.*;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int n = sc.nextInt();
        sc.close();
        while (n>0) {
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n/=10;

            
        }

    }
    
}
