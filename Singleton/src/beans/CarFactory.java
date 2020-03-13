package beans;

public class CarFactory {
	private Car c;
	
	public Car getObject() {
		if (c == null) {
			c = new Car();
			return c;
		} else {
			return c;
		}
	}
}
