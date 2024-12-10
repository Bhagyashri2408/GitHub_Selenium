package LogicalProgramPart2;

public class Ex4_SeparateNumbersFromString 
{
public static void main(String[] args)
{
	String s1="abc3456";
	String s2=s1.substring(3);
	int n1=Integer.parseInt(s2);
	System.out.println(n1);
}
}
