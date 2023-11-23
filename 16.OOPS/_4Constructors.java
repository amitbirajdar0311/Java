
public class _4Constructors {
    public static void main(String[] args){

        Pen p = new Pen("red");
        System.out.println(p.color);


        Pen p1  = new Pen();

        Pen p2 = new Pen(4);
        System.out.println(p2.tip);

    

    }    
}

class Pen{
    String color;
    int tip;

    Pen(){
        System.out.println("This is non parameterized constructor");
    }

    Pen(String color){
        this.color = color;  
    }

    Pen(int tip){
        this.tip = tip;
    }
}