package patterns.builder;

public class BuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Builded {
	public int wall;
	public int roof;
	public int base;
	
	public Builded(int base) {
		this.base = base;
	}
	
	public static class BuildedBuilder {
		public static Builded builded = new Builded(0);
		
		public static Builded build() {
			return builded;
		}
		
		public static BuildedBuilder addWall(int wall) {
			return this;
		}
	}
	
}