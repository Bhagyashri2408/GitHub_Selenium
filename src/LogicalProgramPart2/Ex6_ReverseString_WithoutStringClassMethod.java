package LogicalProgramPart2;

public class Ex6_ReverseString_WithoutStringClassMethod 
{
public static void main(String[] args) 
{
	StringBuffer s1=new StringBuffer("abcd");
	System.out.println(s1);
	System.out.println(s1.reverse());
	
	StringBuilder s2=new StringBuilder("XYZ");
	System.out.println(s2);
	System.out.println(s2.reverse());

}
}
