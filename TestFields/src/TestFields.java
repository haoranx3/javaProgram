public class TestFields {
    public TestFields() {
        int a = 10;
    }
    public void add() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        TestFields tf = new TestFields(6);
        tf.add(9);
    }
}
