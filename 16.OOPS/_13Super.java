

public class _13Super {
    public static void main(String[] args){
        Horse h = new Horse();
        System.out.println(h.color);

    }    
}

class Animal{
    String color;
    Animal(){
        System.out.println("This is animal Constructor");
    }
}


class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("Horse Constructor is called");
    }
}