public class In1To10 {
    public void in1to10(int n, boolean outsideMode) {
        if (outsideMode) {
            if(n <= 1 || n >= 10) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            if (n >= 1 && n <= 10) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
    public static void main(String[] args) {
        In1To10 i = new In1To10();
        i.in1to10(20, false);
    }
}
