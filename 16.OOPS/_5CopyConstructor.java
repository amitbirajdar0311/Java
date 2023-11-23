public class _5CopyConstructor{
    public static void main(String[] args){

        Student s1 =new Student();
        s1.name = "Amit";
        s1.roll = 123;
        s1.password = "XYZ";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] =100;


        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[0] =  100;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int[] marks;

    Student(){
        System.out.println("This is non-parameterized construtor");
        marks = new int[3];
    }

    Student(Student s1){

        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // this.marks = s1.marks; //this is shallow copy  
        
        for(int i=0;i<marks.length;i++){
            this.marks[i]  = s1.marks[i];
        }
    }
}