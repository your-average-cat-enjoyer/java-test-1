public class HelloWorld {
    interface IntFunction {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        IntFunction AddFunc = (n,a) -> n - a;
    }
}
