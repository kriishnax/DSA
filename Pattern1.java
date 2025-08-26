import java.util.*;
public class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int ir = sc.nextInt();
        System.out.print("Enter the number of Coloumn:");
        int ic = sc.nextInt();
        for( int i= 1; i<=ir;i++){
            for(int j=1;j<=ic;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
