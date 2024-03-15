/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invent_management;
        import java.util.Scanner;
abstract class System {
    private String productName;
    private double price;

    public System(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public abstract void displayDetails();
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getProductPrice(){
        return price;
    }
      public static void main(String[] args) {
       
    }
}


/**
 *
 * @author user
 */
public class Invent_management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
