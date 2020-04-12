package Shop;

import java.util.ArrayList;

public class payment extends menu{
	private int amount;
	private order Order;
	
	
	public payment(int price,int amount, order order) {
		super(price);
		this.amount = amount;
		Order = order;
	}
	
	

	public payment(int price,int amount) {
		super(price);
		this.amount = amount;
	}



	/*
	 public payment(String name, int serial,int amount, order order) {
		super(name,serial);
		this.amount = amount;
		this.Order = order;
	}

	@Override
	public void showmenu() {
		super.showmenu();
	}*/

	public payment() {
		
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public order getOrder() {
		return Order;
	}

	public void setOrder(order order) {
		Order = order;
	}
	
	
	public int  paychange(int price,int amount) {
		if(price >amount) {
			//System.out.println("please add more money");
			return (amount-price);
		}
		else {
			return (amount-price);
		}
		
	}
	public ArrayList<Integer> getprice(int a) {
		
		ArrayList<Integer> array1= new ArrayList<>();
		array1.add(110);
		array1.add(120);
		array1.add(90);
		array1.add(60);
		array1.add(111);
		
		ArrayList<Integer> array2= new ArrayList<>();
		array2.add(110);
		array2.add(120);
		array2.add(90);
		array2.add(60);
		array2.add(111);
		
		ArrayList<Integer> array3= new ArrayList<>();
		array3.add(110);
		array3.add(120);
		array3.add(90);
		array3.add(60);
		array3.add(111);
		
		ArrayList<Integer> array4= new ArrayList<>();
		array4.add(110);
		array4.add(120);
		array4.add(90);
		array4.add(60);
		array4.add(111);
		
		ArrayList<Integer> array5= new ArrayList<>();
		array5.add(110);
		array5.add(120);
		array5.add(90);
		array5.add(60);
		array5.add(111);
		if(a==1) {
			return array1;
		}
		else if(a==2) {
			return array2;
		}
		else if(a==3) {
			return array3;
		}
		else if(a==4) {
			return array4;
		}
		else if(a==5) {
			return array5;
		}
		else {
			return null;
		}
	}

	@Override
	public void pinmenu(ArrayList<String> array) {
		
		super.pinmenu(array);
	}

	@Override
	public ArrayList<String> showmenu(int a) {
		
		return super.showmenu(a);
	}
	
	
	
	
}
