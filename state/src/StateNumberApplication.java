public class StateNumberApplication {

    public static void main(String[] args) {
        Number number = new StateNumber();
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.multiply(2);
        System.out.println(number);
        number.multiply(-1);
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.increment();
        System.out.println(number);
        number.increment();
        System.out.println(number);
    }
}
