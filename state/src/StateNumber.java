public class StateNumber implements Number {
    private NumberState zeroState;
    private NumberState positiveState;
    private NumberState negativeState;
    private NumberState currentState;
    private int magnitude;

    public StateNumber() {
        zeroState = new ZeroState(this);
        positiveState = new PositiveState(this);
        negativeState = new NegativeState(this);
        currentState = zeroState;
    }

    public void increment() {
        currentState.increment();
    }

    public void multiply(int n) {
        currentState.multiply(n);
    }

    public int getValue() {
        return currentState.getValue();
    }

    int getMagnitude() {
        return magnitude;
    }

    void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    void setCurrentState(NumberState currentState) {
        this.currentState = currentState;
    }

    NumberState getZeroState() {
        return zeroState;
    }

    NumberState getPositiveState() {
        return positiveState;
    }

    NumberState getNegativeState() {
        return negativeState;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
