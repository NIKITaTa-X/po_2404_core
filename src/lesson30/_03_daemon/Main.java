package lesson30._03_daemon;

public class Main {
    public static void main(String[] args) {
        var daemon = new DaemonThread();
        daemon.setDaemon(true);
        daemon.start();
        daemon.run();
        System.out.println("last code string");
    }
}
