package model;

public class SinhVien {
	private String name;
	private int tuoi;
	private String lop;
	public SinhVien(String name, int tuoi, String lop) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.lop = lop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
}
