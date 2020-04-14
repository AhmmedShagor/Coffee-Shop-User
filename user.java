package Shop;

public class user {
	
	//**Variable
	private String name;
	private String mail;
	private long phone;
	
	
	//**Constructor
	public user() {
		//default Constructor;
	}
	public user(String name, String mail, long phone) {
		
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	}
	public user(String name, String mail) {
				
		this(name,mail,0125);
		
	}
	public user( String mail, long phone) {
		
		this("User",mail,0125);
	}
	
	
	
	//**seter && geter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void details() {
		System.out.println("User  "+name);
		System.out.println("Mail  "+mail);
		System.out.println("phone  "+phone);
	}
	
}
