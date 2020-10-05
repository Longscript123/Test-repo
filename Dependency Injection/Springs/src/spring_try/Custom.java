package spring_try;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring_try.Employ;

public class Custom {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("Spring2.xml");
		BeanFactory fac = new XmlBeanFactory(r);
		/*Emp e = (Emp) fac.getBean("eBean");
		e.show();*/
		Employ e = (Employ) fac.getBean("eBean");
		e.show();
	}

}
