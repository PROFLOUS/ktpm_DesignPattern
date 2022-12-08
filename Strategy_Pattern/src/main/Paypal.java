package main;

import java.text.DecimalFormat;

public class Paypal implements IThanhtoanStrategy {

	private String email;
	private String password;

	public Paypal(String email, String pwd) {
		this.email = email;
		this.password = pwd;
	}

	@Override
	public void thanhtoan(double sotien) {
		// TODO Auto-generated method stub
		System.out.printf("\tĐã thanh toán số tiền %s\n\tBy %s\n", new DecimalFormat("#,##0").format(sotien),
				this.toString());

	}

	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paypal [Email : " + email + "]";
	}

}
