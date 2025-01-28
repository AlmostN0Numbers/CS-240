// Reid Morin
// CS 240 
// 1-28-25
// Has the user input 6 strings and sorts them by their last char
import java.util.Comparator;
import java.util.Scanner;
public class Exercise20_21 {
    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the min element in the unsorted 
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (comparator.compare(list[j], list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found min element with the first element 
            E temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter six strings
        System.out.print("Enter 6 strings: ");
        String[] strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.next();
        }
        // Sort strings by their last char
        selectionSort(strings, (s1, s2) -> {
            char lastChar1 = s1.charAt(s1.length() - 1);
            char lastChar2 = s2.charAt(s2.length() - 1);
            return Character.compare(lastChar1, lastChar2);
        });
        // Display
        for (String string : strings) {
            System.out.print(string + " ");
        }
        scanner.close();
    }
}
