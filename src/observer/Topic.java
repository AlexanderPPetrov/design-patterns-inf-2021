package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private String topicName;
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// Can be something more than just a getter
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
		this.notifyObservers();
	}

}
