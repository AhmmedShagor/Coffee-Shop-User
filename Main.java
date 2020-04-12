package Shop;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		payment paym=new payment(); 
		order ym=new order();
		paym.setOrder(ym);
		
		
		//loop 
		while(true) {
			
			System.out.println("Coffee");
			System.out.println("         4Cup\n\n");
			System.out.println("Enter Choose No");
			
			System.out.println("Enter 1 for Show user\n");
			System.out.println("Enter 2 for Show Owner\n");
			System.out.println("Enter 3 for Cafe menu\n ");
			//System.out.println("Enter anyNumber to quite Server\n ");
			int a,b,c,d,e,f;
			a=scan.nextInt();
			scan.hasNextLine();
			if(a==1) {
				user used=new user("JAck","jack@gmail",1969871727L);
				used.details();
			}
			else if(a==2) {
				owner own=new owner("Ahm","me@gmail.com",1969871727L,"ajksjak","ajsja",145);
				own.details();
			}
			else if(a==3) {
				System.out.println("Menu\n");
				System.out.println("1.Cspresso\n");
				System.out.println("2.Ice & frozen\n");
				System.out.println("3.Tea & cocoa\n");
				System.out.println("4.Masala mix\n");
				System.out.println("5.Juice\n\n");
				System.out.println("Enter your Choose");
				
				
				b=scan.nextInt();
				scan.hasNextLine();
				
				
				menu Menu=new menu();
				payment pay=new payment();
				
				//ArrayList
				ArrayList<String> array= new ArrayList<>();
				ArrayList<Integer> arra= new ArrayList<>();
				
				
				array=Menu.showmenu(b);
				arra=pay.getprice(b);
				Showmymenu(array,arra);
				
				String food;
				System.out.println("\nEnter your Pack Name");
				
				scan.nextLine();
				food=scan.nextLine();
				scan.nextLine();
				
				
				/*
				//for Array store Cheek
				System.out.println(array);
				System.out.println(arra);*/
				
				//boolean con=true;
				boolean co= array.contains(food);
				
				
				
				
				
				
				if(co) {
					c=array.indexOf(food);
					d=arra.get(c);
					System.out.println("PAck found you choose\t-"+food+"  "+d+"$");
					while(true) {
						System.out.println("Enter Your ammount ");
						e=scan.nextInt();
						//payment paym=new payment(d,e); 
						f=pay.paychange(d,e);
						if(f<0) {
							System.out.println("Enter full amount\n");
							continue;
						}
						else  {
							System.out.println("you succesfully payment done!!");
							System.out.println("Change  "+f+" $  :)");
							System.out.println("Thanks for your Order\n");
							break;
						}
						
					}
					
					
					
				}
				else {
					System.out.println("PAck is unableable");
				}
				
				
				
			}
			else {
				System.out.println("You Choose Nothing ;)");
				
				
			}
			
			
			
			
			//paym.getOrder().intro();
			
			
			
			
			System.out.println("Enter 0 to continue");
			int s;
			s=scan.nextInt();
			
			
			if(s==0) {
				//clearScreen();
				paym.getOrder().intro();
				
				continue;
			
			}
			else {
				paym.getOrder().intro();
				//System.out.println("-----------------------------------------------------------------------------------------------\n\n");
				break;
			}
			
			/*customer cum=new customer("ami","me@",1969871727L,"12F5khkA4");
			cum.details();*/
		
		}
		paym.getOrder().exit();
		scan.close();
	}
		
			

			public static void Showmymenu(ArrayList<String> array1,ArrayList<Integer> array2) {
				for(int i=0;i<array1.size();i++) {
				System.out.println(i+1+"  "+array1.get(i)+"\t$"+array2.get(i));
			}
			}
			/*public static void clearScreen() {  
			    System.out.print("\033[H\033[2J");  
			    System.out.flush();  
			} */
			
			
}


		
	

