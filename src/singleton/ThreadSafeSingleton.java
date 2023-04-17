package singleton;

// In this example, we have added the volatile keyword to the instance variable to ensure that changes made to it by one
// thread are visible to all other threads. We have also used double-checked locking to minimize the performance impact of
// synchronizing the getInstance() method.The getInstance() method first checks if the instance is null. If it is, it enters
// a synchronized block to prevent multiple threads from creating new instances of the class simultaneously.
// Inside the synchronized block, it checks again if the instance is null. If it is, it creates a new instance of the class.
// By using double-checked locking and the volatile keyword, we ensure that the Singleton class is thread-safe and that only one instance of the class is created, even if multiple threads try to access it simultaneously.

public class ThreadSafeSingleton {

  private static volatile ThreadSafeSingleton instance;

  private ThreadSafeSingleton() { }

  public static ThreadSafeSingleton getInstance() {
    if(instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if(instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
