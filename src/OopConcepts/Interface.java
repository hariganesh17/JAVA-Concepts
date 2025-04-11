package OopConcepts;

interface MobileBankingApps{
    void checkBalance();
    void transferMoney(double amount,String recepient);

    default void login(){
        System.out.println("User login Success");
    }
}
interface LoanProcessing{
    void applyLoan(double amount);
}
class Kotak implements MobileBankingApps , LoanProcessing{

    double balance = 100000;
    @Override
    public void checkBalance() {
        System.out.println("current balance:"+balance);
    }

    @Override
    public void transferMoney(double amount, String recepient) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Transferred "+amount + " to " + recepient);
        }else{
            System.out.println("Insuffient balance");
        }
    }

    @Override
    public void applyLoan(double amount) {
        System.out.println("Kotak bank loan of "+ amount + " applied successfully");
    }
}
public class Interface{
    public static void main(String[] args){
        Kotak myBank = new Kotak();
        myBank.login();
        myBank.checkBalance();
        myBank.transferMoney(15000,"Hari");
        myBank.checkBalance();

        myBank.applyLoan(50000);
    }
}