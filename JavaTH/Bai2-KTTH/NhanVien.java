public class NhanVien extends Nguoi{
    private String phongBan;
    private String chucVu;
    private double luong;
    private double heSoLuong;
    public NhanVien(){

    }
    public NhanVien(String a,String b,String c,String d,String e,String f,double g,double h){
        super(a,b,c,d);
        this.phongBan=e;
        this.chucVu=f;
        this.luong=g;
        this.heSoLuong=h;

    }
    public NhanVien(NhanVien a){
        super(a.ten,a.ho,a.gioiTinh,a.ngaySinh);
        this.phongBan=a.phongBan;
        this.chucVu=a.chucVu;
        this.luong=a.luong;
        this.heSoLuong=a.heSoLuong;
    }
    public void setPhongBan(String phongBan)
    {
        this.phongBan=phongBan;
    }

    public String getPhongBan()
    {
        return this.phongBan;
    }

    public void setChucVu(String chucVu)
    {
        this.chucVu=chucVu;
    }

    public String getChucVu()
    {
        return this.chucVu;
    }

    public void setLuong(double luong)
    {
        this.luong=luong;
    }

    public double getLuong()
    {
        return this.luong;
    }

    public void setHeSoLuong(double heSoLuong)
    {
        this.heSoLuong=heSoLuong;
    }

    public double getHeSoLuong()
    {
        return this.heSoLuong;
    }

    public double luongThang(){
        return this.heSoLuong*this.luong;
    }
    public void displayNV(){
        this.displayNguoi();
        System.out.println("Phòng ban: "+phongBan);
        System.out.println("Chức vụ: "+ chucVu);
        System.out.println("Hệ số lương: "+heSoLuong);
        System.out.println("Lương cơ bản: "+luong);
    }
}
