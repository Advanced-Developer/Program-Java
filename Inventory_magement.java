
import java.util.Scanner;

public class Inventory_management {
    private static int MAX_CROPS = 100;
    private String[] cropNames = new String[MAX_CROPS];
    private int[] cropQuantities = new int[MAX_CROPS];
    private int cropCount = 0;
    private Scanner c = new Scanner(System.in);
    
    
    
        private void addNewCrop() {
        System.out.print("Enter crop name: ");
        String name = c.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = c.nextInt();
        c.nextLine(); // consume newline character

        if (cropCount < MAX_CROPS) {
            cropNames[cropCount] = name;
            cropQuantities[cropCount] = quantity;
            cropCount++;
            System.out.println("Crop added successfully.");
        } else {
            System.out.println("Maximum number of crops reached. Cannot add more.");
        }
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nCrop Inventory Management System");
            System.out.println("1. Add New Crop");
            System.out.println("2. Update Crop Quantity");
            System.out.println("3. View Current Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = c.nextInt();
            c.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    addNewCrop();
                    break;
                case 2:
                    updateCropQuantity();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Crop Inventory Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        c.close();
    }
    private void viewInventory() {
        if (cropCount == 0) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            System.out.println("Crop Name\tQuantity");
            for (int i = 0; i < cropCount; i++) {
                System.out.println(cropNames[i] + "\t\t" + cropQuantities[i]);
            }
        }
    }

    private void updateCropQuantity() {
        System.out.print("Enter the crop name to update quantity: ");
        String name = c.nextLine();
        System.out.print("Enter the new quantity: ");
        int newQuantity = c.nextInt();
        c.nextLine(); // consume newline character

        boolean found = false;
        for (int i = 0; i < cropCount; i++) {
            if (cropNames[i].equalsIgnoreCase(name)) {
                cropQuantities[i] = newQuantity;
                found = true;
                System.out.println("Quantity updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Crop not found in inventory.");
        }
    }



    public static void main(String[] args) {
        Inventory_management cropInventoryManagement = new Inventory_management();
        cropInventoryManagement.run();
    }
}
