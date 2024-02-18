/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarycheck;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Librarycheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int nbr;
        String book1;
        String book2;
        String book3;
         for(int x=1;x<=5;x++){
       System.out.println("enter the number of books you want to check");
        Scanner a=new Scanner(System.in);
        nbr=a.nextInt();
      
        
            
            if(nbr<=3){
            
            System.out.println("enter a name of a book 1");
            Scanner b=new Scanner(System.in);
            book1=b.nextLine();
            System.out.println("enter a name of a book 2");
            Scanner c=new Scanner(System.in);
            book2=c.nextLine();
            System.out.println("enter a name of a book 3");
            Scanner d=new Scanner(System.in);
            book3=d.nextLine();
            System.out.println("The book 1 is "+book1);
            System.out.println("The book 2 is "+book2);
            System.out.println("The book 3 is "+book3);
            
            break;
            
       }
            else{
                System.out.println("Invalid number of book,\n"+"please enter valid number of book"
                        + " maximum number of book is three ");
                
            }
        }
        // TODO code application logic here
    }
    
}
