import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("grapes");
		v.add("mango");
		v.add("lemon");
		v.add("apple");
		v.add("lemon");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
