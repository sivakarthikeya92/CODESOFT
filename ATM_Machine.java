import java.util.Scanner;

class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful...Availabe Balance : " + balance);
		} else {
			System.out.println("Transaction Failed due to Insufficient Balance or Invalid Amount");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful...Available Balance : "+balance);
		} else {
			System.out.println("Transaction Failed due to Invalid Amount");
		}
	}
}

class ATM {
	private BankAccount account;

	public ATM(BankAccount account) {
		this.account = account;
	}

	public void checkBalance() {
		System.out.println("Your Account Balance is : " + account.getBalance());
	}

	public void deposit(double amount) {
		account.deposit(amount);
	}

	public void withdraw(double amount) {
		account.withdraw(amount);
	}
}

public class ATM_Machine {
	public static void main(String[] args) throws Exception{
		try {
		System.out.println("Welcome to ATM");
		BankAccount Account = new BankAccount(500);
		ATM atm = new ATM(Account);

		Scanner sc = new Scanner(System.in);
		boolean Transaction = true;

		while (Transaction) {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				atm.checkBalance();
				break;
			case 2:
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				atm.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter withdrawal amount: ");
				double withdrawalAmount = sc.nextDouble();
				atm.withdraw(withdrawalAmount);
				break;
			case 4:
				Transaction = false;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		
		System.out.println("Thankyou for using the ATM!");
		sc.close();
	}catch(java.util.InputMismatchException e){
		System.out.println("Transaction Failed due to Invalid Input");
	}
	}
}
