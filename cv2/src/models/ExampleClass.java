package models;

public class ExampleClass {

    public int publicNumber = 11;
    protected int protectedNumber = 15;
    private int privateNumber = 12;

    public void publicMethod() {
        protectedMethod();
        privateMethod();

        System.out.println(privateNumber);
        System.out.println(protectedNumber);
    }

    protected void protectedMethod() {

    }

    private void privateMethod() {

    }

}
