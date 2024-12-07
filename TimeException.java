
public class TimeException extends Exception {
	
	//default constructor
	public TimeException()
	{
		super("EXCEPTION: Invalid time entered");
	}
	
	//parameterized constructor
	public TimeException(String message)
	{
		super(message);
	}

}
