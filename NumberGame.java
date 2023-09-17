package Demo;

import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		NumberGame g=new NumberGame();
		g.game();
		
		System.out.println();
		System.out.println("Enter 0 To Try Again");
		System.out.print("Enter = ");
		
		for(;;)
		{
			switch(sc.nextInt())
			{
			case 0:g.game();
			}
		}
	}
		public void game()
		{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int num=r.nextInt(100);
		
		int i=0,k=5,guess=0;
		int count=0;
		for( i=0;i<=k;i++)
		{
			System.out.println("Guess The Number : ");
			 guess=sc.nextInt();
			
			
				if(num==guess)
				{
					System.out.println("Congratulations Your Guessing Number Is Correct. ");
					break;
				}
				
				else if(num > guess && i!=k-1 )
				{
					System.out.println("The number is too high than " + guess);
				}
			
				else if(num<guess &&  i!=k-1)
				{
					System.out.println("The number is too low than " + guess);		
				}
				
				if (i == k) 
				{
					System.out.println("You have exhausted in "+ k+1 +" trials.");
					System.out.println("The number was : " + num);
		        }
				count++;
		}
		
		switch(count)
		{
		case 1: System.out.println("Your score of find number is 100%");break;
		case 2: System.out.println("Your score of find number is 80%");break;
		case 3: System.out.println("Your score of find number is 60%");break;
		case 4: System.out.println("Your score of find number is 40%");break;
		case 5: System.out.println("Your score of find number is 20%");break;
		case 6: System.out.println("Your score of find number is 0%");break;
		}
	}
}