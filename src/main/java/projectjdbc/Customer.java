package projectjdbc;

public class Customer {
	private static int cust_id;
	private static String cust_name;
	private static String cust_address;
	public static int getCust_id() {
		return cust_id;
	}
	public static void setCust_id(int cust_id) {
		Customer.cust_id = cust_id;
	}
	public static String getCust_name() {
		return cust_name;
	}
	public static void setCust_name(String cust_name) {
		Customer.cust_name = cust_name;
	}
	public static String getCust_address() {
		return cust_address;
	}
	public static void setCust_address(String cust_address) {
		Customer.cust_address = cust_address;
	}
	@Override
	public String toString() {
		return "Customer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
