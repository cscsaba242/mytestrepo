package main.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

	public static void main(String[] args) {
		
		List<Fruit> vmi = Helper.getFruitList();
		List<Fruit> vmi2 = vmi.stream().filter(d->d.size>5).collect(Collectors.toList());
		
		for (Fruit fruit : vmi2) {
			writeConsole(fruit);
		}
		
/*		List<Fruit> vmi3 = vmi.stream().map((Fruit t)-> t.getType()).collect(Collectors.toList());
		
		for (Fruit fruit : vmi2) {
			writeConsole(fruit);
		}		
*/
	}
	
	public static void writeConsole(Fruit f) {
		System.out.println(f.type.toString());
	}

}
