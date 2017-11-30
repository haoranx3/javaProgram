public class PlusOut {
    public void plusOut(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            string = str.replaceAll(str.substring(i), "+");
        }
        System.out.println(string);
    }
    public void test() {
        String str = "grinos.gjrioe";
        System.out.println(str.charAt(6));
    }
    
    public static void main(String[] args) {
    System.out.println("nkrsn.ngo".charAt(5));
    }
}
