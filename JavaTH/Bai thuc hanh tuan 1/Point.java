import java.lang.Math;
import java.util.Vector;

public class Point {
    private double x;
    private double y;
    
    public Point()
    {

    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point a)
    {
        this.x = a.x;
        this.y = a.y;
    }

    public void setX(double x)
    {   
        this.x = x;
    }
    public double getX()
    {
        return x;
    }
    public void setY(double y)
    {   
        this.y = y;
    }
    public double getY()
    {
        return y;
    }

    public static double khoangcachhaidiem(Point a, Point b)
    {
        return Math.sqrt(  Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2)  );
    }

    public static void ptdoanthang(Point a, Point b)
    {
        Vector<Double> vtpt = new Vector<>();
        vtpt.add((double) -(b.y - a.y));
        vtpt.add((double) (b.x - a.x));
        double c = -(vtpt.get(0) * a.x + vtpt.get(1) * a.y);

        System.out.println("Phuong trinh duong thang di qua 2 diem la: " + vtpt.get(0) +
                " x + " + vtpt.get(1) + " y + " + c +
                " = 0");
    }
    
    public static boolean kiemtrathanghang(Point a, Point b, Point c)
    {
        double d1;
        double d2;
        double d3;
        d1 = khoangcachhaidiem(a, b);
        d2 = khoangcachhaidiem(b, c);
        d3 = khoangcachhaidiem(a, c);
        if(d1+d2==d3||d1+d3==d2||d2+d3==d1)
            return true;
        else    
            return false;
        
    }

    public static double Stamgiac(Point a, Point b, Point c)
    {
        double p = khoangcachhaidiem(a, b) + khoangcachhaidiem(b, c) + khoangcachhaidiem(a, c);
        return Math.sqrt(p*(p-khoangcachhaidiem(a, b))*(p-khoangcachhaidiem(b, c))*(p-khoangcachhaidiem(a, c)));
    }

}