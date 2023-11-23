public class _10Abstraction{
    public static void main(String[] args){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(c.color);



        Mustang m=new Mustang();
        
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constuctor called");
    }
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walk on 4 leges");
    }
}


class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}