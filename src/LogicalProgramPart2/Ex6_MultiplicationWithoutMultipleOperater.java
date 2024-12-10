package LogicalProgramPart2;

public class Ex6_MultiplicationWithoutMultipleOperater 
{
public static void main(String[] args) 
{
	int num1=2;
	int num2=3;
	int sum=0;
	
	for(int i=1;i<=num1; i++)
	{
		sum=sum+num2;           // 0+3=3; 6
	}
	System.out.println(sum);
}
}
