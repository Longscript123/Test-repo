
import java.text.NumberFormat;

public class Except {
			public static void main(String[] args) {
				try
				{
					String s = null;
					System.out.println(s.length());
					try
					{
						int a[]=new int [6];
						a[8]=5;
						try
						{
							String m = "Error";
							int i= Integer.parseInt(m);
							System.out.println(m);
						
						}
						catch(NumberFormatException b)
						{
							b.printStackTrace();
							System.out.println("catch1");
						}
					}
					catch(ArithmeticException a)
					{
						a.printStackTrace();
						System.out.println("catch3");
					}	
				}	
				catch(Exception a)
				{
					a.printStackTrace();
					System.out.println("catch2");
				}
			}
	}
