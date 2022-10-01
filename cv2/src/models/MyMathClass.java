package models;

public final class MyMathClass {
    public static final double pi = 3.14; //nemusim mit instanci v Main (final aby to byla konstanta)

    private MyMathClass() {};

    public static int sum(int a, int b) {
        return a+b;
    }

}
