import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> h = new TreeMap();
		h.put(533,"java");
		h.put(318,"android");
		h.put(22,"python");
		h.put(914,"spring");
		System.out.println(h.get(914));
		System.out.println(h);

	}

}
