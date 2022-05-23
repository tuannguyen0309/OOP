import java.util.Scanner;
public class Main {
    private static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        GiangVien[] gv= new GiangVien[1000];
        NhanVien[] nv= new NhanVien[1000];
        int n;
        System.out.println("So luong giang vien la:");
        n=ip.nextInt();
        System.out.println("Luong cua day giao vien ban dau: ");
        for (int i=1;i<=n;i++)
        {
            //System.out.println("??");
            gv[i]= new GiangVien();
            gv[i].heSoLuong=Math.random()*(10-1+1)+1; 
            gv[i].luongCoBan=Math.random()*(10000-0+1)+0; 
            System.out.println("Luong cua giao vien thu "+ i +" la: "+gv[i].luongThang());
        }
        //Sap xep giang vien theo luong
        for (int i=1;i<n;i++)
            for (int j=i+1;j<=n;j++)
            if(gv[i].luongThang()>gv[j].luongThang())
                {
                    GiangVien sw= new GiangVien(gv[i]);
                    gv[i]=gv[j];
                    gv[j]=sw;
                }
        //Day da sap xep
        System.out.println("Luong cua day giao vien sau khi sap xep: ");        
        for (int i=1;i<=n;i++)
        {
            System.out.println("Luong cua giao vien thu "+ i +" la: "+gv[i].luongThang());
        }
    }
}
