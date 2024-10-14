
class Student {
    // properties of the student object
    int rollno;
    String name;
    int marks;
}

public class ArrObjectDemo {
    public static void main(String[] args) {
        // creating individual student objects:
        Student s1 = new Student();
        s1.rollno = 49;
        s1.name = "Pranesh";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 50;
        s2.name = "Preveen";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 51;
        s3.name = "Ragul";
        s3.marks = 94;

        // storing each student's obj references into an array
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // accessing values from an array of student objects
        // (using normal for loop)
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        // accessing values from an array of student objects 
        // (using enhanced-for loop)
        for (Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}
