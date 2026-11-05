# MyFirstProjectCISC190

Some code from a past project. I think it was the receipt one.

## How to Run
1. Open the code on your IDE
2. Run the program, it will take you to the output screen
3. Enter your item name, price, and quantity.
4. Code will finish and the receipt will be on another file called "receipt.txt"

## Example Output
```text
Item Name: Book
Price: $100
Quantity: 4
Receipt Saved!
```

## Example Output (File)
```text
=== Purchase Details ===
Item: Book
Price: $100.0
Quantity: 4
Total Price: $400.0
```

## Starter Code
```java
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

        // TODO B1: Calculate the total cost (price * quantity)

        // TODO C1: Create a FileWriter for "receipt.txt"
       
        // TODO C3: Close the FileWriter and print "Receipt saved!"
        
    }
}
```
## Author
Aiden Riodique

"Edit added by Alex Lam"\
Added period on line 9

"Edit added by Julius Concepcion"\
Added period on line 6

## Collaboration Acknowledgment
This project was reviewed and edited by Alex Lam on GitHub
