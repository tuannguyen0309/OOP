import java.util.Vector;

public class Point3d extends Point
{
    private double z;
    public Point3d()
    {

    }

    public Point3d(double x, double y, double z) 
    {
        super();
        this.z = z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public static void ptmatphang(Point3d a, Point3d b, Point3d c)
    {
        Vector<Double> ab = new Vector<>();
        ab.add((double) (b.getX() - a.getX()));
        ab.add((double) (b.getY() - a.getY()));
        ab.add((double) (b.getZ() - a.getZ()));
        
        Vector<Double> bc = new Vector<>();
        bc.add((double) (c.getX() - b.getX()));
        bc.add((double) (c.getY() - b.getY()));
        bc.add((double) (c.getZ() - b.getZ()));
    
        Vector<Double> vtpt = new Vector<>();
        double x = (ab.get(1) * bc.get(2)) - (ab.get(2) * bc.get(1));
        double y = (ab.get(2) * bc.get(0)) - (ab.get(0) * bc.get(2));
        double z = (ab.get(0) * bc.get(1)) - (ab.get(1) * bc.get(0));

        vtpt.add(x);
        vtpt.add(y);
        vtpt.add(z);

        double hesotudo = -((x * (a.getX())) + (y * (a.getY())) + (z * (a.getZ())));

        System.out.println("Phuong trinh mat phang di qua 3 diem la: " + x +
                "x + " + y + "y + " + z +
                "z + " + hesotudo + " = 0.");
    }
    public static boolean kiemtramatphang(Point3d a, Point3d b, Point3d c, Point3d d)
    {
        Vector<Double> ab = new Vector<>();
        ab.add((double) (b.getX() - a.getX()));
        ab.add((double) (b.getY() - a.getY()));
        ab.add((double) (b.getZ() - a.getZ()));
        
        Vector<Double> bc = new Vector<>();
        bc.add((double) (c.getX() - b.getX()));
        bc.add((double) (c.getY() - b.getY()));
        bc.add((double) (c.getZ() - b.getZ()));
    
        Vector<Double> vtpt = new Vector<>();
        double x = (ab.get(1) * bc.get(2)) - (ab.get(2) * bc.get(1));
        double y = (ab.get(2) * bc.get(0)) - (ab.get(0) * bc.get(2));
        double z = (ab.get(0) * bc.get(1)) - (ab.get(1) * bc.get(0));

        vtpt.add(x);
        vtpt.add(y);
        vtpt.add(z);

        double hesotudo = -((x * (a.getX())) + (y * (a.getY())) + (z * (a.getZ())));

        if(d.getX() * x + d.getY() * y + d.getZ() * z + hesotudo == 0)
            return true;
        else 
            return false;
    }
}