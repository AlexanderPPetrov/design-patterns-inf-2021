package command;

public class CommandMain {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		Lights lights = new Lights();
		
		Command LightsOnCommand = new LightsOnCommand(lights);
		Command LightsOffCommand = new LightsOffCommand(lights);

		remoteController.setCommand(LightsOnCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(LightsOffCommand);
		remoteController.pressButton();

	}

}
