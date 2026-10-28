interface Father {
    default void show() {
        System.out.println("Father");
    }
}

interface Mother {
    default void show() {
        System.out.println("Mother");
    }
}

class Child implements Father, Mother {
    @Override
    public void show() {
        Father.super.show();
        Mother.super.show();
    }
}

public class surprise {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}