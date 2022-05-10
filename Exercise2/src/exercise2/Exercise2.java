// exercise 2 menu
//NAME: NABILA ALIA BINTI HAZMAN
//MATRIC.NO:BI21160471
//SECTION:1
package exercise2;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Exercise2 {

    char choice;
    int qty;
    double total=0.0;
    Scanner scan = new Scanner(System.in);

    public void availableMenu(){
       
        System.out.println("Menu: ");
        System.out.println("-----------------------------------");
        System.out.println("[1] Nasi Lemak [RM2.00]");
        System.out.println("[2] Roti       [RM1.00]");
        System.out.println("[3] Teh Tarik  [RM1.50]");
        System.out.println("[4] Kopi O     [RM1.00]");
        System.out.println("-----------------------------------");
        System.out.println("Place order [1-4] or type q to exit.\n");

}

       public void MenuSelection(int input) throws IOException {

    do{
       System.out.println("Add order: ");
       choice=(char) System.in.read();
       
      switch(choice){
      
      case '1':
      System.out.print("\tNasi Lemak - ");
      System.out.print("Quantity :  ");
      qty =scan.nextInt();
      total += (qty*2.00);
      System.out.println("\tPrice : RM" + (qty*2.00)+ "\n");
      break;


      case '2':
      System.out.print("\tRoti : ");
      System.out.print("\tQuantity - ");
      qty =scan.nextInt();
      total += (qty*1.00);
      System.out.println("\tPrice : RM" + (qty*1.00) + "\n");
      break;

      case '3':
      System.out.print("\tTeh Tarik : ");
      System.out.print("\tQuantity - ");
      qty =scan.nextInt();
      total += (qty*1.00);
      System.out.println("\tPrice : RM" + (qty*1.00) + "\n");
      break;


    }

 } while (choice!='q');
   
   System.out.println("\nThank you for your order.");
   System.out.printf("Total due: RM %.2f",total);
 }
   }   
        
    

