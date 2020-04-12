package Shop;

public class owner extends user {
	
	//**Variable
	private String pass;
	private	String address;
	private int id;
	
	//**Constructor
	
	public owner(String name, String mail, long phone, String pass, String address, int id) {
		super(name, mail, phone);
		this.pass = pass;
		this.address = address;
		this.id = id;
	}

	//**Override
	@Override
	public void details() {
		
		System.out.println("Owner Id  "+id);
		super.details();
		System.out.println("Owner Address  "+address);
		
		
	}

	//**Seter&&Geter
	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
