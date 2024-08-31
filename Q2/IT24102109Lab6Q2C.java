import java.util.Scanner;

public class IT24102109Lab6Q2C{
     public static void main(String[] args){

          String num;
          String num_list = "";
          int count = 1;
          int sum = 0, Int_num;
          double average;

          Scanner sc = new  Scanner(System.in);

          System.out.println("Please enter 10 numbers: ");

          while(count <= 10){

            System.out.print("Enter number " + count + ": ");
            num = sc.next();

            if(count == 1){

                num_list = num_list + num;

            }
            else{

                num_list = num_list + " " + num; 

            }

            Int_num = Integer.parseInt(num, 10);
            sum = sum + Int_num;
            average = (double)sum/count;


            if(count == 10){

                System.out.println(" "); 
                System.out.println("The numbers you entered are: ");
                System.out.println(num_list);

                System.out.println(" ");
                System.out.println("Sum of the numbers: " + sum);
                System.out.println("Average of the numbers: " + average);

            }

            count ++ ;

          }  

     }

}