package magpierunner2;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		System.out.println(maggie.School());
                
                String statement2 =in.nextLine();
                System.out.println(maggie.college());
                String statement3=in.nextLine();
		System.out.println(maggie.getCollege());
               
                while (!statement.equals("enough college"))
		{
			 System.out.println(maggie.getrandomcollegeresponse());
			statement = in.nextLine();
		}
                System.out.println("tell me something else");
                while (!statement.equals("Bye"))
		{
			 System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}