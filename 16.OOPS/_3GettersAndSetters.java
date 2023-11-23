public class _3GettersAndSetters{
    public static void main(String[] args){
        Pen p1 = new Pen();
        // p1.color = "Red";

        p1.setColor("Red");
        System.out.println(p1.getColor());
        
        p1.setTip(5);
        System.out.println(p1.getTip());

        
    }
}

class Pen{
    private String color;
    private int tip;

    //setters

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    //getters 

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }



}