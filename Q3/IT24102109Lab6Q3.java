import java.util.Scanner;
import java.lang.Math;

public class IT24102109Lab6Q3{
      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          int num, square;
          int count = 0;
          double mean_square, rms, sum_of_squares = 0;

          System.out.println("Enter positive integers (terminate input with -99): ");


          do{
               
               System.out.print("Enter a number: ");
               num = sc.nextInt();

               if( num < 0 && num != -99){
         
                      System.out.println("Invalid input. Please enter a positive integer or -99 to terminate): ");
                      continue;

               }
               else if (num == -99){

                      break;
               }
               else{

                      square = num*num;
                      sum_of_squares = sum_of_squares + square;     
                      count = count + 1;

               }  

               

          }while(true);

          mean_square = sum_of_squares / count;

          rms = Math.sqrt(mean_square);

          System.out.println(" ");
          
          System.out.println("The Root Mean Square (RMS) is: " + rms);
          

      }

}