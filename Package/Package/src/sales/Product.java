package sales;

public class Product {

	public int pid,qty,up,tc;
	public String pname;
	
	public int calculate(){
		tc = qty*up;
		return tc;
	}
}
