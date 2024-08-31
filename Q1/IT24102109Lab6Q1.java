import java.util.Scanner;
import java.lang.Math;

public class IT24102109Lab6Q1{
     public static void main(String[] args){

         int num, square;
         double square_root;

         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a number: ");
         num = sc.nextInt();

         square = num*num;
         square_root = Math.sqrt(num);

         System.out.println(" ");
         System.out.println("The square of " + (double)num + " is : " + (double)square);
         System.out.println("The square root of " + (double)num + " is : " + square_root);


     }

}