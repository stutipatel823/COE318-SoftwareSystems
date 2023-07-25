public class Counter {
    private int value = 0;

    public void increment() {
        value += 1;
    }

    public void decrement() {
        if (value > 0) {
            value -= 1;
        }
    }

    public void setValue(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }
}
/*
 * The Counter Class performs incrementing and decrementing actions to the value
 * that a counter object is given.
 * For example, If counter object c1 has a value of 10, and if c1.increment();
 * is called, then the value 10 will increase by 1.
 * Same goes for the decrement method. When c1.decrement() is called, the value
 * decreases by 1.
 */
