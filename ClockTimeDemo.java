import java.util.Scanner;
public class ClockTimeDemo {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean Number = true;
		
		System.out.println("Convert military time into 12-hour clock time!!");
		
		while(Number)
		{
			try
			{
				System.out.println("Enter the hours on the military clock:");
				int hour = key.nextInt();
				System.out.println("Enter the minutes on the military clock:");
				int minute = key.nextInt();
				System.out.println("Enter the seconds on the military clock:");
				int second = key.nextInt();
				
				TimeConverter c1 = new TimeConverter();
				c1.updateTime(hour, minute, second);
				System.out.print("12-hour clock time ->");
				c1.displayTime();
				
				key.nextLine();
				System.out.println("Enter the hours on the 24-hour clock:");
				int hour2 = key.nextInt();
				System.out.println("Enter the minutes on the 24-hour clock:");
				int minute2 = key.nextInt();
				System.out.println("Enter the seconds on the 24-hour clock:");
				int second2 = key.nextInt();
				
				
				TimeConverter c2 = new TimeConverter();
				c2.updateTime(hour2, minute2, second2);
				System.out.print("12-hour clock time ->");
				c2.displayTime();
				
			} catch (TimeException e)
			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("\nWould you like to do this again? Enter \"Yes\" or \"No\":");
			Number = key.next().equalsIgnoreCase("Yes");
			key.nextLine();
		}
		
		System.out.println("Exiting the programs!");
		key.close();


	}

}
