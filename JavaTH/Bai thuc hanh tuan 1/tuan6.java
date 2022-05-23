package b11;
import java.lang.Math;
import java.util.Scanner;
public class sophuc {
    private double a;
    private double b;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public sophuc() {
        a = 0;
        b = 0;
    }

    // Ham khoi tao co doi so
    public sophuc(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public  static String  ToString(sophuc a) {
        if(a.a==0) {
        	String str = String.valueOf(a.b)+"i";
        	return str;
        }
            
        else if(a.b==0) {
        	String str = String.valueOf(a.b);
        	return str;
        }
         
        else {
        	String str = String.valueOf(a.a);
        	String str1 = String.valueOf(a.b);
        	String str2 = str+ "+" +str1+"i";
        	return str2;
        }
    }

    public static double modun(sophuc a){
        return Math.sqrt((a.a* a.a)+(a.b* a.b));
    }

//    public static void sosanh(sophuc x,sophuc y){
//        if()
//    }

    // Ham cong 2 so phuc
    public sophuc congSP(sophuc sp2) {
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new sophuc(thuc, ao);
    }

    // Ham tru 2 so phuc
    public sophuc truSP(sophuc sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new sophuc(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public sophuc nhanSP(sophuc sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new sophuc(thuc, ao);
    }

    // Ham chia 2 so phuc
    public sophuc chiaSP(sophuc sp2) {
        double thuc = (a * sp2.a + b * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return new sophuc(thuc, ao);
    }
    public sophuc nhansothuc(sophuc sp2,double x) {
        double thuc = (x* sp2.a);
        double ao = (x*sp2.b);
        return new sophuc(thuc,ao);
    }

    public sophuc btlienhop(sophuc sp2) {
    	sophuc a = new sophuc(sp2.a,(-sp2.b));
        return a;
    }
}