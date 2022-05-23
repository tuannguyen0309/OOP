import java.util.Arrays;

public class Giangvien extends Person {
    protected String Khoa;
    protected String[] Listsubject= new String[10];
    protected double heso;
    protected double salary;

    public Giangvien() {
        super();
    }

    public Giangvien(String name, String lastname, String sex, int date, String Khoa, String[] Listsubject, double heso,
            double salary) {
        super(name, lastname, sex, date);
        this.Khoa = Khoa;
        this.Listsubject = Listsubject;
        this.heso = heso;
        this.salary = salary;

    }

    public String getKhoa() {
        return Khoa;
    }

    public String[] getListsubject() {
        return Listsubject;
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
        System.out.println("Khoa:" + Khoa);
        for( int i = 0; i < Listsubject.length;i++ ){
            System.out.println(Listsubject[i]);
        } 
        System.out.println("Luong:" + this.getHeso()*this.getSalary());     

    }
}
