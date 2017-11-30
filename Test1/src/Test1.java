public class Test1 {
    int a;
    int b;
   public Test1(int number1, int number2) {
      a = number1;
      b = number2;
   }
   public void plus() {
       System.out.println(a + b);
   }
  public static void main(String[] args) {
       Test1 test1 = new Test1(3, 5);
       test1.plus();
  }

}

