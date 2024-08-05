public class Collection {
    public static void printN(int n) {
        if (n==6) {
            return;
        }
        System.out.println(n);
        printN(n+1);
    }
public static void main(String[] args) {
    printN(1);
}
}
