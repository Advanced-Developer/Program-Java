/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bookborrowed;
import java.util.Scanner;
public class Bookborrowed {
  
    public static void main(String[] args) {
    int z=1;
    String book1;
    String book2;
    String book3;
    
       Scanner book=new Scanner(System.in);
    for(int x=0; x<=z; x++){
        System.out.println("Enter the number of book");
         z=book.nextInt();
    if(z<=3){
   if(z==1){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("The book is "+book1);
   break;
   }
   else if(z ==2){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("Enter the name of book 2");
   Scanner inputs=new Scanner (System.in);
           book2=inputs.nextLine();
           System.out.println("Book one is "+book1 );
              System.out.println( "  Book two is "+book2 );
           break;
   }
   else if(z==3){
   System.out.println("Enter the name of book 1");
   Scanner input=new Scanner (System.in);
   book1=input.nextLine();
   System.out.println("Enter the name of book 2");
   Scanner inputs=new Scanner (System.in);
   book2=input.nextLine();
   System.out.println("Enter the name of book 3");
   Scanner inputa=new Scanner (System.in);
   book3=input.nextLine();
   System.out.println(" Book one is  "+book1);
   System.out.println("  Book two is "+book2);
   System.out.println(" Book three is "+book3);
   break;
   }}
   else{
   System.out.println("please try again maximum number of book is three!!");
   
   }
    
    
    
    }
    }
    
}
