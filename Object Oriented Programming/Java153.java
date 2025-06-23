// Constructors

public class Java153 {
    public static void main(String args[]){
        Student s1 = new Student("Sakshi");   // initialization
        System.err.println(s1.Name);
    }
}

class Student{
    String Name;
    int Rollno;

    Student(String Name){
        this.Name = Name;
    }
}
