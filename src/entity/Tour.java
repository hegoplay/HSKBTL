package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Tour {
	private String maTour,tenTour;
	private LocalDateTime tgBatDau,tgKetThuc;
	private TinhThanh TpDiemDi,TpDiemDen;
	public Tour(String maTour, String tenTour, LocalDateTime tgBatDau, LocalDateTime tgKetThuc,
			TinhThanh tpDiemDi, TinhThanh tpDiemDen) {
		super();
		this.setMaTour(maTour);
		this.setTenTour(tenTour);
		this.setTgBatDau(tgBatDau);
		this.setTgKetThuc(tgKetThuc);
		setTpDiemDi(tpDiemDi);
		setTpDiemDen(tpDiemDen);
	}
	public Tour(String maTour) {
		super();
		this.setMaTour(maTour);
	}
	@Override
	public int hashCode() {
		return Objects.hash(maTour);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return Objects.equals(maTour, other.maTour);
	}
	public String getTenTour() {
		return tenTour;
	}
	public void setTenTour(String tenTour) {
		this.tenTour = tenTour;
	}
	public LocalDateTime getTgBatDau() {
		return tgBatDau;
	}
	public void setTgBatDau(LocalDateTime tgBatDau) {
		this.tgBatDau = tgBatDau;
	}
	public LocalDateTime getTgKetThuc() {
		return tgKetThuc;
	}
	public void setTgKetThuc(LocalDateTime tgKetThuc) {
		this.tgKetThuc = tgKetThuc;
	}
	public TinhThanh getTpDiemDen() {
		return TpDiemDen;
	}
	public void setTpDiemDen(TinhThanh tpDiemDen) {
		TpDiemDen = tpDiemDen;
	}
	public TinhThanh getTpDiemDi() {
		return TpDiemDi;
	}
	public void setTpDiemDi(TinhThanh tpDiemDi) {
		TpDiemDi = tpDiemDi;
	}
	public String getMaTour() {
		return maTour;
	}
	public void setMaTour(String maTour) {
		this.maTour = maTour;
	}
	public Object[] getObject() {
		return new Object[] {maTour,tenTour,tgBatDau.toString(),tgKetThuc.toString(),TpDiemDi.getTenTinhThanh(),TpDiemDen.getTenTinhThanh()};
	}
	
}
