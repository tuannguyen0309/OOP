import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hien thi person
        // Person thu1 = new Person();
        // System.out.println("Nhap ten cua nguoi");
        // thu1.name = sc.nextLine();
        // System.out.println("Nhap ho:");

        // thu1.lastname = sc.nextLine();
        // System.out.println("Nhap gioi tinh:");
        // thu1.sex = sc.nextLine();
        // System.out.println("Nhap ngay sinh");
        // thu1.date = sc.nextInt();
        // thu1.display();

        // hien thi giang vien

        Giangvien thu2 = new Giangvien();
        System.out.println("Nhap ten cua Giang vien:");
        thu2.name = sc.nextLine();
        System.out.println("Nhap ho:");
        thu2.lastname = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        thu2.sex = sc.nextLine();
        System.out.println("Nhap ngay sinh");
        thu2.date = sc.nextInt();

        System.out.println("Nhap khoa cua ban");
        thu2.Khoa = sc.nextLine();

        System.out.println("Nhap danh sach mon hoc");
        System.out.println("Nhap so luong mon hoc");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            thu2.Listsubject[i]=sc.nextLine();
        }

            thu2.viewsalary();

    }
}
