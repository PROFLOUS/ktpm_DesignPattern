package main;

import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		
		//Danh sách các mặt hàng của cửa hàng
		Mathang mh1 = new Mathang("1234","Gạo",15000);
		Mathang mh2 = new Mathang("5678","Cá",40000);
		Mathang mh3 = new Mathang("2345","Muối",5000);
		//Chi tiết của Hóa đơn hd
		Hoadon hd = new Hoadon("11111", new Date());
		hd.themMathang(mh1);
		hd.themMathang(mh2);
		hd.themMathang(mh3);
		hd.xoaMathang(mh3);
//		IThanhtoanStrategy pttt = new CreditCard("1234-4321-9788", "Trần Thanh Hoa", new Date(2020, Calendar.DECEMBER, 31), "778");
//		hd.setPhuongthucThanhtoan(pttt);
//		System.out.println(hd);

		System.out.println("Thông tin thanh toán: ");
		hd.thanhtoan();
		System.out.println("=========================================");
		//Chi tiết của Hóa đơn hd2
		Hoadon hd2 = new Hoadon("22222", new Date());
		hd2.themMathang(mh1);
		hd2.themMathang(mh3);
		IThanhtoanStrategy pttt2 = new Paypal("thanhhoa@gmail.com", "@#$%");
		hd2.setPhuongthucThanhtoan(pttt2);
		System.out.println(hd2);
		System.out.println("Thông tin thanh toán: ");
		hd2.thanhtoan();

	}

}
