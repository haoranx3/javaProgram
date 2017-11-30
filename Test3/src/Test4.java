public class Test4 extends Test3 {
    public Test4 (int x) {
        super(x+1);
    }
    public int getNumber() {
        return super.getNumber()+1;
    }
    public String getLetters() {
        return "AB";
    }

    public static void main (String[] args) {
        Test4 test = new Test4(0);
        System.out.println(test.getMessage());
        System.out.println(test.getLetters());
    }
}
