package LogicalPrograms;

public class Ex2_RemoveDigitsFromString 
{
public static void main(String[] args) 
{
	String str="abcd45678bgh";
	String str1="";
	
	for(int i=0; i<=str.length()-1;i++)
	{
		char s1=str.charAt(i);
		//System.out.println(s1);
		if(!Character.isDigit(s1))
		{
			str1=str1+s1;
		}
	}
	System.out.println(str1);
}
}
