package magpierunner2;
import java.util.Scanner;
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
        public String School(){
        return "Tell me about your school.";}
        
        public String college(){
        return "Where do you want to go for college?";
        }
        public String getCollege(){
        System.out.println("that's a good school");
        System.out.println("have you applied yet?");
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        if(a.indexOf("yes")>=0){
        System.out.println("cool, have you been admitted?");
        String b=input.nextLine();
        if(b.indexOf("yes")>=0){System.out.println("Condgrats");}
        else{System.out.println("Good Luck");}
        }
        else{System.out.println("FIghting");}
        return "";
        }
        
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf(" no ") >= 0||statement.indexOf("No")>=0||statement.compareTo("NO")>=0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
        public String getrandomcollegeresponse(){
        final int num=3;
        double r=Math.random();
        int whichresponse=(int)(r*num);
        String response="";
        if(whichresponse==0){
        response="you must be a good student";}
        else if(whichresponse==1){
        response="I think you can get along well with the school";}
        else if(whichresponse==2){
        response="That's really good!";}
        else response= "Cool";
        return response;
        }
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
