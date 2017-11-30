public class AnswerCell {
    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if(isMorning) {
                if(isMom) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                System.out.println("true");
            }
        }
        else {
            System.out.println("false");
        }

    }
    public static void main(String[] args) {
        AnswerCell ac = new AnswerCell();
        ac.answerCell(false, false, false);
    }
}
