package main.functional;

import java.util.ArrayList;
import java.util.List;

public class Helper {

	public static List<Fruit> getFruitList() {

		List<Fruit> il = new ArrayList<>();
		il.add(new Fruit(FruitColor.RED, 5, FruitType.ORANGE));
		il.add(new Fruit(FruitColor.YELLOW, 50, FruitType.ORANGE));
		il.add(new Fruit(FruitColor.GREEN, 25, FruitType.ORANGE));
		il.add(new Fruit(FruitColor.YELLOW, 15, FruitType.ORANGE));
		return il;
	}

}