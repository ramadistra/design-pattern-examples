public class Zero implements Number {
    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
