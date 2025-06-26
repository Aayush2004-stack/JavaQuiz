
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of the user: ");
        String userName= input.nextLine();


        Questions[] quiz = {
                new Questions("Which keyword is used to define a class in Java?",
                        "function", "class", "struct", "define", 1),

                new Questions("Which of the following is the correct entry point for a Java program?",
                        "main()", "void main()", "public static void main(String[] args)", "start()", 2),

                new Questions("Which data type is used to store a single character in Java?",
                        "String", "char", "Character", "byte", 1),

                new Questions("Which symbol is used for single-line comments in Java?",
                        "//", "/* */", "#", "<!-- -->", 0),

                new Questions("What will be the result of 10 / 3 in Java (both operands are integers)?",
                        "3.33", "3", "3.0", "Error", 1),

                new Questions("Which method is used to print text in Java?",
                        "System.out.print()", "print.out()", "console.log()", "echo()", 0),

                new Questions("Which of these is NOT a primitive data type in Java?",
                        "int", "float", "boolean", "String", 3),

                new Questions("Which loop is guaranteed to execute at least once?",
                        "for loop", "while loop", "do-while loop", "foreach loop", 2),

                new Questions("What is the size of an int in Java?",
                        "8 bits", "16 bits", "32 bits", "64 bits", 2),

                new Questions("Which of the following creates an object in Java?",
                        "MyClass obj = new MyClass();", "MyClass obj();", "class MyClass {}", "new MyClass;", 0)
        };

        int score = 0;

        // Loop through all questions
        for (int i = 0; i < quiz.length; i++) {
            System.out.println("\nQuestion " + (i + 1));
            quiz[i].displayQuestion();

            System.out.print("Enter the option number (1-4): ");
            int userAnswer = input.nextInt();

            if (quiz[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was: " + (quiz[i].correctIndex + 1) + ": " + quiz[i].choices[quiz[i].correctIndex]);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Score of user "+userName+": " + score + "/" + quiz.length);
    }



}