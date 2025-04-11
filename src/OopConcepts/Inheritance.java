package OopConcepts;

abstract class Banks{
	abstract void checkBalance();
	abstract void transferMoney(double money, String recepient);

	void login(){
		System.out.println("user logged in successfully");
	}
	void logOut(){
		System.out.println("user logged out successfully");
	}
}
class IndianBank extends Banks{
	double balance = 10000;
	@Override
	void checkBalance() {
		System.out.println("Current Balance: "+balance);
	}

	@Override
	void transferMoney(double money, String recepient) {
		if(money > 0 && money <= balance){
			balance -= money;
			System.out.println("Transferred "+ money + " to "+ recepient);
		}else{
			System.out.println("Insuffient balance");
		}
	}
}
public class Inheritance{
	public static void main(String[] args){
		Banks myBank = new IndianBank();
		myBank.login();
		myBank.checkBalance();
		myBank.transferMoney(2500,"Hari");
		myBank.checkBalance();
		myBank.logOut();
	}
}