//Reid Morin
//3-4-25
//CS 240
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SimpleHashProgram {
    public static void main(String[] args) {
        // Create HashMap to store key value pair
        Map<Integer, String> hashMap = new HashMap<>();
        // Add key-values to HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Grape");
        // Print HashMap
        System.out.println("Initial HashMap contents: " + hashMap);
        // User input for searching
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key (integer) to search for a fruit: ");
        int searchKey = scanner.nextInt();
        if (hashMap.containsKey(searchKey)) {
            System.out.println("The fruit corresponding to the key " + searchKey + " is: " + hashMap.get(searchKey));
        } else {
            System.out.println("Key not found in the HashMap.");
        }
        // Remove an item 
        System.out.print("Enter the key to remove from the HashMap: ");
        int removeKey = scanner.nextInt();
        hashMap.remove(removeKey);
        System.out.println("After removing key " + removeKey + ", the HashMap contents are: " + hashMap);
        scanner.close();
    }
}
