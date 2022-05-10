// exercise 1 c.
//NAME: NABILA ALIA BINTI HAZMAN
//MATRIC.NO:BI21160471
//SECTION:1

import java.util.Scanner;
//package exercise1;

public class Exercise1_c {
      
public static void main(String args[])
{
   //i for rows,j for column
    int i,j,row=5;

    //outer loop for rows
    for(i=0;i<row;i++)
    {
     //inner loop for space
    for(j=1*(row-i);j>=0;j--)
   {
    //space between star
     System.out.print(" ");
       }
     //inner loop for column
    for(j=0;j<=i;j++)
    { 
     //print star
     System.out.print("*");
       }
    System.out.println();
  }
    
   }

}