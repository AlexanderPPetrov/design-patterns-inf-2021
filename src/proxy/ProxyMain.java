package proxy;

public class ProxyMain {

	public static void main(String[] args) {

		Sound proxySound = new ProxySound("test.mp3");
		proxySound.play();

	}

}
