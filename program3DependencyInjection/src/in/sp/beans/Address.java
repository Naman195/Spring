package in.sp.beans;

public class Address {
	private int houseno;
	private String streetname;
	private int pincode;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseno + " " + streetname + " " + pincode;
	}
	
}
