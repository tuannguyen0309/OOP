import java.util.Arrays;
import java.util.Scanner;

public class bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x;
        int n;
        System.out.println("Nhap So Luong: ");
        n = sc.nextInt();
        x = new double[n];
        System.out.println("Nhap vao mang: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += x[i];
        }
        
        Arrays.sort(x);
        System.out.println("Day So sau khi sap xep la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]+" ");
        }
        System.out.println("Trung Binh Cong cua day so la: " + sum/n);
        sc.close();
    }
}