public class QuestionService {

    Question[] questions = new Question[5]; //array of Question class

    public QuestionService(){ //constructor
        questions[0] = new Question(1, "What is the size of an int in Java?", "1", "2", "3", "4", "4");
        questions[1] = new Question(2, "What is the default value of a boolean variable in Java?", "true", "false", "0", "null", "false");
        questions[2] = new Question(3, "Which of the following is not a primitive data type in Java?", "int", "float", "String", "double", "String");
        questions[3] = new Question(4, "Which company developed Java?", "Microsoft", "Apple", "Sun Microsystems", "Google", "Sun Microsystems");
        questions[4] = new Question(5, "What is the range of a short data type in Java?", "-128 to 127", "-32768 to 32767", "-2147483648 to 2147483647", "0 to 65535", "-32768 to 32767");

    }


    public void displayQuestions(){  //method

        for(Question q : questions){
            System.out.println(q);
        }
    }
}
