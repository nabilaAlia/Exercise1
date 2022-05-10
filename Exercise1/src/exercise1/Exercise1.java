// exercise 1 a.
//NAME: NABILA ALIA BINTI HAZMAN
//MATRIC.NO:BI21160471
//SECTION:1

import java.util.Scanner;
//package exercise1;

public class Exercise1 {

       public static void main(String[] args) {
      
     Scanner taec = new Scanner(System.in);
     System.out.println("Enter the number of rows :"); // input from user
     int rows= taec.nextInt();
    
    for(int i=rows-1; i>=0;i--)
    {
    //outer loop
    for(int j=0;j<=i;j++)
    {
    // Prompt the user to enter *
    System.out.print("*"); 
    }
    System.out.println(" ");
    }
    taec.close();
    }
    
}
