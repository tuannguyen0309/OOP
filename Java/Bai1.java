import java.util.Scanner;

public class Bai1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so tu nhien a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so tu nhien b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN cua " + a + " va " + b
                + " la: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN cua " + a + " va " + b
                + " la: " + BSCNN(a, b));
    }

    public static int USCLN(int a, int b) {
        int temp1 = a;  
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int uscln = temp1;
        return uscln;
    }
  
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}