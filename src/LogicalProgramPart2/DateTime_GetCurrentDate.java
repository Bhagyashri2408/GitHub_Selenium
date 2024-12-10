package LogicalProgramPart2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTime_GetCurrentDate 
{
public static void main(String[] args) 
{
	//System.out.println(LocalDate.now());
	
	SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date date=new Date();    //inbuild class date
	
	System.out.println(dateFormat.format(date));
}
}
