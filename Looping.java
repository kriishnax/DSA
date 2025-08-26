//Program to print n numbers using while loop

import java.util.*;
public class Looping {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int range = sc.nextInt();
        int counter = 1;
        sc.close();
        while(counter<=range){
            System.out.println(counter);
            counter++;
        }
    }
}
