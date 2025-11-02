package pack99;

public class Student {
	//Create a Student class with variables name, rollNo, and marks. Write a program to create 3 
	//objects of Student and print their details.
    String name;
    int rollNo, marks;
    
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Rajesh"; s1.rollNo = 38; s1.marks = 87;
        s2.name = "Krishna"; s2.rollNo = 36; s2.marks = 90;
        s3.name = "Vinod";  s3.rollNo = 21; s3.marks = 82;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}