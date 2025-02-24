//Reid Morin
//2-4-25
//CS 240
import java.util.Iterator;

class FibonacciIterator implements Iterator<Integer> {
    private int prev = 0;  
    private int curr = 1;  
    private final int limit;

    public FibonacciIterator(int limit) { //defines limit
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return curr <= limit; //so long as the current numb is less then limit, continue.
    }

    @Override
    public Integer next() {
        int nextFib = curr;
        int newFib = prev + curr;
        prev = curr;
        curr = newFib;
        return nextFib;
    }
}

public class FibonacciNum {
    public static void main(String[] args) {
        FibonacciIterator iterator = new FibonacciIterator(100000); //defines the numberical limit of the iterator

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}