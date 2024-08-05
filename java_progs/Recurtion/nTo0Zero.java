package Recurtion;

public class nTo0Zero {

    public static void main(String[] args) {
ntozrto(5);
    }

    public static void ntozrto(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        ntozrto(--n);
    }
}