import java.util.*;

public class QuestionService {

    Question[] questions = new Question[5]; // array of Question class
    String selection[] = new String[5];

    public QuestionService() { // constructor
        questions[0] = new Question(1, "What is the size of an int in Java?", "1", "2", "3", "4", "4");
        questions[1] = new Question(2, "What is the default value of a boolean variable in Java?", "true", "false", "0", "null", "false");
        questions[2] = new Question(3, "Which of the following is not a primitive data type in Java?", "int", "float", "String", "double", "String");
        questions[3] = new Question(4, "Which company developed Java?", "Microsoft", "Apple", "Sun Microsystems", "Google", "Sun Microsystems");
        questions[4] = new Question(5, "What is the range of a short data type in Java?", "-128 to 127", "-32768 to 32767", "-2147483648 to 2147483647", "0 to 65535", "-32768 to 32767");
    }

    public void playQuiz() { // method
        int marks = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());

            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());

            selection[i] = sc.nextLine();

            if (selection[i].equals(q.getAnswer())) {
                marks++;
            }
        }

        for (String s : selection) {
            System.out.println("Answers by user: " + s);
        }

        System.out.println("Total correct questions are: " + marks);
    }
}
