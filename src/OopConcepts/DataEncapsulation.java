package OopConcepts;

abstract class Banking{
	private double balance;

	Banking(double initialBalance){
		this.balance = initialBalance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	abstract void checkBalance();
	abstract void transferMoney(double amount, String recepient);

	void login(){
		System.out.println("User login sucessfull");
	}
}
class RuralBank extends Banking{

	RuralBank(double initialBalance){
		super(initialBalance);
	}

	@Override
	void checkBalance() {
		System.out.println("current balance " + getBalance());
	}

	@Override
	void transferMoney(double amount, String recepient) {
		if(amount > 0 && amount <= getBalance()){
			setBalance(getBalance() - amount);
			System.out.println("transferred "+ amount+" to " + recepient);
		}else{
			System.out.println("Insuffient balance");
		}
	}
}
public class DataEncapsulation{
	public static void main(String[] args){
		Banking myBank = new RuralBank(100000);
		myBank.login();
		myBank.checkBalance();
		myBank.transferMoney(20000,"Hari");
		myBank.checkBalance();
	}
}