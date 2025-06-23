// Types of Constructors - Copy Constructors

public class Java155 {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.Name = "Sakshi";
        s1.Rollno = 3;
        s1.Password = "Sak@123";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.Password = "SakshiB";

        for(int i = 0; i < 3; i++){
            System.err.println(s2.marks[i]);
        }

        s1.marks[2] = 100;
        for(int i = 0; i < 3; i++){
            System.err.println(s2.marks[i]);
        }
    }
}

class Student{
    String Name;
    int Rollno;
    String Password;
    int marks[];

    // Copy Constructor - Shallow
    // Student(Student s1){
    //     this.Name = s1.Name;
    //     this.Rollno = s1.Rollno;
    //     this.marks = s1.marks;
    // }

    // Copy Constructor - Deep
    Student (Student s1){
        marks = new int[3];
         this.Name = s1.Name;
         this.Rollno = s1.Rollno;
         for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
         }
    }
    
    Student(){
        System.err.println("Constructor is called...");
        marks = new int[3];
    }
}
