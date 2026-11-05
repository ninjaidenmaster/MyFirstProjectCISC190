import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // TODO A1: Ask the user for item name, price, and quantity
        // Example:
        // Item: Milk
        // Price: 3.49
        // Quantity: 2
        System.out.print("Item Name: ");
        String item = sc.nextLine();
        System.out.print("Price: $");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        // TODO B1: Calculate the total cost (price * quantity)
        double total = price * qty;

        // TODO C1: Create a FileWriter for "receipt.txt"
        FileWriter receipt = new FileWriter ("receipt.txt");
        // TODO C2: Write all purchase details to the file
        receipt.write("=== Purchase Details ==="
        + "\nItem: " + item
        + "\nPrice: $" + price
        + "\nQuantity: " + qty
        + "\nTotal Price: $" + total);
        // TODO C3: Close the FileWriter and print "Receipt saved!"
        receipt.close();
        System.out.println("Receipt saved!");
    }
}