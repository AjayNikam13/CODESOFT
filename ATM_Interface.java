package ATM_Interface;

public class ATM_Interface 
{
	double bal;
	int pin;
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) 
	{
		this.pin = pin;
	}

	public ATM_Interface(double bal, int pin) 
	{
		this.bal = bal;
		this.pin = pin;
	}
	
	
	
	
	
	
}
