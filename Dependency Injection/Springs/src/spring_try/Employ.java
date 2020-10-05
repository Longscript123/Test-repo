package spring_try;

import java.util.Iterator;
import java.util.List;

public class Employ {

	int eid;
	String ename;
	List<String> item;
	

	public Employ(int eid, String ename, List<String> item) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.item = item;
	}
	
	public  void show() {
		
		System.out.println(eid+"     "+ename);
		Iterator<String> i = item.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}
}
