package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Adam");
		names.add("Bill");
		names.add("Cathy");
		names.add("Dave");
		
		Object[] objArr1 = names.toArray();
		String[] objArr2= names.toArray(new String[names.size()]);
		System.out.println(Arrays.toString(objArr1));

//		names.replaceAll(new UnaryOperator<String>() {
//
//			@Override
//			public String apply(String t) {
//				if (t.equals("Bill")) {
//					return "Hello " + t;
//				} else
//					return t;
//
//			}
//		});
//
//		System.out.println(names);

	}

}
