import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
