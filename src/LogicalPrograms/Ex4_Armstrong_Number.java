package LogicalPrograms;

public class Ex4_Armstrong_Number  //3 Digit= sum of cube of each digit equals to number=Armstrong Number
{
public static void main(String[] args)
{
	int OrgNum=153;      //1+
	int sum=0;        //15>0
	for(int i=OrgNum; i>0; i=i/10)    //153/10=15.3   //15%10=5
	{
		int rem=i%10;         //reminder
	
		sum=sum+(rem*rem*rem);  //3*5*   27+125+1     
	}
	
	if(OrgNum==sum)
	{
		System.out.println("Armstrong Number:"+OrgNum);
	}
	else
	{
		System.out.println("Not Armstrong Number");
		
	}
}
}
