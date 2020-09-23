package co.spring;

public class Employee {

	String eid;
	String ename;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void show()
	{
		System.out.println("Hello..:"+eid+"->"+ename);
	}

}
