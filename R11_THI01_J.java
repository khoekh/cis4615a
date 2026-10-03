/* Rule 11: THI01-J. Do not invoke ThreadGroup methods
Desc. The convenience methods of the ThreadGroup class can
be used to operate on all threads belonging to a thread group at once. 
Version: Compliant
*/

public final class NetworkHandler {
  private final ExecutorService executor;

  NetworkHandler(int poolSize) {
    this.executor = Executors.newFixedThreadPool(poolSize);
  }

  public void startThreads() {
    for (int i = 0; i < 3; i++) {
      executor.execute(new HandleRequest());
    }
  }

  public void shutdownPool() {
    executor.shutdown();
  }

  public static void main(String[] args)  {
    NetworkHandler nh = new NetworkHandler(3);
    nh.startThreads();
    nh.shutdownPool();
  }
}
