package beans;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/Spring.xml");
		Engine e=(Engine) ac.getBean("e");
		System.out.println(e.getEngineName());
	}
}
