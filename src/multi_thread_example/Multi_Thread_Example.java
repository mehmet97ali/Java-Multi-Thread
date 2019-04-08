
package multi_thread_example;


public class Multi_Thread_Example {

   
    public static void main(String[] args) {
       
        Thread thread1 = new Thread(new mythread("thread 1"));
        Thread thread2 = new Thread(new mythread("thread 2"));
        Thread thread3 = new Thread(new mythread("thread 3"));
        Thread thread4 = new Thread(new mythread("thread 4"));
        Thread thread5 = new Thread(new mythread("thread 5"));
        Thread thread6 = new Thread(new mythread("thread 6"));
        
        thread4.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        
    }
    
}
