package kr.re.kitri.hello;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("my thread run..");
    }
}
