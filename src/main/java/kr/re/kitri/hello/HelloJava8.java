package kr.re.kitri.hello;

public class HelloJava8 {

    //psvm
    public static void main(String[] args) {
        //sout
        // System.out.println("Hello wordl!");

        Thread t1 = new Thread(new MyThread2());
        t1.start();
        System.out.println("main thread run..");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("my thread2 running..");
    }
}