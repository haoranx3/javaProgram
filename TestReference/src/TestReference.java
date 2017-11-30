public class TestReference {
    private int xcoor;
    private int ycoor;
    public TestReference(int a, int b) {
        xcoor = a;
        ycoor = b;
    }
    public String toString() {
        return "X" + xcoor + "Y" + ycoor;
    }
    public static void main(String[] args) {
        TestReference a = new TestReference(3,0);
        TestReference b = a;
        b = new TestReference(3, 1);
        System.out.println(b);
        System.out.print(a);
    }
}
