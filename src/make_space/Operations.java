package make_space;

import java.util.HashMap;
import java.util.Map;

public class Operations {
	
	public void book(double d, double f, int people) {
		if(!validate(d,f, people))	return;
		
		MeetingRooms room = new MeetingRooms();
		for(Map.Entry<Integer, Room> e:room.available_rooms.entrySet()) {
			if(people <= e.getKey()) {
				if(room.callToBookARoom(d, f)) {
					System.out.println(e.getValue().name);
					return;
				}
			}
		}
		System.out.println("NO_VACANT_ROOM");
	}
	
	public void checkVacancy(double startT, double endT) {
		MeetingRooms mroom = new MeetingRooms();
		if(!validate(startT,endT,3))	return;
		HashMap<String, Integer> vacancyOutput = mroom.vacancy(startT, endT);
		for(String roomName: vacancyOutput.keySet()) {
			System.out.print(roomName+" ");
		}
	}
	
	public boolean validate(double d,double f, int people) {
		ValidateInput v = new ValidateInput();
		if(!v.validate(d, f, people)) {
			System.out.println("INCORRECT_INPUT");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
//		op.checkVacancy(11.00, 12.00);
//		System.out.println("no");
		op.book(11.00, 11.45, 2);
		System.out.println("here");
		op.checkVacancy(11.00, 12.00);
		System.out.println("now");
		op.book(11.00, 11.45, 2);
	}

}
