package p3;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("RED");
		list.add("BLUE");
		list.add("WHITE");
		list.add("BLACK");
		
//		list.replaceAll(new UnaryOperator<String>() {
//
//			@Override
//			public String apply(String t) {
//				return "WHITE";
//			}
//			
//		});
		
		list.replaceAll(t -> {
			if (t.equals("BLACK")) {
				return "DARK";
			}
			return t;
		});
		
		System.out.println(list);
	}

}
