package entity;

import java.time.LocalDate;
import java.util.Objects;

public class KhachHang {
	private String maKH,ho,ten,diaChi;
	private int SDT;
	private String email;
	private LocalDate ngayDk;
	
	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKH, other.maKH);
	}
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(String maKH) {
		super();
		this.maKH = maKH;
	}
	public KhachHang(String maKH, String ho, String ten, String diaChi, int sDT, String email, LocalDate ngayDk) {
		super();
		this.setMaKH(maKH);
		this.setHo(ho);
		this.setTen(ten);
		this.setDiaChi(diaChi);
		setSDT(sDT);
		this.setEmail(email);
		this.setNgayDk(ngayDk);
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getNgayDk() {
		return ngayDk;
	}
	public void setNgayDk(LocalDate ngayDk) {
		this.ngayDk = ngayDk;
	}
	public String getHoTen() {
		return ho + " " + ten;
	}
}
