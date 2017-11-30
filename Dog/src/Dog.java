public class Dog {
    String name;
    int age;



    public void print() {
        System.out.println("This is my dog " + name +
                "\nHis age is " + age);

    }

    public static void main (String[] args) {
        Dog tommy = new Dog();
        tommy.name = "Tommy";
        tommy.age = 3;
        tommy.print();
    }
}
