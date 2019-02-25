package model;

import java.util.ArrayList;
import java.util.List;

public class ListSinhVien {
	private List<SinhVien> lst = new ArrayList<SinhVien>();
	
	public ListSinhVien() {
		SinhVien sv1 = new SinhVien("Quang", 22, "06DHTH1");
		SinhVien sv2 = new SinhVien("Đức", 25, "06DHTH1");
		SinhVien sv3 = new SinhVien("Bảo", 21, "06DHTH2");
		SinhVien sv4 = new SinhVien("Song", 22, "06DHTH1");
		SinhVien sv5 = new SinhVien("Hiếu", 22, "06DHTH4");
		
		lst.add(sv1);
		lst.add(sv2);
		lst.add(sv3);
		lst.add(sv4);
		lst.add(sv5);
	}
	
	public void addSV(SinhVien sv) {
		lst.add(sv);
	}

	public List<SinhVien> getLst() {
		return lst;
	}

	public void setLst(List<SinhVien> lst) {
		this.lst = lst;
	}
	
}
