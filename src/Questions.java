import java.lang.reflect.Array;

public class Questions {
    static String choices[]={"12","12","df","sdf"};
    String question;
    String answer;
    Questions(String question, String answer){
        this.question =question;
        this.answer=answer;
        //this.choices =choices;
    }

    static Questions qn1 = new Questions("what is todays date","1: 25 june");

    public static void main(String[] args) {
        System.out.println(qn1.question);
        System.out.println(qn1.answer);



    }



}
