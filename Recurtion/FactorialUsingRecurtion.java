package Recurtion;

public class FactorialUsingRecurtion {
    public static int fact(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int fact_nm1 = fact(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String args[]) {
        System.out.println(fact(5));
    }
}
