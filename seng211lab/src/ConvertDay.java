import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the number between 1-7");
         int number = input.nextInt();

         if(number  == 1){
             System.out.print("1-monday");
         }
         else if(number  == 2){
            System.out.print("2-tuesday");
        }
         else if(number  == 3){
             System.out.print("3-wednesday");
         }
         else if(number  == 4){
             System.out.print("4-thursday");
         }
         else if(number  == 5){
             System.out.print("5-friday");
         }
         else if(number  == 6){
             System.out.print("6-saturday");
         } else if(number  == 7){
             System.out.print("7_sunday");
         }


         }
    }

