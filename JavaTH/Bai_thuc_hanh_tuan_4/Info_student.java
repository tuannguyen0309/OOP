public class Info_student{
	private int masv;
	private String ten;
	private int so_mon_hoc_da_hoc;
	private double diem_tb;

	public Info_student(){
		
	}

	public Info_student(int masv , String name , int so_mon_hoc_da_hoc , double diem_tb){
		this.masv = masv;
		this.ten = ten;
		this.so_mon_hoc_da_hoc = so_mon_hoc_da_hoc;
		this.diem_tb = diem_tb;
	}

	public void set_masv(int masv){
		this.masv = masv;
	}

	public int get_masv(){
		return masv;
	}

	public void set_ten(String ten){
		this.ten = ten;
	}

	public String get_ten(){
		return ten;
	}

	public void set_so_mon_hoc_da_hoc(int so_mon_hoc_da_hoc){
		this.so_mon_hoc_da_hoc = so_mon_hoc_da_hoc;
	}

	public int get_so_mon_hoc_da_hoc(){
		return so_mon_hoc_da_hoc;
	}

	public void set_diem_tb(double diem_tb){
		this.diem_tb = diem_tb;
	}

	public double get_diem_tb(){
		return diem_tb;
	}
}