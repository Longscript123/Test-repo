package inventory;
import sales.Product;

public class Customer {

	public static void main(String[] args) {
		Product p = new Product();
		p.pid = Integer.parseInt(args[0]);
		p.pname = args[1];
		p.up = Integer.parseInt(args[2]);
		p.qty = Integer.parseInt(args[3]);
		
		p.tc = p.calculate();

		System.out.println("Product Name:" +p.pname+"\nProduct ID:"+p.pid+"\nUnit Price:"+p.up+"\nQuantity:"+p.qty+ "\nTotal Cost:"+p.tc );
	}

}
