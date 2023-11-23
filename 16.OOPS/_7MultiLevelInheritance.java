
public class _7MultiLevelInheritance {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 5;
        System.out.println(dobby.legs);
    }    
}


class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}