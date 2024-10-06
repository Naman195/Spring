package in.sp.beans;

public class Address {
	private int houseno;
	private String streetname;
	private int pincode;

	public Address(int houseno, String streetname, int pincode)
	{
		this.houseno = houseno;
		this.streetname = streetname;
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseno + " " + streetname + " " + pincode;
	}
	
}
