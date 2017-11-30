public class TestPolymorphism {
    private int x;
    public TestPolymorphism(int n) {
        x = n;
    }
    public TestPolymorphism() {
        x = 1;
    }
    public int increseX(int i) {
        x = x + i;
        return 7;
    }
    public static void main(String[] args) {
        TestPolymorphism a = new Test(3);
        System.out.println(a.increseX(1));
    }
}
