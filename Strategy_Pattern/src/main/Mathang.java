package main;

import java.text.DecimalFormat;


public class Mathang {
	private String mahang;
	private String tenhang;
	private double dongia;
	
	public Mathang(String mahang, String tenhang, double dongia) {
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
		}
	
	@Override
	public String toString() {
	return String.format("%-10s%-10s%15s", mahang, tenhang,new
	DecimalFormat("#,##0").format(dongia));
	}
	
	public String getMahang() {
		return mahang;
		}
		/**
		* @return the tenhang
		*/
		public String getTenhang() {
		return tenhang;
		}
		/**
		* @return the dongia
		*/
		public double getDongia() {
		return dongia;
		}
		/**
		* @param mahang the mahang to set
		*/
		public void setMahang(String mahang) {
		this.mahang = mahang;
		}
		
		public void setTenhang(String tenhang) {
			this.tenhang = tenhang;
			}
			/**
			* @param dongia the dongia to set
			*/
			public void setDongia(double dongia) {
			this.dongia = dongia;
			}



}
