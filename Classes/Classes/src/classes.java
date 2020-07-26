
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
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	void showProductDetails() {
		System.out.println(" Product ID:" +pid);
		System.out.println(" Name:" +name);
		System.out.println(" Price:" +price);

	}
}

public class classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		System.out.println("product is   " +product);
		
		product.setProductDetails(101, name, price);
	}

}
