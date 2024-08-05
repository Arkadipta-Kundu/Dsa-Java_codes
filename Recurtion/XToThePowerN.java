package Recurtion;

public class XToThePowerN {
    public static int xPown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xn = x * xPown(x, n - 1);
        return xn;
        }
    public static void main(String[] args) {
        System.out.println(xPown(2, 4));
    }
}
