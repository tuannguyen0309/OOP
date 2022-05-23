
public class  Person {
    protected String name;
    protected String lastname;
    protected String sex;
    protected int date;
    
    public Person() {

    }

    public Person(String name, String lastname, String sex, int date) {
       this.name = name;
       this.lastname = lastname;
       this.sex = sex;
       this.date = date;
    }

    public String name () {
        return name;
    }

    public String lastname () {
        return lastname;
    }

    public String sex () {
        return sex;
    }

    public int date() {
        return date;
    }

 

    public void display() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten cua nhan vien: " + name);
        System.out.println("Ho cua nhan vien: " + lastname );
        System.out.println("Gioi tinh: "+ sex);
        System.out.println("Ngay sinh: "+ date);
        
    }

}
