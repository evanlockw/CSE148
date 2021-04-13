package p1;

public class Trail {
	private String name;
	private String id;
	private TrailType trailType;

	private static int idCounter = 0;

	public Trail(String name, TrailType trailType) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
		this.trailType = trailType;
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

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Trail [name=" + name + ", id=" + id + ", trailType=" + trailType + "]";
	}

	public enum TrailType {
		LOOP, OUT_AND_BACK, POINT_TO_POINT;
	}

	public String findTrailType1() {
		if (trailType == TrailType.LOOP) {
			return "Loop";
		} else if (trailType == TrailType.OUT_AND_BACK) {
			return "Out and Back";
		} else {
			return "Point A to Point B";
		}

	}

	public String findTrailType2() {
		switch (trailType) {
		case LOOP:
			return "Loop";
		case OUT_AND_BACK:
			return "Out and Back";
		case POINT_TO_POINT:
			return "Point A to Point B";
		default:
			return "No such type";
		}

	}
	
	public void showAllTrailTypes() {
		for (TrailType t : trailType.values()) {
			System.out.println(t);
		}
		System.out.println();
	}
}
