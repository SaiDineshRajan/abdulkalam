
public class RunnerBank {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.deposit("1000$");
		ba.withdrawl("500$");
		ba.display();
		CheckAccount ca=new CheckAccount();
		ca.processcheck("100$");
		ca.withdrawl("200$");
		ca.display();
		
	}

}
