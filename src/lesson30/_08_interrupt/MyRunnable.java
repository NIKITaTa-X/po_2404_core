package lesson30._08_interrupt;

import lesson30._02_creation.MyTread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                try {
                    Thread.sleep(1 * 1000);
                    System.out.println("Running");
                } catch (InterruptedException e) {
                    return;
                }
            } else {
                return;
            }
        } while (true);
    }
}
