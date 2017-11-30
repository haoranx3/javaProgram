public class Test2 extends Test1 {
    public Test2(int number1, int number2) {
        super(number1, number2);
    }
    public void add() {
        super.plus();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2(2, 4);
        test2.add();
    }
}


