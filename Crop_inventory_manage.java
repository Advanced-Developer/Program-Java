/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crop_inventory_manage;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Crop_inventory_manage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int len;
        double updatequant;
                String new_crop,crop1[]={};
        Scanner in=new Scanner(System.in);
        System.out.println("input the length of array");
        len=in.nextInt();
        String[] NameOfCrops=new String[len+1];
        System.out.println("enter the"+" "+len+"crops");
                for(int i=0;i<NameOfCrops.length-1;i++){
                      NameOfCrops[i]=in.next();
                     
        }
                System.out.println("input the length of array of crops");
        int leng=in.nextInt();
       int[] quantity=new int[leng+1];
          System.out.println("enter the"+" "+len+"quantities");
                for(int i=0;i<quantity.length-1;i++){
                      quantity[i]=in.nextInt();
                     
        }       

          System.out.println("1.Adding new crop");
         System.out.println("2.update quantity new crop");
         System.out.println("3.disply current inventory");
        System.out.println("Choose From This above Menu by entering the number:");
        int number=in.nextInt();
        if(number>1){
         if(number==1){
           new_crop=in.next();
    NameOfCrops[len]=new_crop;
    for(int i=0;i<NameOfCrops.length-1;i++){
                          System.out.println(NameOfCrops[i]); 
        }}
    if(number==2){
    System.out.println("update quantity");
        for(int i=0;i<quantity.length-1;i++){
        quantity[i]=in.nextInt();     
        }
    }
    if(number==3){
        int i=0;
           int j=0;
       System.out.println("the current inventory status is:");
        for(i=0;i<NameOfCrops.length-1;i++){
            System.out.println(NameOfCrops[i]);}
        for(j=0;j<quantity.length-1;j++){
            System.out.println(quantity[j]);  
        }
        }
    }
         }
        
    }



