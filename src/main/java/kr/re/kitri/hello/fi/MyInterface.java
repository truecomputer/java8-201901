package kr.re.kitri.hello.fi;

public interface MyInterface {
    void sort();

    // interface에도 메서드를 구현할 수 있다.
    default void invert() {
        System.out.println("inverted");
    }

    static void sampleStatic() {
        System.out.println("static method..");
    }
}
