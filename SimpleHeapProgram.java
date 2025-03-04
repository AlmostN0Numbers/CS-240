//Reid Morin
//3-4-25
//CS 240
import java.util.PriorityQueue;
import java.util.Scanner;
public class SimpleHeapProgram {
    public static void main(String[] args) {
        // Create a Mini-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Insert elements into heap
        int[] elements = {10, 5, 30, 15, 20};
        for (int elem : elements) {
            minHeap.add(elem);
        }
        // Print heap
        System.out.println("Mini Heap elements: " + minHeap);
        // View the smallest element
        System.out.println("Smallest heap element: " + minHeap.peek());
        // Remove elements in heap order
        System.out.print("Elements removed from the heap: ");12
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        // User input for additional insertions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers to insert into heap, seperated by spaces: ");
        String input = scanner.nextLine();
        Scanner lineScanner = new Scanner(input);
         // Process numbers from the input
        while (lineScanner.hasNextInt()) {
            minHeap.add(lineScanner.nextInt());
        }
        lineScanner.close();
        // Print heap after insertions
        System.out.println("Heap after user insertions: " + minHeap);
        // Remove elements in heap order
        System.out.print("Elements removed from the heap: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        scanner.close();
    }
}
