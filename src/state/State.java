package state;

public interface State {
	
	void applyState(Context context);
	String getStateName();
}
