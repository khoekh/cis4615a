/* Rule 10: LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects
  Desc. synchronizes on the intrinsic lock of an instance of ReentrantLock rather than on the reentrant
  mutual exclusion Lock encapsulated by ReentrantLock .
  Version: Noncompliant
*/

private final Lock lock = new ReentrantLock();

public void doSomething() {
  synchronized(lock) {
    // ...
  }
}
