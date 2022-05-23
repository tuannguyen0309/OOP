import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Moi ban lua chon: ");
        System.out.println("2-Tinh toan mat phang Oxy!");
        System.out.println("3-Tinh toan mat phang Oxyz!");
        int s = sc.nextInt();
        switch(s)
        {
            case 2:
                double x, y, z;
        
                Point a = new Point();
                Point b = new Point();
                Point c = new Point();
                
                System.out.println("Moi nhap vao diem A: ");        
                x = sc.nextDouble();
                a.setX(x);
                y = sc.nextDouble();
                a.setY(y);       
                
                System.out.println("Moi nhap vao diem B: ");
                x = sc.nextDouble();
                b.setX(x);
                y = sc.nextDouble();
                b.setY(y);
                
                System.out.println("Moi nhap vao diem C: ");
                x = sc.nextDouble();
                c.setX(x);
                y = sc.nextDouble();
                c.setY(y);

                Point.ptdoanthang(a, b);

                if(Point.kiemtrathanghang(a, b, c) == true)
                    System.out.println("3 diem thang hang");
                else 
                    {
                        System.out.println("Ba diem khong thang hang");
                        System.out.print("Dien tich tam giac: ");
                        System.out.println(Point.Stamgiac(a, b, c));
                    }


                break;

            case 3:
                double x2, y2, z2;
                Point3d a2 = new Point3d();
                Point3d b2 = new Point3d();
                Point3d c2 = new Point3d();
                Point3d d2 = new Point3d();
        
                System.out.print("Moi nhap vao diem A: ");        
                x2 = sc.nextDouble();
                a2.setX(x2);
                y2 = sc.nextDouble();
                a2.setY(y2);
                z2 = sc.nextDouble();
                a2.setZ(z2);
        
                System.out.print("Moi nhap vao diem B: ");        
                x2 = sc.nextDouble();
                b2.setX(x2);
                y2 = sc.nextDouble();
                b2.setY(y2);
                z2 = sc.nextDouble();
                b2.setZ(z2);
        
                System.out.print("Moi nhap vao diem C: ");        
                x2 = sc.nextDouble();
                c2.setX(x2);
                y2 = sc.nextDouble();
                c2.setY(y2);
                z2 = sc.nextDouble();
                c2.setZ(z2);
        
                System.out.print("Moi nhap vao diem D: ");        
                x2 = sc.nextDouble();
                d2.setX(x2);
                y2 = sc.nextDouble();
                d2.setY(y2);
                z2 = sc.nextDouble();
                d2.setZ(z2);
        
                Point3d.ptmatphang(a2, b2, c2);
        
                if(Point3d.kiemtramatphang(a2, b2, c2, d2) == true)
                    System.out.println("Diem d thuoc mat phang!");
                else
                    System.out.println("Diem d khong thuoc mat phang!");
                
                break;                        
        }                        
    }
}