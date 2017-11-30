public class TestString {
    public void test() {
        System.out.println("cats" + 9 + 3);
        System.out.println((9 + 3 + "cats").getClass().getName());
    }

    public static void main(String[] args) {
        TestString t = new TestString();
        t.test();
    }
}
