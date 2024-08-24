package Scarching;

public class BinaryScarch {
    //normal binary scarch
    public static int binaryscarch(int arr[], int x) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (x > arr[mid]) {
                si = mid + 1;
            } else if (x < arr[mid]) {
                ei = mid - 1;
            } else {
                
                return mid;
            }
        }
        return -1;
    }
    // when we don't know the order of the array
    public static int orderagnosticbinaryscarch(int arr[], int x) {
        int si = 0;
        int ei = arr.length - 1;
        boolean isasc = arr[si] < arr[ei];
        while (si <= ei) {
        int mid = si + (ei - si) / 2;
        if (isasc) {
                if (x > arr[mid]) {
                    si = mid + 1;
                } else if (x < arr[mid]) {
                    ei = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (x > arr[mid]) {
                    ei = mid - 1;
                } else if (x < arr[mid]) {
                    si = mid + 1;
                } else {
                    return mid;
                }
            }
            }
        return -1;
    }

    public static void main(String args[]) {
        int[] array = { 99, 95, 89, 85, 78, 74, 67, 60, 53, 45, 38, 31, 24, 17, 9 };
        int[] array2 = { 1, 3, 6, 9, 14, 17, 20, 24, 28, 31, 35, 38 };
        int x = 17;
        System.out.println("The "+x+" is in "+orderagnosticbinaryscarch(array, x)+" th position");
        System.out.println("The "+x+" is in "+orderagnosticbinaryscarch(array2, x)+" th position");
    }
}