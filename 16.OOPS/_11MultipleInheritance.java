
public class _11MultipleInheritance {
    public static void main(String[] args){
        Human h = new Human();
        h.eat();
        h.walk();
        
    }    
}

interface Harbivore{
    void eat();
}

interface Carnivore{
    void walk();
}

class Human implements Harbivore,Carnivore{
    public void eat(){
        System.out.println("eats");
    }

    public void walk(){
        System.out.println("walk");
    }
}
