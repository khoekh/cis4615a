/* Rule 09: VNA00-J. Ensure visibility when accessing shared primitive variables
Desc. Declaring a variable volatile or correctly synchronizing the code guarantees
that 64-bit primitive long and double variables are accessed atomically
Version: Noncompliant
*/

final class ControlledStop implements Runnable {
  private boolean done = false;
 
  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) { 
        Thread.currentThread().interrupt(); // Reset interrupted status
      } 
    }    
  }

  public void shutdown() {
    done = true;
  }
}
