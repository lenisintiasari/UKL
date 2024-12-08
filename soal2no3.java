import java.util.Random;
import java.util.Scanner;

public class soal2no3 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Random r = new Random();

        while (true) {
            int num1 = r.nextInt(100) + 1;
            int num2 = r.nextInt(100) + 1; 
            int operator = r.nextInt(3); 

            String question = "";
            int correctAnswer = 0;

            switch (operator) {
                case 0: 
                    question = num1 + " * " + num2 + " = ";
                    correctAnswer = num1 * num2;
                    break;
                case 1:
                    question = num1 + " / " + num2 + " = ";
                    correctAnswer = num1 / num2;
                    break;
                case 2: 
                    question = num1 + " % " + num2 + " = ";
                    correctAnswer = num1 % num2;
                    break;
            }

            System.out.print(question);
            int userAnswer = s.nextInt();

            
            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban Anda Benar!");
            } else {
                System.out.println("Jawaban Anda Salah, Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String userResponse = s.next();

            if (userResponse.equalsIgnoreCase("tidak")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
        }

        s.close();
    }
}
    
 
