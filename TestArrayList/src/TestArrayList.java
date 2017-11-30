import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    private ArrayList<String> files;
    public TestArrayList() {
        files = new ArrayList<>();
    }
    public void addFile(String filename) {
        files.add(filename);
    }
    public int getNumberOfFiles() {
        return files.size();
    }
    public void listFiles(int index) {
        if (index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void remove(int index) {
       if (index >= 0 && index < files.size()) {
           files.remove(index);
       }
    }
    public void listAll() {
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
    public static void main (String[] args) {
        TestArrayList music = new TestArrayList();
        music.addFile("abc");
        music.addFile("def");
        music.addFile("hgi");
        music.getNumberOfFiles();
        music.files.size();
        music.listFiles(1);
        music.listAll();
        System.out.println(music.files.get(0));
        music.remove(0);
        System.out.println(music.files.get(0));
    }


}
