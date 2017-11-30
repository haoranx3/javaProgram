
import java.util.Scanner;

public class SystemoutDemo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("What is your target money?: ");
        String target = a.nextLine();
        System.out.println("How old are you? ");
        int n = a.nextInt();
    }
}
