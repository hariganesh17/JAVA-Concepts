package OopConcepts;

abstract class MobileBanks {
	abstract void checkBalance();
	abstract void transferMoney();
	abstract void transferMoney(double amount,String recepient);

	void login(){
		System.out.println("logged in successfully");
	}
}
class Hdfc extends MobileBanks {
	double balance = 25000;

	@Override
	void checkBalance() {
		System.out.println("current balance is - "+balance);
	}

	@Override
	void transferMoney() {
		System.out.println("Transferred money from hdfc account");
	}

	@Override
	void transferMoney(double amount,String recepient) {
			if(amount > 0 && amount <= balance){
				balance -= amount;
				System.out.println("transferred "+ amount+ " to "+ recepient);
			}
	}
}
public class Polymorphism{
	public static void main(String[] args){
		MobileBanks myBank = new Hdfc();
		myBank.login();
		myBank.checkBalance();
		myBank.transferMoney();
		myBank.transferMoney(2300,"hari");
		myBank.checkBalance();
	}
}