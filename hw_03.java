import java.util.Scanner;

public class hw_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // Question 1: Average of numbers
        
        System.out.println("Question 1: Average of Numbers");

        System.out.print("Enter the number of values: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        System.out.println("Average = " + average);

        
        // Question 2: Medal
       
        System.out.println("\nQuestion 2: Medal Check");

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Semester completed? (true/false): ");
        boolean completed = sc.nextBoolean();

        if (gpa >= 3.5) {
            if (completed) {
                System.out.println("Congratulations! You get a medal.");
            } else {
                System.out.println("No medal. Semester not completed.");
            }
        } else {
            System.out.println("No medal. GPA is below 3.5.");
        }

        
        // Question 3: Bonus
        
        System.out.println("\nQuestion 3: Employee Bonus");

        System.out.print("Enter target sales percentage: ");
        int sales = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        if (sales >= 95) {
            if (attendance == 100) {
                System.out.println("Bonus = 60%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 40%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                System.out.println("Bonus = 40%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 20%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else {
            System.out.println("Bonus = 5%");
        }

        sc.close();
    }
}