package beans;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/Spring.xml");
		Car c1=(Car) ac.getBean("c");
		Car c2=(Car) ac.getBean("c");
		System.out.println(c1==c2);
		System.out.println(c1.getEngine().getEngineName());
	}
}
