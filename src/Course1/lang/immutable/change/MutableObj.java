package Course1.lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public int add(int addValue) {
        return value += addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
