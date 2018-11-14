package demo; import java.text.SimpleDateFormat; import java.util.Date; import java.util.Scanner;

public class Sinhvien {
	String maSinhvien;
	String tenSinhvien;
	int diem;

	public String getmaSinhvien() {
		return maSinhvien;
	}
	public void setMaSach(String maSinhvien) {
		this.maSinhvien = maSinhvien;
	}
	public String gettenSinhvien() {
		return tenSinhvien;
	}
	public void settenSinhvien(String tenSinhvien) {
		this.tenSinhvien = tenSinhvien;
	}
	public int getdiem() {
		return diem;
	}
	public void setdiem(int diem) {
		this.diem = diem;
	}
	
	public Sinhvien() {
		
	}
	public Sinhvien(String maSinhvien,String tenSinhvien,int diem) {
		this.maSinhvien=maSinhvien;
		this.tenSinhvien=tenSinhvien;
		this.diem=diem;
	
	}
	
	public static void main(String args[])
	{
		new quanlysinhvien();
	}		
		
}