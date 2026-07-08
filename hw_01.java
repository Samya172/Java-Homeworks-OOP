import java.util.Scanner;

public class hw_01{
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("1. Area of Triangle");
        System.out.println("2. Volume of Sphere");
        System.out.println("3. Area of Circle");
        System.out.println("4. Celsius to Fahrenheit");
        System.out.println("5. Area of Equilateral Triangle");
        System.out.println("6. Area of Triangle (2)");

        System.out.print("Enter Choice: ");
        
        int choice = sc.nextInt();

        switch(choice){
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
            default:
                System.out.println("Invalid Choice LOL \n Try again Duffer!!");





                


        }

        


    }

    static void area_of_triangle(){

        System.out.print("Base: ");
        double base=sc.nextDouble();
        System.out.print("Height: ");
        double height=sc.nextDouble();

        System.out.println("Area = "+(0.5*base*height));
            
    }

    static void volume_sphere(){
        System.out.print("Radius: ");
        double r=sc.nextDouble();

        System.out.println("Volume ="+((4.0/3.0)*Math.PI*Math.pow(r,3)));

    }

    static void area_circle(){
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        System.out.println("Area = " + (Math.PI * r * r));

    }

    static void celsius_to_fahrenheit(){
        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit = " + ((9.0 / 5.0) * c + 32));
        
    }

    static void area_equilateral_triangle(){
        System.out.print("Side: ");
        double side = sc.nextDouble();

        System.out.println("Area = " + ((Math.sqrt(3) / 4) * side * side));

    }

    static void area_triangle_2(){
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


    
}