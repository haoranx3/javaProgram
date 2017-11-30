public class Test3 {
    private int myNum;

    public Test3 (int x) {
        myNum = x;
    }

    public int getNumber() {
        return myNum;
    }
    public String getLetters() {
        return "A";
    }
    public String getMessage() {
        return this.getLetters() + "-" + this.getNumber();
    }

}


