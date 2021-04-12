package p1;

public class Trail {
	private String name;
	private String id;
	private TrailType trailType;
	private double length;
	
	private static int idCounter = 0;
	
	public Trail(String name, TrailType trailType, double length) {
		super();
		this.name = name;
		id = String.valueOf(idCounter++);
		this.trailType = trailType;
		this.length = length;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void showType() {
//		if(trailType == TrailType.LOOP) {
//			System.out.println("No need to have another driver.");
//		}
		
		switch (trailType) {
		case LOOP:  
			System.out.println("It's a loop!"); 
			break;
		case OUT_AND_BACK: 
			System.out.println("It's out and back");
			break;
		case POINT_TO_POINT:
			System.out.println("It's point to point.");
			break;
		default: 
			System.out.println("No such type.");
		}
	}
	
	public void showAllTypes() {
		for (TrailType t : TrailType.values()) {
			System.out.println(t);
		}
	}
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrailType getTrailType() {
		return trailType;
	}

	public void setTrailType(TrailType trailType) {
		this.trailType = trailType;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	
	@Override
	public String toString() {
		return "Trail [name=" + name + ", id=" + id + ", trailType=" + trailType + ", length=" + length + "]";
	}



	enum TrailType {
		LOOP, POINT_TO_POINT, OUT_AND_BACK
	}
	
}
