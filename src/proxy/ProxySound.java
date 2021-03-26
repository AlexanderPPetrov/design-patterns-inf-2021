package proxy;

public class ProxySound implements Sound {

	private String fileName;
	private RealSound realSound;
	
	public ProxySound(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void play() {
		
		// Here we can check whether to give an access to realSound or not
		//		if(true) {
		//			return;
		//		}

		realSound = new RealSound(this.fileName);
		realSound.play();
	}

}
