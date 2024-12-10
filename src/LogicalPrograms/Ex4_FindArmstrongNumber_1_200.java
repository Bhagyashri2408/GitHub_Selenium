package LogicalPrograms;

public class Ex4_FindArmstrongNumber_1_200 
{
public static void main(String[] args) 
{
	for(int i=100;i<=200;i++)
	{
		FindArmStrongNumer(i);
	}
	
}
public static void FindArmStrongNumer(int OrgNum)
{
	int sum=0;
	for(int i=OrgNum; i>0; i=i/10)
	{
		int rem=i%10;
		sum = sum+(rem*rem*rem);
	}
	if(OrgNum==sum)
	{
		System.out.println("ArmStrong Number"+" "+ OrgNum);
	}
	
}

}
