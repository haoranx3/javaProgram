public class CaughtSpeeding {
    public CaughtSpeeding() {

    }

    public void result(int speed, boolean isBirthday) {
        if(speed <= 60 && !isBirthday || speed <= 65 && isBirthday) {
            System.out.println(0);
        }
        else if(speed >= 61 && speed <= 80 && !isBirthday || speed >= 66 && speed <= 85 && isBirthday) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        CaughtSpeeding cp = new CaughtSpeeding();
        cp.result(85, false);
    }

}
