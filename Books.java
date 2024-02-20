package  Books;
import java.util.Scanner;
public class Books {
                   static String book1;
                   static String book2;
                   static String book3;
static int num_of_book;
    public static void main(String[] args) {
        
        
     Scanner inpt=new Scanner(System.in);   
        System.out.println("Enter the number of books:");
        num_of_book=inpt.nextInt();
           if(num_of_book<=3){
        for(int k=1;k<=num_of_book;k++)
        {
        System.out.println("Enter "+ " "+num_of_book+" "+"the book ");
        if(num_of_book==1){
        book1=inpt.next();
            System.out.println("you are allowed"+"\n"+book1);
        }
        else if(num_of_book<=2){book1=inpt.next();book2=inpt.next();
        System.out.println("you are allowed"+"\n"+book1+"\n"+book2);}
        else{
            book1=inpt.next();
            book2=inpt.next();
            book3=inpt.next();
            System.out.println("the book you are allowed :"+"\n"+book1+"\n"+book2+"\n"+book3);
        }
        break;
            }
           }
           else{
            if(num_of_book>3)
                for(;;){
            System.out.println("maximum number of books must be 3");
            System.out.println("Re-nter the  number of books");
            num_of_book=inpt.nextInt();
            if(num_of_book<=3)
                break;
                } 
              
            for(int j=1;j<=num_of_book;j++)
        {
            System.out.println("Enter "+ " "+num_of_book+" "+"the book ");
        if(num_of_book==1){
        book1=inpt.next();
            System.out.println("you are allowed"+"\n"+book1);
        }
        else if(num_of_book<=2){book1=inpt.next();book2=inpt.next();
        System.out.println("you are allowed"+"\n"+book1+"\n"+book2);}
        else{
            book1=inpt.next();
            book2=inpt.next();
            book3=inpt.next();
            System.out.println("THE BOOK YOU ARE ALLOWED :"+"\n"+book1+"\n"+book2+"\n"+book3);
        }
        break;
            }
           }
       
               }
        }
         
           
        
        
    


