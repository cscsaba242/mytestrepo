package patterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObserverExample {

	public static void main(String args[]) {}
}

class Observer {
	List<Observerable> subscribers = new ArrayList<Observerable>();
	
	public void subscribe(Observerable observerable) {
		subscribers.add(observerable);
	}
	
	public void unsubscribe(Object obj) {
		Iterator<Observerable> i = subscribers.iterator();
		while(i.hasNext()) {
			Object next = i.next();	
			if(next == obj) {	
				i.remove();
			}		
		}		
	}
	
	public void onEvent() {
		for(Observerable observerable : subscribers) {
			observerable.onEvent();
		}
	}
}

interface Observerable {
	public void onEvent();
}
