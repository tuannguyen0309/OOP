public class bai2main {
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        bai2 x = new bai2(arr, arr.length);
        bai2 y = new bai2(arr2, arr2.length);
        bai2 z = new bai2(arr, arr.length);

        z.cong(x, y, z);
        //x.display();
        System.out.println(z.toString());

    }
}
