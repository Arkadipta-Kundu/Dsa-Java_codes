public class MergeSort {

    public static void conqure(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }
        
        while (indx1<= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }
        
        for(int i = 0, j=si;i<arr.length;i++,j++){
            arr[i] = merged[j];
        }
}
public static void mergesort(int arr[], int si, int ei) {
    if (si >= ei) {
        return;
    }
    int mid = si + (ei - si) / 2;
    mergesort(arr, si, mid);
    mergesort(arr, mid + 1, ei);
    
    conqure(arr, si, mid, ei);
}
public static void main(String[] args) {
    int arr[] = { 5, 2, 3, 1, 4 };
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    mergesort(arr, 0, n-1);
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    } 
} 
}