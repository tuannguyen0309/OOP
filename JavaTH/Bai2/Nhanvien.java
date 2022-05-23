
public class Nhanvien extends Person {
    protected String Phongban;
    protected String chucvu;
    protected double heso;
    protected double salary;

    public Nhanvien() {
        super();
    }

    public Nhanvien(String name, String lastname, String sex, int date, String Phongban, String chucvu, double heso,
            double salary) {
        super(name, lastname, sex, date);
        this.Phongban = Phongban;
        this.chucvu = chucvu;
        this.heso = heso;
        this.salary = salary;

    }

    public String getPhongban() {
        return Phongban;
    }

    public String getChucvu() {
        return chucvu;
    }

    public double getHeso() {
        return heso;
    }

    public double getSalary() {
        return salary;
    }

  
    public double tinhluong() {
        return this.getSalary() * this.getHeso();
    }

    public void viewsalary() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten cua nhan vien: " + name);
        System.out.println("Ho cua nhan vien: " + lastname);
        System.out.println("Gioi tinh: " + sex);
        System.out.println("Ngay sinh: " + date);
        System.out.println("Phong ban:");
        System.out.println("Chuc vu:");
        
    }
}
