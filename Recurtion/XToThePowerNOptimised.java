public class XToThePowerNOptimised {
    public static int xPownOpt(int x, int n) {
        int xn;
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                 xn = xPownOpt(x, n/2) * xPownOpt(x, n / 2);
            } else {
                 xn = xPownOpt(x, n / 2) * xPownOpt(x, n / 2)*x;
            }
        }
        return xn;
    }

    public static void main(String[] args) {
        System.out.println(xPownOpt(4, 3));
    }
}
