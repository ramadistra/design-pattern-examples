public class ZeroState implements NumberState {
    private StateNumber stateNumber;

    public ZeroState(StateNumber stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void increment() {
        stateNumber.setMagnitude(1);
        stateNumber.setCurrentState(stateNumber.getPositiveState());
    }

    @Override
    public void multiply(int n) {}
}
