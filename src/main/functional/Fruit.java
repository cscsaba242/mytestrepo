package main.functional;

public class Fruit {
	public FruitColor getColor() {
		return color;
	}

	public void setColor(FruitColor color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public FruitType getType() {
		return type;
	}

	public void setType(FruitType type) {
		this.type = type;
	}

	public FruitColor color;
	public int size;
	public FruitType type;

	public Fruit() {
	}

	public Fruit(FruitColor color, int size, FruitType type) {
		super();
		this.color = color;
		this.size = size;
		this.type = type;
	}    	
}