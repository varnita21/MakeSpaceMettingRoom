package make_space;

import java.util.TreeMap;

public class Room {
	String name;
	int capacity;
	
	TreeMap<Double, Double> bookings = new TreeMap<>(); 
	
	public Room(String name,int capacity){
		this.name = name;
		this.capacity = capacity;
	}
	
	public boolean bookARoom(double startTime, double endTime) {
		if(bookings.floorKey(endTime) == null || (bookings.floorKey(endTime) != null && bookings.get(bookings.floorKey(endTime)) < startTime)) {
			bookings.put(startTime, endTime);
			return true;
		}
		return false;
	}
}

// 2 -6 3-7 3-4 7-8