package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //get input from the user
        System.out.print("Enter the number: ");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        int sum = 0;
        int j = 1;
        while (j <= i)
        { sum = sum + j;
        j++;
         }
        System.out.print("Sum: " +sum);
        System.out.println();



        while(i!=0) {
            System.out.print("Enter the number or 0 to quit: ");
            j=1;
            sum=0;
            i = keyboard.nextInt();
            while (j <= i){
                sum = sum + j;
                j++;}
            System.out.print("Sum: " +sum);

            System.out.println();
        }




    }
}
