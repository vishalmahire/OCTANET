package ATMmachine;
/* import scanner class*/
import java.util.Scanner;

/*declare variables*/
public class ATM {
	float Balance;
	int PIN = 1874;
	
	/*condition */
	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin ==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
		}
	}
	
	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
/*statements*/
		if(opt==1)
		{
			checkBalance();
		}
		else if(opt==2)
		{
			withdrawMoney();
		}
		else if(opt==3)
		{
			depositMoney();
		}
		else if(opt==4)
		{
			break;
		}
		else 
		{
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: "+ Balance);
		menu();
	}
	
	
	public void withdrawMoney() 
	{
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
	}
		else 
		{
			Balance = Balance - amount;
			System.out.println("Money Withdraw Successful");
		}
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		float amout = sc.nextFloat();
		Balance = Balance + amout;
		System.out.println("Money Deposited Successfully");
	}
		
	public static void main(String[] args) {
			/*create object class*/
			ATM obj = new ATM();
			obj.checkpin();
	}
}
		



