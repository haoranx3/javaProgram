
import java.util.*;
public class PrintWriter {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + "\nNext year you will be: " + age);
    }
}
