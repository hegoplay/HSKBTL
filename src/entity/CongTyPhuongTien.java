package entity;

import java.util.Objects;

public class CongTyPhuongTien {
	private int maCongTy;
	@Override
	public int hashCode() {
		return Objects.hash(maCongTy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CongTyPhuongTien other = (CongTyPhuongTien) obj;
		return maCongTy == other.maCongTy;
	}
	private String tenCongTy;
	public CongTyPhuongTien(int maCongTy, String tenCongTy) {
		super();
		this.setMaCongTy(maCongTy);
		this.setTenCongTy(tenCongTy);
	}
	public CongTyPhuongTien(int maCongTy) {
		super();
		this.setMaCongTy(maCongTy);
	}
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public int getMaCongTy() {
		return maCongTy;
	}
	public void setMaCongTy(int maCongTy) {
		this.maCongTy = maCongTy;
	}
	
	
}
