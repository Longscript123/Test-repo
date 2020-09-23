
public class keyword {
		static String org = "Amex";
		int eid;
		String eName;
		
		
		public keyword(int eid, String eName) {
			
			this.eid = eid;
			this.eName = eName;
		}
		static void change() {
			org = "Tesla";
		}
		void disp()
		{
			System.out.println(eid+"  "+eName+"   "+org);
		}

		public static void main(String[] args) {
			
		keyword.change();
		keyword m1=new keyword(28,"Matt");
		keyword m2=new keyword(16,"Linda");
		keyword m3=new keyword(39,"Craig");
		m1.disp();
		m2.disp();
		m3.disp();
		}

}
