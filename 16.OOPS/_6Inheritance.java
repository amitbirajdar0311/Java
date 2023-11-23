public class _6Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

//Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}   