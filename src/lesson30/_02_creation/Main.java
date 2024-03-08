package lesson30._02_creation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating the new Thread From " + Thread.currentThread());
        var myThread = new MyTread("My thread");
        myThread.start();
        myThread.join();
        System.out.println("Leaving  from " + Thread.currentThread());

        System.out.println("");
        System.out.println("Creating the new Thread From " + Thread.currentThread());
        var myRunnable = new Thread(new MyRunnable(), "My Runnable");
        myRunnable.start();
        myRunnable.join();
        System.out.println("Leaving  from " + Thread.currentThread());
    }
}
