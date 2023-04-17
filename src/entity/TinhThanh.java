package entity;

import java.util.Objects;

public class TinhThanh {
	private String maTinhThanh,tenTinhThanh,tenTinhThanh_en,tenDayDu,tenDayDu_en,tenMa;

	@Override
	public int hashCode() {
		return Objects.hash(maTinhThanh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TinhThanh other = (TinhThanh) obj;
		return Objects.equals(maTinhThanh, other.maTinhThanh);
	}

	public TinhThanh(String maTinhThanh, String tenTinhThanh, String tenTinhThanh_en, String tenDayDu,
			String tenDayDu_en, String tenMa) {
		this.setMaTinhThanh(maTinhThanh);
		this.setTenTinhThanh(tenTinhThanh);
		this.setTenTinhThanh_en(tenTinhThanh_en);
		this.setTenDayDu(tenDayDu);
		this.setTenDayDu_en(tenDayDu_en);
		this.setTenMa(tenMa);
	}

	public TinhThanh(String maTinhThanh) {
		super();
		this.setMaTinhThanh(maTinhThanh);
	}

	public String getTenMa() {
		return tenMa;
	}

	public void setTenMa(String tenMa) {
		this.tenMa = tenMa;
	}

	public String getMaTinhThanh() {
		return maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	public String getTenTinhThanh_en() {
		return tenTinhThanh_en;
	}

	public void setTenTinhThanh_en(String tenTinhThanh_en) {
		this.tenTinhThanh_en = tenTinhThanh_en;
	}

	public String getTenDayDu() {
		return tenDayDu;
	}

	public void setTenDayDu(String tenDayDu) {
		this.tenDayDu = tenDayDu;
	}

	public String getTenTinhThanh() {
		return tenTinhThanh;
	}

	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	public String getTenDayDu_en() {
		return tenDayDu_en;
	}

	public void setTenDayDu_en(String tenDayDu_en) {
		this.tenDayDu_en = tenDayDu_en;
	}
	public String getTenTinhThanh(String maTinh) {
		return this.tenTinhThanh;
	}
}
