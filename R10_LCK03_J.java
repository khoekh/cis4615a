/* Rule 10: LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects
  Desc. Lock and unlock
  Version: Compliant
*/

private final Lock lock = new ReentrantLock();

public void doSomething() {
  lock.lock();
  try {
    // ...
  } finally {
    lock.unlock();
  }
}
