package make_space;

import java.util.TreeMap;

public class ValidateInput {
	TreeMap<Double, Double> bufferTime = new TreeMap<>();
	
	public boolean validate(double vStartTime, double  vEndTime, int noPeople) {
		
		// validate 15 minute time interval
//		if((int)vStartTime*100%15 != 0 || (int)vEndTime*100%15 != 0) 
//			return false;
		
		// validate buffer time
		if(bufferTime.floorKey(vEndTime) !=null && bufferTime.get(bufferTime.floorKey(vEndTime)) > vStartTime)
			return false;
		
		// validate time inputs
		if(vStartTime > vEndTime) 
			return false;
		
		// validate people capacity
		if(noPeople<2 || noPeople > 20)
			return false;
		
		return true;
	}
	
	ValidateInput(){
		
	}

}
