package controller;
import entity.KhachSan;
public interface ControllerKhachSan {
	public void fillTable();
	public void locTable(String tenTinhThanh, boolean isThanhVien,boolean dangHoatDong,boolean isGiam);
	public void addRow(KhachSan temp);
	public void fixRow(KhachSan temp);
	public void deleteRow(KhachSan temp);
}