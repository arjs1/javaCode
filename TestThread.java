public class TestThread {
    public static void main(String[] args) throws  InterruptedException {
        CustomThread t1 = new CustomThread("Thread 1");
        CustomThread t2 = new CustomThread("Thread 2");
        CustomThread t3 = new CustomThread("Thread 3");
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Main thread exiting");

    }
}
