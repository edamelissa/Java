import java.util.Scanner;

public class courseGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score for Turkish:");
        int turkishScore = scanner.nextInt();

        System.out.println("Enter the score for Philosophy:");
        int philosophyScore = scanner.nextInt();

        System.out.println("Enter the score for Mathematics:");
        int mathScore = scanner.nextInt();

        System.out.println("Enter the score for Psychology:");
        int psychologyScore = scanner.nextInt();

        System.out.println("Enter the score for Physics:");
        int physicsScore = scanner.nextInt();

        System.out.println("Results:");

        // Check and print the result for Turkish
        System.out.println("Turkish: " + getResult(turkishScore));

        // Check and print the result for Philosophy
        System.out.println("Philosophy: " + getResult(philosophyScore));

        // Check and print the result for Mathematics
        System.out.println("Mathematics: " + getResult(mathScore));

        // Check and print the result for Psychology
        System.out.println("Psychology: " + getResult(psychologyScore));

        // Check and print the result for Physics
        System.out.println("Physics: " + getResult(physicsScore));

        scanner.close();
    }

    // Function to determine whether a course is passed or failed
    private static String getResult(int score) {
        return (score > 60) ? "Pass" : "Fail";
    }
}