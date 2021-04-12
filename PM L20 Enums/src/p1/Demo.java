package p1;

import p1.Trail.TrailType;

public class Demo {

	public static void main(String[] args) {
		Trail t1 = new Trail("Trail 1", TrailType.POINT_TO_POINT, 10.5);
		Trail t2 = new Trail("Trail 2", TrailType.LOOP, 1.5);
		System.out.println(t2);
		
		t2.setName("Trail Two");
//		t1.showType();
//		t1.showAllTypes();
//		String str = t1.getTrailType().toString();
//		System.out.println(str);
//		
//		TrailType type1 = TrailType.valueOf("LOOP");
//		System.out.println(type1.toString());
		
	}

}
