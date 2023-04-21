package controller;

import entity.KhachHang;

public interface ControllerKhachHang {
	public boolean themKH(KhachHang kh);
	public void getTable();
	public boolean xoaKH(KhachHang kh);
	public boolean suaKH(KhachHang kh);
}
