package beans;

public class Car {
	private Engine engine;

	public Car() {
		System.out.println("Test");		
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
