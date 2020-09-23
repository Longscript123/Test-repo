
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Vector;

public class Try {

	public static void main(String[] args) {
		
		//Declare all classes
		HashSet<String> h = new HashSet<>();
		Vector<String> v = new Vector<>();
		TreeMap<Integer,String> t = new TreeMap();
		HashMap<Integer, String> m = new HashMap();
		
		// HashSet, Vector add data
		h.add("Scooter"); v.add("Scooter");
		h.add("Car"); v.add("Car");
		h.add("Bike"); v.add("Bike");
		h.add("Plane"); v.add("Plane");
		h.add("Chopper"); v.add("Chopper");
		h.add("Car"); v.add("Car");
		h.add("Bike"); v.add("Bike");
		
		Iterator<String> i = h.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"    ");
		}
		
		System.out.println("");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			
			System.out.print(e.nextElement()+"     ");
		}
		
		System.out.println("");

		t.put(32,"Lion");
		t.put(65,"Tiger");
		t.put(14,"Snake");
		t.put(15,"Rabbit");
		t.put(55, "Horse");
		System.out.print(t);
		
		System.out.println("");
		
		m.put(32,"Lion");
		m.put(65,"Tiger");
		m.put(14,"Snake");
		m.put(null,"Rabbit");
		m.put(55, "Horse");
		System.out.print(m);

	}

}
