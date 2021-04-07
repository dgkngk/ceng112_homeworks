package hW2;


import java.util.*;

public class IZTECHEA {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		System.out.println("Enter the number of random request cycles:");
		choice = keyboard.nextInt();
		
		String[] products = {"Sofa","Bed","Chair","Dresser","Table","Bookcase"};
		FactoryLine factoryLine = new FactoryLine();
		
				
		while(choice != 0) {
			
			String product = null;
			
			int user =  rand.nextInt(3);
			if (user==0) {
				
				product = (products[rand.nextInt(products.length)]);
				
				
				
				
			}
			else if (user==1) {
				
			} 
			else if (user==2) {
				
				product = (products[rand.nextInt(products.length)]);
				
			}
			
			
			
			
			
			choice -=1;
			
			
			
		}
		
		
		
		
		keyboard.close();
		
		

	}

}
