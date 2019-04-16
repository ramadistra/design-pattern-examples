public class PositiveState implements NumberState {
    private StateNumber stateNumber;

    public PositiveState(StateNumber stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public int getValue() {
        return stateNumber.getMagnitude();
    }

    @Override
    public void increment() {
        stateNumber.setMagnitude(stateNumber.getMagnitude() + 1);
    }

    @Override
    public void multiply(int n) {
        if (n == 0) {
            stateNumber.setCurrentState(stateNumber.getZeroState());
        } else if (n > 0) {
            stateNumber.setMagnitude(stateNumber.getMagnitude() * n);
        } else {
            stateNumber.setMagnitude(Math.abs(stateNumber.getMagnitude() * n));
            stateNumber.setCurrentState(stateNumber.getNegativeState());
        }
    }
}
