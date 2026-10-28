class Restaurant {
    String name;

    Restaurant() {
        
        System.out.println("Parent");
    }

    void estimated_delivery_time() {
        System.out.println("Estimated delivery time: 40 minutes");
    }
}

class FastFoodRestaurant extends Restaurant {
    String cuisineType;

    FastFoodRestaurant(String CuisineType) {
        
        this.cuisineType = CuisineType;
    }

    @Override
    void estimated_delivery_time() {
        System.out.println("Estimated delivery time: 20 minutes");
    }

    
}

public class Restaurant_main {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();

        FastFoodRestaurant r2 = new FastFoodRestaurant( "Fastfood");

        System.out.println(r2.cuisineType);
        

        r1.estimated_delivery_time();  // 40 minutes
        r2.estimated_delivery_time();  // 20 minutes
    }
}