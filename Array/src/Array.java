public class Array {
    public static void main(String[] args) {
        int size = 4;
        int [] myList = new int[size];
        myList[0] = 1;
        myList[1] = 3;
        myList[2] = 5;
        myList[3] = 7;
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println(total);

        for (int i = 0; i < size; i++) {
            System.out.println(myList[i] + " ");
        }
        int max = myList[0];
        for (int i = 0; i < size; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }
}
