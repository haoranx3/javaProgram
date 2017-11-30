public class FibonacciSequence {
    public int fibonacci(int term) {
        if (term < 0) {
            return Integer.MIN_VALUE;
        }
        if (term == 1) {
            return 0;
        }
        if (term == 2) {
            return 1;
        }
        int termA = 0;
        int termB = 1;
        int termC = 0;
        for(int i = 1; i <= term-2; i++) {
            termA = termB + termC;
            termC = termB;
            termB = termA;
        }
        return termA;
    }
    public static void main(String[] args) {
        FibonacciSequence a = new FibonacciSequence();
        System.out.println(a.fibonacci(8));

    }
}
