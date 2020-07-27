import java.util.*;

class Product{
	
	//Attributes
	int pid;
	String name;
	int price;
	
	//Constructor
	Product(){
		System.out.println("Product object constructor");
	}
	
	//Methods
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid; //this means reference to current object 
		this.name = name; //LHS belongs to object RHS belongs to method
		this.price = price;
	}
	
	
	void showProductDetails() {
		System.out.println(" Product ID:" +pid);
		System.out.println(" Name:" +name);
		System.out.println(" Price:" +price);

	}
}

class Mobile extends Product{ //Is-a relation, mobile is child product is a parent

	String os;
	int ram;
	int sdCardSize;
	
	//Constructor
	Mobile(){
		System.out.println("Mobile object constructed");
	}
	
	//Methods
	
	//Method Overloading
	//redefined the same method in parent with different input in child
	//This is a compile time or static polymorphism
	
	void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) { 
		this.pid = pid; 
		this.name = name; 
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.sdCardSize = sdCardSize;
		System.out.println("Data in Product Object");
	}
	
	
	//Method overriding
	//Same method name with same inputs in a parent child relation has different outputs
	//This is a run time or dynamic polymorphism
	
	void showProductDetails() {
		System.out.println(" Product ID:" +pid);
		System.out.println(" Name:" +name);
		System.out.println(" Price:" +price);
		System.out.println(" OS:" +os);
		System.out.println(" RAM:" +ram);
		System.out.println(" SD Card:" +sdCardSize);

	}
}


public class classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		System.out.println("product is   " +product);
		
		//Writing data in object
		product.setProductDetails(101, "Light bulb", 220);
		
		//Getting user input
		Scanner stuff = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = stuff.nextInt();
		
		//Printing user input
		System.out.println("The entered number is:"+ number);
		
		//Print product details
		product.showProductDetails();
		
		Mobile mobile = new Mobile(); //Product object gets constructed before the mobile object -Rule of Inheritence
		
		//Set mobile object
		mobile.setProductDetails(128, "Macbook", 23, "Mac OS", 4, 6);
		mobile.showProductDetails();
		
		stuff.close();
		
	}

}
