
public class  _1ObjectandClass {
    public static void main(String[] args){
        Pen p1  = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        System.out.println(p1.color);
    }    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
