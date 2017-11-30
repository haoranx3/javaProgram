import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public  class Test5 {
     private int x;
     public Test5 (int a) {
        x = a;
    }
    public List creatList() {
        List<Test5> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new Test5(i));
        }
        return list;
    }
    //public List changeList() {
       //Iterator<Test5> iterator =
    //}
    public String toString() {
         return String.format("[%d]", x);
    }

    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        for (int i = 11; i < 16; i++) {
            alist.add(i);
        }
        for (ListIterator<Integer> i = alist.listIterator(); i.hasNext();) {
           int n = i.next();
           i.set(n+1);
        }
        System.out.println(alist);
        Test5 test5 = new Test5(6);
        System.out.println(test5.creatList());


    }


}


