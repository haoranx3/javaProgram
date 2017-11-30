public class Animal {
    private String name;
    private int id;

    public Animal (String myName, int myId) {
        name = myName;
        id = myId;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void intro() {
        System.out.println("my name is " + name+ "/n my id is " + id);
    }


}
