import java.util.Map;


public class StudentRecord {

	private String studentID;
	private Map<String,String> records;
	
	public float calculateGPA()
	{
		int total = 0;
	    int dec = 0;
	    
		for (String grades:records.values()) {

	        if (grades.equals("A")){
	        dec = 4; 
	        total += dec;

	    } else if (grades.equals("B")){
	        dec = 3;
	        total += dec;

	    } else if (grades.equals("C")){
	        dec = 2;
	        total += dec;

	    } else if (grades.equals("D")){
	        dec = 1;
	        total += dec;

	    } else if (grades.equals("F")){
	        dec = 0;
	        total += dec;

	    }

	    }
		return dec/total;
		
		
	}
}
