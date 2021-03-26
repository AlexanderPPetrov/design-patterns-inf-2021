package state;

public class Context {

	private String name;
	private State state;

	public Context(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
	
	
}
