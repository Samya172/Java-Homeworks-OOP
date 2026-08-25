import java.util.Scanner;

class car{
        String name;
        String model;

        static int count=0;
        public car(String n,String m){
            name=n;
            model=m;
            count++;
            System.out.println("You have created a car of model: " + model);
            
        }
}

public class carshowroom{

    

    public static void main(String[] args){

        car car1=new car("Axio","12A");
        car car2=new car("Toyota","100C");
        System.out.println("No. of car:  " + car.count);

    }
}