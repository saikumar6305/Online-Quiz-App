import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer; 

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"1. implements", "2. extends", "3. inherit", "4. super"}, 2));
        questions.add(new Question("Which collection does not allow duplicates?",
                new String[]{"1. List", "2. Map", "3. Set", "4. ArrayList"}, 3));
        questions.add(new Question("Which loop is guaranteed to execute at least once?",
                new String[]{"1. for loop", "2. while loop", "3. do-while loop", "4. foreach loop"}, 3));
        questions.add(new Question("Which of these is not a Java primitive type?",
                new String[]{"1. int", "2. float", "3. String", "4. char"}, 3));
        questions.add(new Question("What does JVM stand for?",
                new String[]{"1. Java Visual Machine", "2. Java Virtual Machine", "3. Java Variable Machine", "4. None"}, 2));

        int score = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("--------------------------------\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
        if (score == questions.size()) {
            System.out.println("Excellent! Perfect Score!");
        } else if (score >= 3) {
            System.out.println("Good job, keep learning!");
        } else {
            System.out.println("Keep practicing Java, you’ll improve!");
        }

        sc.close();
    }
}
