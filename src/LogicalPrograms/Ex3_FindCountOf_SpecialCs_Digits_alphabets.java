package LogicalPrograms;

public class Ex3_FindCountOf_SpecialCs_Digits_alphabets
{
public static void main(String[] args) 
{
	String s1="abcd4567xyz #";
	int specialcharcount=0;
	int alphabetscount=0;
	int spacecount=0;
	int digitcount=0;
	for(int i=0; i<=s1.length()-1; i++)
	{
		char s2=s1.charAt(i);
		
		if(Character.isDigit(s2))
		{
			digitcount++;
		}
		else if(Character.isWhitespace(s2))
		{
			spacecount++;
		}
		else if(Character.isLetter(s2))
		{
			alphabetscount++;
		}
		else
		{
			specialcharcount++;
		}
		
	}
	System.out.println(digitcount);
	System.out.println(spacecount);
	System.out.println(specialcharcount);
	System.out.println(alphabetscount);

}
}
