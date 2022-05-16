public class bai2 {
    protected int n;
    protected double[] mang = new double[n];
    public bai2()
    {

    }
    public bai2(int n)
    {
        this.n = n;
    }
    public bai2(double[] mang, int n)
    {
        this.mang = mang;
        this.n = n;
    }

    public double dodai()
    {
        double x = 0;
        for(int i=0; i<n; i++)
        {
            x += mang[i] * mang [i];
        }
        return Math.sqrt(x);
    }

    public bai2 cong(bai2 x, bai2 y, bai2 z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] + y.mang[i];
        }
        return z;
    }

    public bai2 tru(bai2 x, bai2 y, bai2 z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] - y.mang[i];
        }
        return z;
    }

    public bai2 nhan(bai2 x, int m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] * m;
        }
        return x;
    }

    public bai2 chia(bai2 x, double m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] / m;
        }
        return x;
    }

    public bai2 vtdonvi(bai2 x)
    {
        return x.chia(x, x.dodai());
    }

    public String toString()
    {
        String s = "( ";
        for(int i=0; i<n; i++)
        {
            s += Double.toString(mang[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display()
    {
        System.out.print("Vector: ");
        for(int i=0; i<n; i++)
        {               
            System.out.print(mang[i] + " ");
        }
    }
// public static void Main(String[] args){
//         double[] arr =  new double[] {1, 2, 3};
//         double[] arr2 =  new double[] {4, 5, 6};
//         bai2 x = new bai2(arr, arr.length);
//         bai2 y = new bai2(arr2, arr2.length);
//         bai2 z = new bai2(arr, arr.length);

//         z.cong(x, y, z);
//         // x.display();
//         System.out.println(z.toString());
//     }
}