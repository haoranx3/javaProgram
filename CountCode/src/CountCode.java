public class CountCode {
   public void countCode(String str) {
       int i = 0;
       for (int n = 0; n < str.length() - 4; n++) {
           if (str.substring(n, n + 4).equals("code"))
       }

   }
   public static void main(String[] args) {
       CountCode cc = new CountCode();
       cc.countCode("code");
   }




}

