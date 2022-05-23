// import java.text.NumberFormat;
// import java.util.Scanner;
 
// public class Account1 {
//     //khai báo các thuộc tính
//     private long soTK;
//     private String tenTK;
//     private double soTienTrongTK;
 
//     Scanner sc = new Scanner(System.in);
 
//     //khởi tạo constructor mặc định
//     public Account() {
//     }
 
//     //khởi tạo constructor có tham số
//     public Account(long soTK, String tenTK, double soTienTrongTK) {
//         this.soTK = soTK;
//         this.tenTK = tenTK;
//         this.soTienTrongTK = soTienTrongTK;
//     }
 
//     //-------------------begin getter and setter--------------------
//     public long getSoTK() {
//         return this.soTK;
//     }
 
//     public void setSoTK(long soTK) {
//         this.soTK = soTK;
//     }
 
//     public String getTenTK() {
//         return this.tenTK;
//     }
 
//     public void setTenTK(String tenTK) {
//         this.tenTK = tenTK;
//     }
 
//     public double getSoTienTrongTK() {
//         return this.soTienTrongTK;
//     }
 
//     public void setSoTienTrongTK(double soTienTrongTK) {
//         this.soTienTrongTK = soTienTrongTK;
//     }
 
//     //-------------------end getter and setter--------------------
//     public String toString() {
//         NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
//         String str1 = currencyEN.format(soTienTrongTK);
//         return soTK + "-" + tenTK + "-" + str1;
//     }
 
//     //Khoi tao phuong thuc nap tien
//     public double napTien() {
//         double nap;
//         System.out.print("Nhap so tien ban can nap: ");
//         nap = sc.nextDouble();
//         //Neu so tien nap vao lon hon 0 thi hop le
//         if (nap >= 0) {
//             soTienTrongTK = nap + soTienTrongTK;
//             NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
//             String str1 = currencyEN.format(nap);
//             System.out.println("Ban vua nap " + str1 + " vao tai khoan.");
//         } else {//Nguoc lai neu so tien nop vao be hon 0 thi khong hop le
//             System.out.println("So tien ban nap khong hop le!");
//         }
//         return nap;
//     }
 
//     //Khoi taoo phuong thuc rut tien
//     public double rutTien() {
//         double phi = 5;
//         double rut;
//         System.out.print("Nhap so tien ban can rut: ");
//         rut = sc.nextDouble();
//         //Neu so tien rut be hon hoac bang so tien con trong tai khoan + phi thi hop le
//         if (rut <= (soTienTrongTK - phi)) {
//             soTienTrongTK = soTienTrongTK - (rut + phi);
//             NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
//             String str1 = currencyEN.format(rut);
//             System.out.println("Ban vua rut " + str1 + "D tu tai khoan phi la 1100D.");
//         } else {//Nguoc lai neu so tien rut lon hon so tien co trong tai khoan thi khong hop le
//             System.out.println("So tien muon rut khong hop le!");
//             return rutTien();
//         }
//         return rut;
//     }
 
//     //Khoi tao phuong thuc dao han
//     public double daoHan() {
//         double laiSuat = 0.035;
//         soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
//         NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
//         String str1 = currencyEN.format(soTienTrongTK);
//         System.out.println("Ban vua duoc " + str1 + " Tu dao han 1 thang");
//         return soTienTrongTK;
//     }
 
//     //Khoi tao phuong thuc in ra man hinh
//     void inTK() {
//         NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
//         String str1 = currencyEN.format(soTienTrongTK);
//         System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
//     }
// }