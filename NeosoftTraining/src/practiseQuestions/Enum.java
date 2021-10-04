package practiseQuestions;


import java.util.EnumSet;

public class Enum 
{
	/*enum month{
	January,
	february,march,april,may,june,july,aug,sep,oct,nov,dec
	}
	public static void main(String[] args)
	{
	EnumSet<month> months = EnumSet.allOf(month.class);
	System.out.println(months);  */
	
	enum month{
		Jan,Feb,Mar,Apr,May,June,July,Aug,Sep,Oct,Nov,Dec
		}
		public static void main(String[] args)
		{
		EnumSet<month> months = EnumSet.allOf(month.class);
		System.out.println(months);
		
		
		int month = 6;
		
	    String season;
	 
	    if(month == 3 || month == 4 || month == 5) { 
	      season = "It's a Summer month in India";
	    }else { 
	    	
	      season = "It's not a Summer month in India";
	    } 
	    System.out.println(season);
			
		}
		
	}

