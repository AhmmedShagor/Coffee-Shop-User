package Shop;

import java.util.ArrayList;

public class menu {
	
	
	private int price;
	
	//ArrayList<String> array= new ArrayList<>();
	
	public menu() {
		//default
	}
	
	public menu(int price) {
		
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//Comment start
	/*public menu(String name, int serial) {
		this.name = name;
		this.serial = serial;
	}

	public menu(String name) {
		this(name,0);
		this.name = name;
	}

	public menu(int serial) {
		this("name",serial);
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}
	*/
	//Comment finish
	
	
	public void pinmenu(ArrayList<String> array) {
		for(String x:array) {
			
			System.out.println(x);
			
		}
		/*
		for(int i=0;i<array.size();i++) {
			System.out.println(i+1+"  "+array.get(i));
		}*/
		
	}
	
	
	/*public ArrayList<String> retarray(ArrayList<String> Array){
			array=Array;
			return Array;
		
	}*/
	
	
	
	public ArrayList<String>  showmenu(int a) {
		/*System.out.println("Coffee");
		System.out.println("         4Cup/n/n");*/
		
		
		//cspresso
		
				ArrayList<String> array1= new ArrayList<>();
				array1.add("Latte");
				array1.add("Mocha");
				array1.add("Caramel Mocchiato");
				array1.add("Cappuccino");
				array1.add("Americano");
		
		//ice & frozen
		
				ArrayList<String> array2= new ArrayList<>();
				array2.add("Iced Latte");
				array2.add("Iced Mocha");
				array2.add("Iced Mocchiato");
				array2.add("iced coffee");
				array2.add("iced Aulat");
		
		//Tea & cocoa
		
				ArrayList<String> array3= new ArrayList<>();
				array3.add("Hot tea");
				array3.add("Ice tea");
				array3.add("Hot Cocolate");
				array3.add("mixed ice coffee");
				array3.add("lamon tea");
		
				
		//Masala mix
				
				ArrayList<String> array4= new ArrayList<>();
				array4.add("Hard Masala tea");
				array4.add("lite lamon tmb");
				array4.add("Hydarabadi Masala");
				array4.add("Shat Rang Tea");
				array4.add("Chilli Tea");
		
				
		//Juice
				
				ArrayList<String> array5= new ArrayList<>();
				array5.add("Kasmiri Juice");
				array5.add("Islamabad Mango");
				array5.add("Lemon");
				array5.add("Pineapple  Juice");
				array5.add("Icey Aulat");
				
				
				if(a==1) {
					System.out.println("---- Cspresso Item  ---\n");
					//pinmenu(array1);
					return array1;
				}
				else if(a==2) {
					System.out.println("---- Ice & frozen Item---\n");
					//pinmenu(array2);
					return array2;
				}
				else if(a==3) {
					System.out.println("---- Tea & cocoa- Item---\n");
					//pinmenu(array3);
					return array3;
				}
				else if(a==4) {
					System.out.println("---- Masala mix- Item---\n");
					//pinmenu(array4);
					return array4;
				}
				else if(a==5) {
					System.out.println("---- Juice- Item---\n");
					//pinmenu(array5);
					return array5;
				}
				else {
					return null;
				}
				
	}
	
}
