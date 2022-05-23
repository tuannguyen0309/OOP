public abstract class Nguoi{
    protected String ten;
    protected String ho;
    protected String gioiTinh;
    protected String ngaySinh;

    public Nguoi(){

    }
    public Nguoi(String a,String b,String c,String d){
        this.ten=a;
        this.ho=b;
        this.gioiTinh=c;
        this.ngaySinh=d;
    }
    public Nguoi(Nguoi a){
        this.ten=a.ten;
        this.ho=a.ho;
        this.gioiTinh=a.gioiTinh;
        this.ngaySinh=a.ngaySinh;
    }

    public void setTen(String ten)
    {
        this.ten=ten;
    }

    public String getTen()
    {
        return this.ten;
    }

    public void setHo(String ho)
    {
        this.ho=ho;
    }

    public String getHo()
    {
        return this.ho;
    }

    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh=gioiTinh;
    }

    public String getGioiTinh()
    {
        return this.gioiTinh;
    }

    public void setNgaySinh(String ngaySinh)
    {
        this.ngaySinh=ngaySinh;
    }

    void displayNguoi(){
        System.out.println("Tên: "+ten);
        System.out.println("Họ: "+ho);
        System.out.println("Giới tính: "+gioiTinh);
        System.out.println("Ngày sinh: "+ngaySinh);
    }
}