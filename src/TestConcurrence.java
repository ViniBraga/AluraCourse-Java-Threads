
public class TestConcurrence {

  public static void main(String[] args) throws InterruptedException {
    
	/*
    ProgressBar bar = new ProgressBar();
    Thread t1 = new Thread(bar);
    t1.start();
    
    FileCopier copier = new FileCopier();
    Thread t2 = new Thread(copier);
    t2.start();
    */
    
    //--Semaphore example------------
    Account a1 = new Account(500.0);
    Deposit action = new Deposit(a1);
    Thread thread1 = new Thread(action);
    Thread thread2 = new Thread(action);
    
    thread1.start();
    thread2.start();
    
    thread1.join();
    thread2.join();
    
    System.out.println(a1.getBalance());
    
  }

}