public class GreenTicket {
    public void greenTicket(int a, int b, int c) {
        if (a == b && b == c ) {
            System.out.println(20);
        }
        else if(a != b && b != c && a != c) {
            System.out.println(0);
        }
        else {
            System.out.println(10);
        }
    }
    public static void main(String[] args) {
        GreenTicket gt = new GreenTicket();
        gt.greenTicket(2, 0, 0);
    }
}
