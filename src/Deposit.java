
public class Deposit implements Runnable{

  private final Account account;
  
  public Deposit(Account account){
    this.account = account;
  }
  
  @Override
  public void run() {
	  account.deposit(100.0);  
  }

}