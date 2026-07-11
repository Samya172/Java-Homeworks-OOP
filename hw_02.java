import java.util.Scanner;

public class hw_02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1. Leap Year Check");
        System.out.println("2. Print Even Series");
        System.out.println("3. Print Odd Series");
        System.out.println("4. Sum of Even Series");
        System.out.println("5. Sum of Odd Series");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                leapYear();
                break;
            case 2:
                evenSeries();
                break;
            case 3:
                oddSeries();
                break;
            case 4:
                sumEvenSeries();
                break;
            case 5:
                sumOddSeries();
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    
    static void leapYear() {
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");
    }

   
    static void evenSeries() {

        System.out.println("\nUsing For Loop:");
        for (int i = 2; i <= 20; i += 2)
            System.out.print(i + " ");

        System.out.println("\n\nUsing While Loop:");
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n\nUsing Do-While Loop:");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);

        System.out.println();
    }

    
    static void oddSeries() {

        System.out.println("\nUsing For Loop:");
        for (int i = 1; i <= 19; i += 2)
            System.out.print(i + " ");

        System.out.println("\n\nUsing While Loop:");
        int i = 1;
        while (i <= 19) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n\nUsing Do-While Loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 19);

        System.out.println();
    }

    
    static void sumEvenSeries() {

        int sum;

       
        sum = 0;
        for (int i = 2; i <= 20; i += 2)
            sum += i;
        System.out.println("Sum using For Loop = " + sum);

     
        sum = 0;
        int i = 2;
        while (i <= 20) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum using While Loop = " + sum);

      
        sum = 0;
        i = 2;
        do {
            sum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("Sum using Do-While Loop = " + sum);
    }

  
    static void sumOddSeries() {

        int sum;

      
        sum = 0;
        for (int i = 1; i <= 19; i += 2)
            sum += i;
        System.out.println("Sum using For Loop = " + sum);

      
        sum = 0;
        int i = 1;
        while (i <= 19) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum using While Loop = " + sum);

         
        sum = 0;
        i = 1;
        do {
            sum += i;
            i += 2;
        } while (i <= 19);
        System.out.println("Sum using Do-While Loop = " + sum);
    }
}