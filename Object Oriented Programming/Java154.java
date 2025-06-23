// Types of Constructors - Parameterized and Non Parameterized

public class Java154 {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Sakshi");
        System.err.println(s2.Name);
        Student s3 = new Student("Sakshi", 3);
        System.err.println(s3.Name + " , " + s3.Rollno);
    }
}

class Student{
    String Name;
    int Rollno;

    Student(){   /// Non - Parameterized Constructor
        System.err.println("Constructor is called...");
    }

    Student(String Name){   // Parameterized Constructor
        this.Name = Name;
    }

    Student(String Name, int Rollno){
        this.Name = Name;
        this.Rollno = Rollno;
    }
}
