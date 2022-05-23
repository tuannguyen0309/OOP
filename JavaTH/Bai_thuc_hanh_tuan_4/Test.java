import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so luong sinh vien :");
		int so_luong_sv = Integer.parseInt(sc.nextLine());

		Student[] arr_st = new Student[so_luong_sv];

		for(int i = 0;i < so_luong_sv;i++){
			arr_st[i] = new Student();
			arr_st[i].set_student();
		}

		// a : ghi file
		try{
			PrintWriter ghi_file = new PrintWriter("C:/Users/Star/Desktop/JavaTH/student.txt");
			for(int i = 0;i < so_luong_sv;i++){
				ghi_file.println(arr_st[i].get_masv() + " " + arr_st[i].get_ten() + " " + arr_st[i].get_so_mon_hoc_da_hoc() + " " + arr_st[i].diem_trung_binh());
			}
			ghi_file.close();
		}catch(Exception e){
			System.out.println(e);
		}

		for(int i = 0;i < so_luong_sv;i++){
			arr_st[i].display_sinh_vien();
		}

		// b : doc file
		Info_student[] arr_st_b = new Info_student[so_luong_sv];

		for(int i = 0;i < so_luong_sv;i++){
			arr_st_b[i] = new Info_student();
		}

		int index = 0;

		try{
			FileReader doc_file = new FileReader("C:/Users/Star/Desktop/JavaTH/student.txt");
			BufferedReader br = new BufferedReader(doc_file);
			String line = null;

			while(true){
				boolean flag_masv = false , flag_ten = false , flag_so_mon_hoc_da_hoc = false , flag_diem_tb = false;
				line = br.readLine();
				if(line == null){
					break;
				}
				int size_line = line.length();

				int i = 0;
				while(i < size_line){
					String tmp = "0";

					while(line.charAt(i) != ' '){
						if(line.charAt(i) == '.'){
							tmp = tmp + line.charAt(i);
							if(i + 1 == size_line) break;
						}else{
							tmp = tmp + line.charAt(i);
							if(i + 1 == size_line) break;
						}
						i++;
					}

					boolean check_digit = Character.isDigit(tmp.charAt(1));

					if(check_digit == true && flag_masv == false){
						arr_st_b[index].set_masv(Integer.parseInt(tmp));
						flag_masv = true;
					}else if(check_digit == false && flag_ten == false){
						arr_st_b[index].set_ten(tmp);
						flag_ten = true;
					}else if(check_digit == true && flag_so_mon_hoc_da_hoc == false){
						arr_st_b[index].set_so_mon_hoc_da_hoc(Integer.parseInt(tmp));
						flag_so_mon_hoc_da_hoc = true;
					}else if(check_digit == true && flag_diem_tb == false){
						arr_st_b[index].set_diem_tb(Double.parseDouble(tmp));
						flag_diem_tb = true;
					}

					i++;
				}
				if(index + 1 == so_luong_sv) break;
				index++;
			}
		}catch(Exception e){
			System.out.println(e);
		}

		// sap xep
		for(int i = 0;i < so_luong_sv - 1;i++){
			for(int j = i + 1;j < so_luong_sv;j++){
				if(arr_st_b[i].get_diem_tb() < arr_st_b[j].get_diem_tb()){
					Info_student tmp = arr_st_b[i];
					arr_st_b[i] = arr_st_b[j];
					arr_st_b[j] = tmp;
				}
			}
		}
		System.out.println("Danh sach Sinh Vien co diem trung binh tu cao -> thap :");
		for(int i = 0;i < so_luong_sv;i++){
			System.out.println(arr_st_b[i].get_masv() + " " + arr_st_b[i].get_ten().substring(1) + " " + arr_st_b[i].get_so_mon_hoc_da_hoc() + " " + arr_st_b[i].get_diem_tb());
		}


		// b : ghi file sap xep student
		try{
			PrintWriter ghi_file = new PrintWriter("C:/Users/Star/Desktop/JavaTH/sortedstudent.txt");
			for(int i = 0;i < so_luong_sv;i++){
				ghi_file.println(arr_st_b[i].get_masv() + " " + arr_st_b[i].get_ten().substring(1) + " " + arr_st_b[i].get_so_mon_hoc_da_hoc() + " " + arr_st_b[i].get_diem_tb());
			}
			ghi_file.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}