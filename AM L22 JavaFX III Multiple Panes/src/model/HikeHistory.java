package model;

import java.util.ArrayList;

public class HikeHistory {
	private ArrayList<Hike> hikes;
	
	public HikeHistory() {
		hikes = new ArrayList<>();
	}
	
	public void addHike(Hike hike) {
		hikes.add(hike);
	}
	
	public ArrayList<Hike> getHistory() {
		return hikes;
	}
}
