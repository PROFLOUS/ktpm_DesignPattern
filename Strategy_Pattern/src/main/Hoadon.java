package main;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Hoadon {

	private String mshd;
	private Date ngayHoadon;
	private IThanhtoanStrategy hinhthucThanhtoan;
	private List<Mathang> dsMathang;

	public Hoadon(String maso, Date ngayHoadon) {
		this.mshd = maso;
		this.ngayHoadon = ngayHoadon;
		this.dsMathang = new ArrayList<Mathang>();
	}

	public void themMathang(Mathang mh) {
		this.dsMathang.add(mh);
	}

	public void xoaMathang(Mathang mh) {
		this.dsMathang.remove(mh);
	}

	public double getTongtien() {
		double tongtien = 0;
		for (Mathang mh : dsMathang) {
			tongtien += mh.getDongia();
		}
		return tongtien;
	}

	public void thanhtoan() {
		double tongtien = getTongtien();
		hinhthucThanhtoan.thanhtoan(tongtien);
	}

	/**
	 * @param phuongthuc the phuongthucThanhtoan to set
	 */
	public void setPhuongthucThanhtoan(IThanhtoanStrategy phuongthuc) {
		this.hinhthucThanhtoan = phuongthuc;
	}

	public List<Mathang> getDsMathang() {
		return dsMathang;
	}

	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String str = "Mã số hóa đơn : " + mshd + "\nNgày lập hóa đơn : " + df.format(ngayHoadon);
		str += "\nDanh sách các mặt hàng:";
		str += "\n\t" + String.format("%-10s%-10s%15s", "Mã hàng", "Tên hàng", "Đơn giá");
		for (Mathang mh : dsMathang) {
			str += "\n\t" + mh;
		}
		return str;
	}

}
