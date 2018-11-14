package demo;
import java.text.SimpleDateFormat; 
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class quanlysinhvien {	
	//luu danh sach sinh vien vao vector
	Vector list = new Vector();
	public quanlysinhvien() {
		while(true) {
			System.out.println("Quan ly Sinh Vien");
			System.out.println("1. Nhap Sinh Vien");
			System.out.println("2. Xem Sinh Vien");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sinh vien:");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma sinh vien:");
			String maSinhvien=key.nextLine();
			System.out.println("Nhap ten sinh vien:");
			String tenSinhvien=key.nextLine();
			System.out.println("Nhap diem mon toan:");
			int diem=Integer.parseInt(key.nextLine());
			
			String ngaySinh=key.nextLine();	
			Sinhvien obj = new Sinhvien(maSinhvien,tenSinhvien,diem);
			list.add(obj);
		}	
		
	}
	public void InTT() {
		Enumeration sv1 = list.elements();
		int i=1;
		while(sv1.hasMoreElements()) {
			Sinhvien sv = (Sinhvien)sv1 .nextElement();
			System.out.println("Ma Sinh Vien ="+sv.getmaSinhvien()+" , Ten Sinh Vien: "+sv.gettenSinhvien()+" , Diem toan:"+sv.getdiem());
			i++;
		}
	}
}