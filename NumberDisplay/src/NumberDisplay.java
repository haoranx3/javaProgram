public class NumberDisplay {
    private int currentValues;
    private int limits;
    public NumberDisplay(int rollOverLimit) {
        limits = rollOverLimit;
        currentValues = 0;
    }

    public int getValue() {
        return currentValues;
    }
    public String getDisplay() {
        if (currentValues < 10) {
            return "0" + currentValues;
        }
        else {
            return "" + currentValues;
        }
    }
    public void setValue(int replacement) {
        if (replacement >= 0 && replacement < limits) {
            currentValues = replacement;
        }
    }
    public void increment() {
        currentValues = (currentValues + 1) % limits;
    }

}



