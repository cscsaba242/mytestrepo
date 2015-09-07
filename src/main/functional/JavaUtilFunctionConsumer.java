package main.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaUtilFunctionConsumer {

	static Consumer<String> c = (String a) -> {
		System.out.println(a + " vmi");
	};

	public static void JavaUtilFunctionConsumerMain(String[] args) {
		List<String> il = Arrays.asList("elso","masodik", "negyedik", "otodik", "hatodik");
		il.forEach(c);
	}

}
