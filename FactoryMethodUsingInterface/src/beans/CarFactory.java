package beans;

public class CarFactory {
	private Car c;
	private String carName;
	
	public Car getObject() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if (c == null) {
			c=(Car) Class.forName(carName).newInstance();;
			return c;
		} else {
			return c;
		}
	}
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
}
