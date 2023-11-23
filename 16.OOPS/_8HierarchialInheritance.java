
public class _8HierarchialInheritance {
    public static void main(String[] args){
        Bird b = new Bird();
        b.eat();
    
    }    
}


class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
