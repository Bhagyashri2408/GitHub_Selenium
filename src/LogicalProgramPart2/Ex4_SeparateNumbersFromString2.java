package LogicalProgramPart2;

public class Ex4_SeparateNumbersFromString2 
{
public static void main(String[] args)
{
	String s1="ab1234cd5xyz";
	String s2="";
	
	for (int i=0;i<=s1.length()-1; i++)
	{
		char charvalue=s1.charAt(i);
		if(Character.isDigit(charvalue))
		{
			s2=s2+charvalue;
		}

	}
	System.out.println(s2);
	
	int n1=Integer.parseInt(s2);
	//System.out.println(n1+6);
}
}
