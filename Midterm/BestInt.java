public class BestInt implements Comparable<BestInt> {

    public int bint;

    public BestInt(int a) {
        this.bint = a;
    }
//Implementing compareTo to compare bint
    public int compareTo(BestInt b){
    return Integer.compare(this.bint, b.bint);
    }
}