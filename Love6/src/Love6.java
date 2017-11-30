public class Love6 {
    public void love6(int a, int b) {
        if (a != 6 && b != 6 && Math.abs(a - b) != 6 && a + b != 6) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
    public static void main(String[] args) {
        Love6 l6 = new Love6();
        l6.love6(7, 1);
    }
}
