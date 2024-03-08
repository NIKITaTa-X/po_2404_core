package lesson30._02_creation;

public class MyTread extends Thread{
    public MyTread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Execution in" + Thread.currentThread());
        System.out.println("Hello from Thread");
    }

}
