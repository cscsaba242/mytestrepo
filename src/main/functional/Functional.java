package main.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functional {
	private static UserDefFunc udf = (int a, int b) -> {System.out.println(a-b);};
	private static Predicate<String> s = (String s) -> {return s.length() > 3 ? true : false;}; // test
	private static IntPredicate p = (int i) -> {return false;}; // ...... specialization for input type	
	private static Function<Integer, String> f = (Integer i) -> {return String.valueOf(i);}; // apply
	private static Consumer<String> c = (String i) -> {String.valueOf(i);}; // accept
	private static Supplier<String> ss = () -> {return "";}; // get
	private static IntSupplier sss = () -> {return 2;};	 // ...... specialization for input type
	
	public static void main(String[] args) {
		// .......................................................... calling user defined in-line 
		udf.minus(2,3);		
		// .......................................................... calling Predicate in-line
		System.out.println(s.test("helloworld"));		
		// .......................................................... passing over an lambda as Predicate
		predicateArgument((String s) -> {return true;});
	}
	
	public static void predicateArgument(Predicate<String> p) {	 
		p.test("vmi");
	}
	
}

// Custom
@FunctionalInterface
interface UserDefFunc  {
	void minus(int a, int b);
}
