public class Increment implements Number {
    private Number number;

    public Increment(Number number) {
        this.number = number;
    }

    @Override
    public int getValue() {
        return number.getValue() + 1;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
