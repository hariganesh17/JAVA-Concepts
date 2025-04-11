package OopConcepts;

abstract class MobileBanking{
	private double balance;

	MobileBanking(double initialBalance){
		this.balance = initialBalance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getBalance(){
		return balance;
	}

	abstract void checkBalance();
	abstract void transferMoney(double amount,String recepient);

	void login(){
		System.out.println("User login success");
	}
}
class stateBank extends MobileBanking{


	stateBank(double initialBalance) {
		super(initialBalance);
	}

	@Override
	void checkBalance() {
		System.out.println("current balance:"+getBalance());
	}

	@Override
	void transferMoney(double amount, String recepient) {
		if(amount > 0 && amount <= getBalance()){
			double updatedBalance = getBalance() - amount;
			setBalance(updatedBalance);
			System.out.println("transfered "+amount+" to "+recepient);
		}else{
			System.out.println("Insuffient balance");
		}
	}
}
public class Abstraction {
	public static void main(String[] args){
		MobileBanking myBank = new stateBank(100000);
		myBank.login();
		myBank.checkBalance();
		myBank.transferMoney(90000,"hari");
		myBank.checkBalance();
	}
}