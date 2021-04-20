package model;

public class Trail {
	private String name;
	private String id;
	private Address address;
	private TrailType trailType;
	private double length;
	private TrailLevel level;
	private double elevationGain;
	
	private static int idCounter = 0;
	
	public enum TrailType {
		LOOP, OUT_AND_BACK, POINT_TO_POINT
	}
	
	public enum TrailLevel {
		EASY, MODERATE, DIFFICULT
	}

	public Trail(String name, Address address, TrailType trailType, double length, TrailLevel level,
			double elevationGain) {
		super();
		this.name = name;
		id = String.valueOf(idCounter++);
		this.address = address;
		this.trailType = trailType;
		this.length = length;
		this.level = level;
		this.elevationGain = elevationGain;
	}
	
	
}
