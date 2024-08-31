import java.util.Scanner;

public class IT24102109Lab6Q2B{
     public static void main(String[] args){

          String num;
          String num_list = "";
          int count = 1;

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



            if(count == 10){

                System.out.println(" "); 
                System.out.println("The numbers you entered are: ");
                System.out.print(num_list);

            }

            count ++ ;

          }  

     }

}