package Shop;

public class customer extends user{
	
	private String entry;

	public customer(String name, String mail, long phone, String entry) {
		super(name, mail, phone);
		this.entry = entry;
	}

	@Override
	public void details() {
		System.out.println("Customer Entry No *** "+entry+" ***");
		super.details();
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	

	

	
	
	
	

	

}
