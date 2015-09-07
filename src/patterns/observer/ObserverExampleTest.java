package patterns.observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverExampleTest {
	Observer observer = new Observer();
	Observerable observerable;
		
	@Test()
	public void unsubscribe() {
		Observerable observerable1 = new ObserableTest();
		observer.subscribe(observerable1); // adding
		Observerable observerable2 = new ObserableTest();		
		observer.subscribe(observerable2); // adding		
		assertTrue(observer.subscribers.size() == 2);
		
		observer.unsubscribe(observerable2); // removing
		assertTrue(observer.subscribers.size() == 1);
		observer.unsubscribe(observerable1); // removing
		assertTrue(observer.subscribers.size() == 0);
		
		observer.unsubscribe(observerable1);
		assertTrue(observer.subscribers.size() == 0);		
	}	
}


class ObserableTest implements Observerable {

	@Override
	public void onEvent() {		
	}
	
}
