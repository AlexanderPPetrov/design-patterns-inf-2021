package state;

public class StartState implements State {

	private String stateName = "START_STATE";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return stateName;
	}

}
