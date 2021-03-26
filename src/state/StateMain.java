package state;

public class StateMain {

	public static void main(String[] args) {


		Context player = new Context("Hero");
		
		Context enemy = new Context("The boss 01");
		
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.applyState(player);
		
		stopState.applyState(enemy);
		
		State playerState = player.getState();
		
		System.out.println("Current player state is: " + playerState.getStateName());
		

	}

}
