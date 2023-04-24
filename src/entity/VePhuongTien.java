package entity;

public class VePhuongTien {
	private int maVe;
	private String ctpt; //Cong ty phuong tien
	private String loaiVe;
	private TinhThanh tpDiemDi,tpDiemDen;
	private double giaVe;
	private boolean conHoatDong;
	public VePhuongTien(int maVe, String ctpt, String loaiVe, TinhThanh tpDiemDi, TinhThanh tpDiemDen,double giaVe,boolean conHoatDong) {
		super();
		this.setMaVe(maVe);
		this.setCtpt(ctpt);
		this.setLoaiVe(loaiVe);
		this.setTpDiemDi(tpDiemDi);
		this.setTpDiemDen(tpDiemDen);
		this.setGiaVe(giaVe);
		this.setConHoatDong(conHoatDong);
	}
	public VePhuongTien(int maVe) {
		super();
		this.setMaVe(maVe);
	}
	public int getMaVe() {
		return maVe;
	}
	public void setMaVe(int maVe) {
		this.maVe = maVe;
	}
	public String getCtpt() {
		return ctpt;
	}
	public void setCtpt(String ctpt) {
		this.ctpt = ctpt;
	}
	public String getLoaiVe() {
		return loaiVe;
	}
	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}
	public TinhThanh getTpDiemDi() {
		return tpDiemDi;
	}
	public void setTpDiemDi(TinhThanh tpDiemDi) {
		this.tpDiemDi = tpDiemDi;
	}
	public TinhThanh getTpDiemDen() {
		return tpDiemDen;
	}
	public void setTpDiemDen(TinhThanh tpDiemDen) {
		this.tpDiemDen = tpDiemDen;
	}
	public Object[] getObject() {
		return new Object[] {maVe,ctpt,loaiVe,tpDiemDi.getTenTinhThanh(),tpDiemDen.getTenTinhThanh(),giaVe,conHoatDong};
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public boolean isConHoatDong() {
		return conHoatDong;
	}
	public void setConHoatDong(boolean conHoatDong) {
		this.conHoatDong = conHoatDong;
	}
	
}
