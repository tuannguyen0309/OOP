import java.util.Scanner;
public class bai2 {

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            bai2 ob = new bai2();
            int arr[] = {2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86};
            System.out.println("Mang la: ");
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print("\t" + arr[i]);
            }
            System.out.println("\n");
            System.out.println("Nhap x can search: ");
            int x = sc.nextInt();
            int result = ob.binarySearch(arr, 0, n - 1, x);
            if (result == -1) {
                System.out.println("Phần tử không tồn tại.");
            } else {
                System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
            }
        }
    }

}