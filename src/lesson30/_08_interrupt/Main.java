package lesson30._08_interrupt;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var tread = new Thread(new MyRunnable());
        tread.start();
        Thread.sleep(5 * 1000);
        tread.interrupt();
    }
}
