public class AlarmClock {
    public AlarmClock() {

    }
    public void alarmClock(int day, boolean vacation) {
        if (day == 0 || day == 6) {
            if (vacation) {
                System.out.println("off");
            }
            else {
                System.out.println("10:00");
            }
        }
        else {
            if (vacation) {
                System.out.println("10:00");
            }
            else {
                System.out.println("7:00");
            }
        }
    }

    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock();
        ac.alarmClock(0, true);
    }
}
