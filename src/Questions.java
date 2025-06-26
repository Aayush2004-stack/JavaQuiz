

public class Questions {
    String question;
    String[] choices = new String[4];
    int correctIndex;


    Questions(String question, String choice1, String choice2, String choice3, String choice4, int correctIndex) {
        this.question = question;
        this.choices[0] = choice1;
        this.choices[1] = choice2;
        this.choices[2] = choice3;
        this.choices[3] = choice4;
        this.correctIndex = correctIndex;
    }


    public void displayQuestion() {
        System.out.println("\n" + question);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ": " + choices[i]);
        }
    }


    public boolean isCorrect(int userChoice) {
        return (userChoice - 1) == correctIndex;
    }


}