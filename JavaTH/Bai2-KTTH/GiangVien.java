public class GiangVien extends Nguoi{
    private String khoa;
    private String[] dsMon;
    public double heSoLuong;
    public double luongCoBan;
    public GiangVien(){

    }
    public GiangVien(String a,String b,String c,String d,String e,String[] f,double g,double h){
        super(a,b,c,d);
        this.khoa=e;
        this.dsMon=f;
        this.heSoLuong=g;
        this.luongCoBan=h;
    }
    public GiangVien(GiangVien a){
        super(a.ten,a.ho,a.gioiTinh,a.ngaySinh);
        this.khoa=a.khoa;
        this.dsMon=a.dsMon;
        this.heSoLuong=a.heSoLuong;
        this.luongCoBan=a.luongCoBan;
    }
    public void setKhoa(String khoa)
    {
        this.khoa=khoa;
    }

    public String getKhoa()
    {
        return this.khoa;
    }

    public void setDsMon(String[] dsMon)
    {
        this.dsMon=dsMon;
    }

    public String[] getDsMon()
    {
        return this.dsMon;
    }

    public void setHeSoLuong(double heSoLuong)
    {
        this.heSoLuong=heSoLuong;
    }

    public double getHeSoLuong()
    {
        return this.heSoLuong;
    }

    public void setLuongCoBan(double luongCoBan)
    {
        this.luongCoBan=luongCoBan;
    }

    public double getLuongCoBan()
    {
        return this.luongCoBan;
    }

    public double luongThang(){
        return this.heSoLuong*this.luongCoBan;
    }
    
    public void displayGV(){
        this.displayNguoi();
        System.out.println("Khoa: "+khoa);
        System.out.println("Danh sách môn: ");
        for (int i=0;i<dsMon.length;i++)
        {   
            System.out.println(dsMon[i]);
        }

        System.out.println("Hệ số lương: "+heSoLuong);
        System.out.println("Lương cơ bản: "+luongCoBan);
    }
}