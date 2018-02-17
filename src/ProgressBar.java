
public class ProgressBar implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 10000; i++){
      System.out.println("Progress bar...");
    }
  }

}