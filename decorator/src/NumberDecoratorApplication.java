public class NumberDecoratorApplication {
    public static void main(String[] args) {
        System.out.println(new Decrement(new Decrement(new Zero())));
        System.out.println(new Decrement(new Zero()));
        System.out.println(new Zero());
        System.out.println(new Increment(new Zero()));
        System.out.println(new Increment(new Increment(new Zero())));
    }
}
