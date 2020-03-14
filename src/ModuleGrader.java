import java.util.*;

public class ModuleGrader {
	
	public static int newMark;
	
	
	public void testModuleGrader()
	{
		
	}

	public static void main(String[] args) {
		
			startGrading();
			
	}
	
	public static void gradeModule(int mark) 
	{
		String 	Answer 	= " ";
		
		if(mark < 40)
		{
			Answer = "Fail";
		}
		else if(mark >= 40 && mark < 50)
		{
			Answer = "Pass";
		}
		else if(mark >= 50 && mark < 60)
		{
			Answer = "Merit";
		}
		else if(mark >=  60)
		{
			Answer = "Distinction";
		}
		else
		{
			Answer = null;
		}
		
		
		System.out.println(Answer);
		
		
		
	}
	
	public static void getValidModuleMark() 
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter your mark: ");
		
		if(!Input.hasNextInt())
		{
			System.out.println("You must enter a number only");
			
			int InputMark = 0;
			
			newMark = InputMark;
		}
		else
		{
			int InputMark = Input.nextInt();
			
			System.out.println("The mark you entered is: ");
			
			newMark = InputMark;
		}
		
	}
	
	public static void startGrading()
	{
		System.out.println("*********** Module Grading Program *********");
		
		getValidModuleMark();
		
		System.out.println("*************");
		
		System.out.println(newMark + "          |");
		
		System.out.println("*************");
		
		gradeModule(newMark);
		
		System.out.println("*************");
		
		continueGrading();
		
	}
	public static void continueGrading()
	{
		Scanner queryInput = new Scanner(System.in);
		
		System.out.println("Would you like to continue marking?");
		System.out.println("Enter y/n or Yes/No");
	
		String result = queryInput.nextLine().toLowerCase();
		
		if( result.equals( "y" )) 
		{
			startGrading();
		}
		else if( result.equals( "yes"))
		{
			startGrading();
		}
		if( result.equals( "n" )) 
		{
			result = "no";
		}
		else if( result.equals( "no" ))
		{
			return;
		}
		else
		{
			return;
		}
	}
}

