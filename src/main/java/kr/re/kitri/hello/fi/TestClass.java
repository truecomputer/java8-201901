package kr.re.kitri.hello.fi;

public class TestClass implements MyInterface {

    @Override
    public void sort() {
        System.out.println("sorted..");
    }

    public static void main(String[] args) {
        MyInterface.sampleStatic();
    }
}

