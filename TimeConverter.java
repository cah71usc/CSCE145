
public class TimeConverter {
	//Instant Variables
	private int hours;
	private int minutes;
	private int seconds;
	//checks whether its true for AM and false for PM
	private boolean notPM; 
	//Default Constructor
	public TimeConverter()
	{
	this.hours = 0;
	this.minutes = 0;
	this.seconds = 0;
	this.notPM = true;
		
	}
	//Parameterized Constructor
	public TimeConverter(int Hours, int Minutes, int Seconds) throws Exception
	{
		this.setHours(Hours);
		this.setMinutes(Minutes);
		this.setSeconds(Seconds);
		this.updatePeriod(Hours);
		
		
	}
	//Accessors
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public int getSeconds()
	{
		return this.seconds;
	}
	public boolean getNotPM()
	{
		return this.notPM;
	}
	//Mutators
	public void setHours(int Hours) throws TimeException
	{
		if(Hours < 0 && Hours > 23) throw new TimeException ("Invalid hour value!");

			this.hours = Hours;
			updatePeriod(Hours);
	
	}
	
	public void setMinutes(int Minutes) throws TimeException
	{
		if(Minutes < 0 && Minutes > 59) throw new TimeException ("Invalid minte value!");
		
			this.minutes = Minutes;
	
	}
	
	public void setSeconds(int Seconds) throws TimeException
	{
		if (Seconds < 0 && Seconds > 59) throw new TimeException ("Invalid second value!");
		
			this.seconds = Seconds;
		
	}
	
	private void updatePeriod(int Hour)
	{
		notPM = Hour < 12;
	}
	
	public void updateTime(int Hours, int Minutes, int Seconds) throws TimeException
	{
		this.setHours(Hours);
		this.setMinutes(Minutes);
		this.setSeconds(Seconds);
		
		//12-hour convertion
		if (this.hours == 0)
		{
			this.hours = 12;
			
			this.notPM = true;
		} else if (this.hours > 12)
		{
			this.hours -= 12;
			this.notPM = false;
		} else if (this.hours == 12)
		{
			this.notPM = false;
		}
	}
	
	//Overload for updateTime
	public void updateTime(String time) throws TimeException
	{
		try
		{
			String[] parts = time.split(":");
			if(parts.length != 3) throw new TimeException ("Invalid time format!");
			
			int h = Integer.parseInt(parts[0]);
			int m = Integer.parseInt(parts[1]);
			int s = Integer.parseInt(parts[2]);
			
			updateTime(h, m, s);
		}catch (NumberFormatException e)
		{
			throw new TimeException("Invalid numeric value in the time input");
		}
	}
	
	//displayTime
	public void displayTime()
	{
		String period = notPM ? "AM" : "PM";
		System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, period);
	}
	
}

