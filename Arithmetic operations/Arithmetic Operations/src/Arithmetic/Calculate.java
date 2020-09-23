package Arithmetic;

class Operation{
	int add(int a,int b)
	{
		return a+b;
	}
	int subtract(int a,int b)
	{
		return a-b;
	}
	int multiply(int a,int b)
	{
		return a*b;
	}
	float divide(int a,int b)
	{
		return a/b;
	}
}

public class Calculate {

	public static void main(String[] args) {

		int a = 5, b = 8, add, sub, multiply;
		float div;
		
		Operation m = new Operation();
		
		add = m.add(a, b);
		sub = m.subtract(a, b);
		multiply = m.multiply(a, b);
		div = m.divide(a, b);

		System.out.println("Sum is :" +add);
		System.out.println("Difference is :" +sub);
		System.out.println("Product is :" +multiply);
		System.out.println("Division is :" +div);
	}

}


