public class Test {
    String name;

   


    public void pupAge (int age) {
        age = age + 7;
        System.out.println("The age of dog is :" + age +
                "The name of the dog is :" + name);
    }

    public static void main (String[] args) {
        Test test = new Test();
        test.name = "Tommy";
        test. pupAge(4);
    }
}

