package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo1 {
	private static String total = "";
	public static void main(String[] args) {
//		ArrayList<String> list1 = new ArrayList<>(); // the initial array size = 10
		
		ArrayList<String> babyList = new ArrayList<String>();
		babyList.add("X");
		babyList.add("Y");
		babyList.add("Z");
		
		ArrayList<String> list1 = new ArrayList<String>(babyList); // the initial array size = 10
//		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
//		list1.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.equals("C") || t.equals("X");
//			}
//			
//		});
		
//		list1.removeIf(s ->
//			s.equals("C") || s.equals("X")
//		);
//		
//		
//		System.out.println(list1);
//		
//		ArrayList<String> babyList = new ArrayList<>();
//		babyList.add("X");
//		babyList.add("Y");
//		babyList.add("Z");

//		list1.addAll(babyList);
		
//		list1.forEach(s -> System.out.println(s));
		
		String [] letters =(String[]) (list1.toArray(new String[list1.size()]));
//
		System.out.println(Arrays.toString(letters));
		
//		list1.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				total += t;
//			}
//		});
//		
//		list1.forEach(s -> 
//			total += s
//		);
//		System.out.println(total);
//		System.out.println(list1);
	}

}
