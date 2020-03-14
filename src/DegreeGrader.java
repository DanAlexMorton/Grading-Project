import java.util.*;



public class DegreeGrader {
	
	public static int[] usrMarks = new int[3];

	public static void main(String[] args) {
		usrInput();

	}
	/*takes in 4 parameters  all module average, ISM module average, number of compensentable
	failed credits and number of outright failed modules */
	public static void gradeDegree(int avgModule, int avgISM, int noCompensentable, int failedModule )
	{
		//produces a distinction, merit, pass or fail grade
	}
	public static void usrInput()
	{
	      for( int i = 0; i < 3; i++ ) {
	    	  Scanner Inputs = new Scanner( System.in );
	    	
	    	if(i == 0)
	    	{
	    	  	    	  
	    		System.out.println( "Enter Your ISM Average 0 - 100: " );
	    	 
	    		if(Inputs.nextInt() < 0 && Inputs.nextInt() > 100)
		    		{
	    				System.out.println( "Error Number Out of Range " );
	    				
	    				System.out.println( "Enter Your ISM Average 0 - 100: " );
	    				
		    			i = 0;
		    	
		    		}
	    	 
	    	}
	    	else if(i == 1)
	    	{
	    		System.out.println( "Enter the Number of Compensentable Failed Credits 0 - 180: " );
	    		
	    		if(Inputs.nextInt() < 0 && Inputs.nextInt() > 180)
		    	{
	    			System.out.println( "Error Number Out of Range " );
	    			
	    			System.out.println( "Enter the Number of Compensentable Failed Credits 0 - 180: " );
	    			
		    		i = 1;
		    	
		    	}
	    	}
	    	else if(i == 2)
	    	{
	    		System.out.println( "Enter the Number of Outright Failed Modules 0 - 11: " );
	    		
	    		if(Inputs.nextInt() < 0 && Inputs.nextInt() > 11)
		    	{
	    			System.out.println( "Error Number Out of Range " );
	    			
	    			System.out.println( "Enter the Number of Outright Failed Modules 0 - 11: " );
	    			
		    		i = 2;
		    	
		    	}
	    	}
	    	if(Inputs.hasNextInt())
	    	{
	    		
	    		usrMarks[i] = Inputs.nextInt();
	    	
	    	}
	    	else
	    	{
	    		
	    		usrInput();
	    		
	    	}
	    	
	      }
	      String strMarks = Arrays.toString(usrMarks);
	      
	      System.out.println("Here are your marks: " + strMarks);
	}
	public static void startGrading()
	{
		
	}
	

}
