package L4bconctructors;

public class ProgramRun {

	    public static void main(String[] args) {        
	        //color will be "Red"
	        Vehicle v1 = new Vehicle();
	        
	        //color will be "Green"
	        Vehicle v2 = new Vehicle("Green"); 
	        
	        System.out.println(v2.getColor());
	    }
	}