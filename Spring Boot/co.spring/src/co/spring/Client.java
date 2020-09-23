package co.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("Customer.xml");
		BeanFactory fac = new XmlBeanFactory(r);
		Employee e1 = (Employee) fac.getBean("emp1");
		Employee e2 = (Employee) fac.getBean("emp2");
		e1.show();
		e2.show();

	}

}
