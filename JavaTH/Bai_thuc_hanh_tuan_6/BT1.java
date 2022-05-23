package bai1;
import java.util.Scanner;
public class bai11 {
	private static Scanner scanner = new Scanner(System.in);
 
	
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }
