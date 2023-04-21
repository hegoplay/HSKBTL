package entity;

import java.util.Objects;

public class KhachSan {
	private int maKS;
	private String tenKS, tenTinhThanh,diaChi,moTa;
	private boolean laThanhVien,conHoatDong;
	@Override
	public int hashCode() {
		return Objects.hash(maKS);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachSan other = (KhachSan) obj;
		return Objects.equals(maKS, other.maKS);
	}
	public KhachSan(int maKS, String tenKS, String tenTinhThanh, String diaChi, String moTa, boolean laThanhVien,
			boolean conHoatDong) {
		super();
		this.maKS = maKS;
		this.setTenKS(tenKS);
		this.setTenTinhThanh(tenTinhThanh);
		this.setDiaChi(diaChi);
		this.setMoTa(moTa);
		this.setLaThanhVien(laThanhVien);
		this.setConHoatDong(conHoatDong);
	}
	public KhachSan(int maKS) {
		super();
		this.maKS = maKS;
	}
	public String getTenTinhThanh() {
		return tenTinhThanh;
	}
	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getTenKS() {
		return tenKS;
	}
	public void setTenKS(String tenKS) {
		this.tenKS = tenKS;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public boolean isConHoatDong() {
		return conHoatDong;
	}
	public void setConHoatDong(boolean conHoatDong) {
		this.conHoatDong = conHoatDong;
	}
	public boolean isLaThanhVien() {
		return laThanhVien;
	}
	public void setLaThanhVien(boolean laThanhVien) {
		this.laThanhVien = laThanhVien;
	}
	public Object[] getObject() {
		return new Object[] {maKS,tenKS, tenTinhThanh,diaChi,moTa,laThanhVien,conHoatDong};
	}
	public int getMaKS() {
		return maKS;
	}
	public void setMaKS(int maKS) {
		this.maKS = maKS;
	}
	
	
}

