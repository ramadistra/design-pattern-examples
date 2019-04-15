public class Decrement implements Number {
    private Number number;

    public Decrement(Number number) {
        this.number = number;
    }

    @Override
    public int getValue() {
        return number.getValue() - 1;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
