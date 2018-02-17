
public class Account {

  private double balance;
  private double limit;
  private int agency;
  private int number;
  //private Client owner;
  //...
  
  public Account(double balance){
    this.balance = balance;
  }
  
  public void withdraw(double value){
    this.balance -= value;
  }
  
  public void deposit(double value){
    //The running thread locks its object, preventing another process from executing and interfering with the final value
    synchronized(this){
      this.balance += value;      
    }
  }
  
  /**OR :
   * 
   * public synchronized deposit(double value){
   *  this.balance += value;
   * }
   * 
   */
  
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public double getLimit() {
    return limit;
  }
  
  public void setLimit(double limit) {
    this.limit = limit;
  }
  
  public int getAgency() {
    return agency;
  }
  
  public void setAgency(int agency) {
    this.agency = agency;
  }
  
  public int getNumber() {
    return number;
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
  
}