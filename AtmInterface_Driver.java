package ATM_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bank
{
		List a =new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		public void creatAccount()
		{
			System.out.println("Enter Account Balance");
			double bal=sc.nextDouble();
			System.out.println("Enter Pin");
			int pin=sc.nextInt();
			ATM_Interface ac=new ATM_Interface(bal,pin);
			a.add(ac);
			System.out.println("Pin Generate Succesfully");
		}
		
		public void withdraw()
		{
			if(a!=null)
			{
				System.out.println("Enter Pin");
				int pin=sc.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					ATM_Interface at=(ATM_Interface)a.get(i);
					
					if(pin == at.pin)
					{
						System.out.println("Enter Ammount");
						double newBal=sc.nextDouble();
							if(newBal>2000)
							{
							at.bal=at.bal-newBal;
							System.out.println("Transcation Succesful");
							}
							else
							{
								System.out.println("Sorry, Enter Ammount More Than 2000");
							}
					}
					else
					{
						System.out.println("Incorrect Pin");
					}
				}
			}
			else
			{
				System.out.println("Add Balance First");
			}
		}
		
		
		public void deposite()
		{
			if(a!=null)
			{
				System.out.println("Enter Pin");
				int pin=sc.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					ATM_Interface at=(ATM_Interface)a.get(i);
					
					if(pin == at.pin)
					{
						System.out.println("Enter Ammount");
						double newBal=sc.nextDouble();
						at.bal=at.bal+newBal;
						
						System.out.println("Transcation Succesful");
					}
					else
					{
						System.out.println("Incorrect Pin");
					}
				}
			}
			else
			{
				System.out.println("Add Balance First");
			}
		}
		
		public void checkBal()
		{
			if(a!=null)
			{
				System.out.println("Enter Pin");
				int pin=sc.nextInt();
				
				for(int i=0;i<a.size();i++)
				{
					ATM_Interface at=(ATM_Interface)a.get(i);
					
					if(pin == at.pin)
					{
						System.out.println("Available Balance is : "+ at.bal);
					}
					else
					{
						System.out.println("Incorrect Pin");
					}
				}
			}
			else
			{
				System.out.println("Add Balance First");
			}
		}	
}









public class AtmInterface_Driver
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		
		for(;;)
		{
			System.out.println("1.Pin Generate and Add Saving 2.Withdraw Amount 3.Deposite Amount 4.Check Balance 5.Exit");
		
			switch(b.sc.nextInt())
			{
			case 1:b.creatAccount();break;
			case 2:b.withdraw();break;
			case 3:b.deposite();;break;
			case 4:b.checkBal();;break;
			case 5:System.exit(0);
			}
		}
	}
}
