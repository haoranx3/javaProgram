public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minuates;
    private Sting displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(12);
        minuates = new NumberDisplay(60);
        updateDisplay();
    }
    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(12);
        minuates = new NumberDisplay(60);
        setTime(hour, minute);
    }
    public void timeTick() {
        minuates.increment();
        if (minuates.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }
    public setTime(int hour, int minute) {
        hours.setValue(hour);
        minuates.setValue(minute);
        updateDisplay();
    }
    public String getTime() {
        return displayString
    }
    public void updateDisplay() {
        displayString = hours.getDisplay() + ":" + minuates.getDisplay();
    }
    public static void main(String[] args) {
        ClockDisplay cd = new ClockDisplay(6, 45);
        cd.getTime()
    }
}