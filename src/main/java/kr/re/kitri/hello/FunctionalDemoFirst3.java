package kr.re.kitri.hello;

public class FunctionalDemoFirst3 {
    public static void main(String[] args) {
        Runnable runnable = () -> { System.out.println("thread run.."); };
        Runnable r2 = () -> System.out.println("thread run");

        Thread t = new Thread(() -> { System.out.println("thread run"); });
        t.start();
        System.out.println("main thread run");
    }
}
