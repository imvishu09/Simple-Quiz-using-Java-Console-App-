# Simple Quiz using Java Console App

This project is a simple quiz application implemented in Java. It presents a series of questions to the user, collects their answers, and then displays the number of correct answers.

## Classes

### `Question`
The `Question` class represents a single quiz question. It includes the question text, four options, and the correct answer.

#### Attributes:
- `id` (int): The ID of the question.
- `question` (String): The text of the question.
- `opt1` (String): Option 1.
- `opt2` (String): Option 2.
- `opt3` (String): Option 3.
- `opt4` (String): Option 4.
- `answer` (String): The correct answer.

#### Constructor:
```java
public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer)
```

### `QuestionService`
The `QuestionService` class manages an array of `Question` objects, presents the questions to the user, and collects their answers.

#### Attributes:
- `questions` (Question[]): An array of `Question` objects.
- `selection` (String[]): An array to store the user's answers.

#### Methods:
- `public QuestionService()`: Constructor that initializes the array of questions.
- `public void playQuiz()`: Method to play the quiz, present questions, collect answers, and display the number of correct answers.

### `Main`
The `Main` class contains the `main` method, which is the entry point of the application.

#### Method:
- `public static void main(String[] args)`: Creates an instance of `QuestionService` and calls `playQuiz`.

## How to Run

1. Clone the repository:
    ```sh
    git clone https://github.com/imvishu09/Simple-Quiz-using-Java-Console-App-.git
    ```

2. Navigate to the project directory:
    ```sh
    cd Simple-Quiz-using-Java-Console-App-
    ```

3. Compile the Java files:
    ```sh
    javac Main.java QuestionService.java Question.java
    ```

4. Run the application:
    ```sh
    java Main
    ```

## Sample Output

```
Question No: 1
What is the size of an int in Java?
1. 1
2. 2
3. 3
4. 4
4

Question No: 2
What is the default value of a boolean variable in Java?
1. true
2. false
3. 0
4. null
false

Question No: 3
Which of the following is not a primitive data type in Java?
1. int
2. float
3. String
4. double
String

Question No: 4
Which company developed Java?
1. Microsoft
2. Apple
3. Sun Microsystems
4. Google
Sun Microsystems

Question No: 5
What is the range of a short data type in Java?
1. -128 to 127
2. -32768 to 32767
3. -2147483648 to 2147483647
4. 0 to 65535
-32768 to 32767

Answers by user: 4
Answers by user: false
Answers by user: String
Answers by user: Sun Microsystems
Answers by user: -32768 to 32767
Total correct questions are: 5
```


## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## Author
[imvishu09](https://github.com/imvishu09)