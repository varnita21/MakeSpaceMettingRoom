package make_space;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class MeetingRooms {
	Room c = new Room("C-Cave", 3);
	Room d = new Room("D-Tower", 7);
	Room g = new Room("G-Mansion", 20);
	
//	TreeMap<Float, HashMap<Integer, String>> meeting_rooms = new TreeMap<>();
	HashMap<Integer, Room> available_rooms = new HashMap<>();
	
	public MeetingRooms() {
		available_rooms.put(3, c);
		available_rooms.put(7, d);
		available_rooms.put(20, g);
	}
	
	public HashMap<String, Integer> vacancy(double startTime, double endTime){
		HashMap<String, Integer> v= new HashMap<>();
		for(Room r:available_rooms.values()) {
			System.out.println("b "+r.bookings);
			if(r.bookings.floorKey(endTime) == null || (r.bookings.floorKey(endTime) != null && r.bookings.get(r.bookings.floorKey(endTime))<startTime))
				v.put(r.name, r.capacity);
		}
		return v;
	}
	
	public boolean callToBookARoom(double d2, double f) {
		return c.bookARoom(d2, f);
		
	}
}
