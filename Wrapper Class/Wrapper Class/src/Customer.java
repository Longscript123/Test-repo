
public class Customer {

	public static void main(String[] args) {
		
		int cid=Integer.parseInt(args[0]);
		//System.out.println(args[0]);
		String cname=args[1];
		String product=args[2];
		float price= Float.parseFloat(args[3]);
		System.out.println("Our customer  "+cname+"  with CID:  "+cid+" bought "+product+" with price "+price);
	}

}
