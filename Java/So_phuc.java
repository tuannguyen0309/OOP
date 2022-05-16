import java.lang.Math;
import java.util.Scanner;
public class So_phuc {
    private double a;
    private double b;
    
    public So_phuc(){
        
    }
    
    public So_phuc(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public void set_a(double a){
        this.a = a;
    }
    
    public double get_a(){
        return a;
    }
    
    public void set_b(double b){
        this.b = b;
    }
    
    public double get_b(){
        return b;
    }
    
    @Override
    public String toString(){
        String str = a + "+j*" + b;
        if(a == 0){
            str = "j*" + b;
            return str;
        }else if(b == 0){
            str = Double.toString(a);
            return str;
        }
        return str;
    }
    
    public void do_lon_so_phuc(){
        System.out.println("Do lon cua so phuc " + toString() + " la : " + Math.sqrt((a * a + b * b)));
    }
    
    public static void compare_so_phuc(So_phuc s1,So_phuc s2){
        if(s1.a == s2.a && s1.b == s2.b){
            System.out.println("2 so phuc bang nhau");
        }else{
            System.out.println("2 so phuc khong bang nhau");
        }
    }
    
    public static void cong_so_phuc(So_phuc s1,So_phuc s2){
        double sum_phan_thuc = s1.a + s2.a;
        double sum_phan_ao = s1.b + s2.b;
        System.out.println("Tong 2 so phuc " + s1.toString() + " + " + s2.toString() + " = " + sum_phan_thuc + "+j*" + sum_phan_ao);
    }
    
    public static void tru_so_phuc(So_phuc s1,So_phuc s2){
        double hieu_phan_thuc = s1.a - s2.a;
        double hieu_phan_ao = s1.b - s2.b;
        System.out.println("Hieu 2 so phuc " + s1.toString() + " - " + s2.toString() + " = " + hieu_phan_thuc + "+j*" + hieu_phan_ao);
    }
    
    public static void nhan_so_phuc(So_phuc s1,So_phuc s2){
        double phan_thuc = (s1.a * s2.a) - (s1.b * s2.b);
        double phan_ao = (s1.a * s2.b) + (s1.b * s2.a);
        System.out.println("Tich 2 so phuc " + s1.toString() + " * " + s2.toString() + " = " + phan_thuc + "+j*" + phan_ao);
    }
    
    public static void chia_so_phuc(So_phuc s1,So_phuc s2){
        double phan_thuc = (s1.a * s2.a + s1.b * s2.b) / (s1.a * s1.a + s1.b * s1.b);
        double phan_ao = (s1.a * s2.b - s1.b * s2.a) / (s1.a * s1.a + s1.b * s1.b);
        System.out.println("Thuong 2 so phuc " + s1.toString() + " / " + s2.toString() + " = " + phan_thuc + "+j*" + phan_ao);
    }
    
    public void nhan_so_thuc_voi_so_phuc(){
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so thuc de nhan voi 1 so phuc :");
        n = sc.nextInt();
        System.out.println("Tich so thuc " + n + " voi so phuc " + toString() + " = " + n * a + "+j*" + n*b);
    }
    
    public String so_phuc_lien_hop(){
        String str = a + "-j*" + b;
        return str;
    }
    
    public static void main(String[] args) {
        So_phuc s1 = new So_phuc(1,2);
        So_phuc s2 = new So_phuc(3,-1);

        s1.do_lon_so_phuc();
        s2.do_lon_so_phuc();

        compare_so_phuc(s1,s2);

        cong_so_phuc(s1,s2);

        tru_so_phuc(s1,s2);

        nhan_so_phuc(s1,s2);

        chia_so_phuc(s1,s2);

        s1.nhan_so_thuc_voi_so_phuc();
        
        System.out.println("So phuc lien hop cua " + s1.toString() + " la : " + s1.so_phuc_lien_hop());
        System.out.println("So phuc lien hop cua " + s2.toString() + " la : " + s2.so_phuc_lien_hop());
    }
}