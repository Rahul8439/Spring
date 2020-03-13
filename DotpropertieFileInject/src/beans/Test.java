package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;



public class Test {
	public Connection conn;
	private String driver;
	private String userid;
	private String password;
	private String url;
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void createConnection() throws SQLException {
		try {
			Class.forName(driver);
			//conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?useSSL=false");
			conn=DriverManager.getConnection(url, userid,password);
			System.out.println(conn+ "Created Successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
