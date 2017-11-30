import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            list.add(i);
        }
        for (Iterator<Integer> a = list.iterator(); a.hasNext();) {
            int n = a.next();
            (n+1);
        }
        System.out.println(list);
    }
}
