import java.util.Scanner;

public class hw_01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1. Area of Triangle");
        System.out.println("2. Volume of Sphere");
        System.out.println("3. Area of Circle");
        System.out.println("4. Celsius to Fahrenheit");
        System.out.println("5. Area of Equilateral Triangle");
        System.out.println("6. Area of Triangle (Heron's Formula)");
        System.out.println("7. Grade Calculator");
        System.out.println("8. Positive Integer Check");
        System.out.println("9. Odd or Even Check");
        System.out.println("10. Simple Calculator");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                area_of_triangle();
                break;
            case 2:
                volume_sphere();
                break;
            case 3:
                area_circle();
                break;
            case 4:
                celsius_to_fahrenheit();
                break;
            case 5:
                area_equilateral_triangle();
                break;
            case 6:
                area_triangle_2();
                break;
            case 7:
                gradeCalculator();
                break;
            case 8:
                positiveIntegerCheck();
                break;
            case 9:
                oddEvenCheck();
                break;
            case 10:
                simpleCalculator();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    static void area_of_triangle() {

        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();

        System.out.println("Area = " + (0.5 * base * height));

    }

    static void volume_sphere() {
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume =" + ((4.0 / 3.0) * Math.PI * Math.pow(r, 3)));

    }

    static void area_circle() {
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        System.out.println("Area = " + (Math.PI * r * r));

    }

    static void celsius_to_fahrenheit() {
        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit = " + ((9.0 / 5.0) * c + 32));

    }

    static void area_equilateral_triangle() {
        System.out.print("Side: ");
        double side = sc.nextDouble();

        System.out.println("Area = " + ((Math.sqrt(3) / 4) * side * side));

    }

    static void area_triangle_2() {
        System.out.print("Side a: ");
        double a = sc.nextDouble();
        System.out.print("Side b: ");
        double b = sc.nextDouble();
        System.out.print("Side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area = " + area);
    }

    static void gradeCalculator() {
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade = A+");
        else if (marks >= 80)
            System.out.println("Grade = A");
        else if (marks >= 70)
            System.out.println("Grade = A-");
        else if (marks >= 60)
            System.out.println("Grade = B");
        else if (marks >= 40)
            System.out.println("Grade = C+");
        else
            System.out.println("Grade = F");
    }

    static void positiveIntegerCheck() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println(num + " is a Positive Integer.");
        else if (num == 0)
            System.out.println("The number is Zero.");
        else
            System.out.println(num + " is a Negative Integer.");
    }

    static void oddEvenCheck() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");
    }

    static void simpleCalculator() {
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result = " + ((double) a / b));
            else
                System.out.println("Division by zero is not allowed.");
        } else
            System.out.println("Invalid Operator.");
    }

}