import java.util.concurrent.Callable;

public class CigarParty {
    public void cigarParty(int cigar, boolean isWeekend) {
        if(isWeekend) {
            if (cigar >= 40) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            if (cigar >= 40 && cigar <= 60) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }

    public static void main(String[] args) {
        CigarParty cp = new CigarParty();
        cp.cigarParty(30, false);
    }


}
