public class _12Static {    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "PNV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  // Output: PNV
    }
}

class Student {
    int roll;
    String name;

    static String schoolName;  // Keep the 'static' keyword

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
