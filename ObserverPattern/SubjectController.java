import java.util.ArrayList;
import java.util.List;

public class SubjectController implements MyObservable{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private boolean play;
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		int index = observers.indexOf(o); // find()같은 느낌
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(play);
		}
	}

	public boolean getPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
		notifyObservers();
	}
	
	

}
