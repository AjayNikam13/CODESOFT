package Demo;

import java.util.Scanner;

public class StudenGradeCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Subjects :");
		int sub=sc.nextInt();
		int totalMarks=0;
		System.out.println("Enter Marks Of Each Subjects : ");
		for(int i=0;i<sub;i++)
		{
			totalMarks =totalMarks+sc.nextInt();
		}
		System.out.println("Your Total Marks is : "+totalMarks);
		
		int avgPer=totalMarks/sub;
		
		System.out.println("Your Percentage is : "+avgPer+"%");
		
		int grd = avgPer/10;
		
		switch(grd)
		{
		case 9: System.out.println("Your Grade is : A+");break;
		case 8: System.out.println("Your Grade is : A");break;
		case 7: System.out.println("Your Grade is : B");break;
		case 6: System.out.println("Your Grade is : B");break;
		case 5: System.out.println("Your Grade is : C");break;
		default : System.out.println("Your Grade is : D");
		}
	}
}
