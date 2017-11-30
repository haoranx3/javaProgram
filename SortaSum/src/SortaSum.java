public class SortaSum {
    public void sortasum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            System.out.println(20);
        }
        else {
            System.out.println(a + b);
        }
    }
    public static void main(String[] args) {
        SortaSum ss = new SortaSum();
        ss.sortasum(10, 11);
    }
}
