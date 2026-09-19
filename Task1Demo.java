// Task1Demo.java
// Task 1: Build a Class and Prove Independent Object State

public class Task1Demo {
    public static void main(String[] args) {

        // Create exactly three Student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Assign field values (BAI example data)
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        s3.studentId = "BAI-003";
        s3.name = "Abdul rehman Azam";
        s3.completedCredits = 60;

        // Print all three objects BEFORE any change
        System.out.println("Before changing s2:");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 5;

        // Print all three objects AFTER the change
        System.out.println();
        System.out.println("After changing s2:");
        System.out.println(s1.studentId + " | " + s1.name + " | " + s1.completedCredits);
        System.out.println(s2.studentId + " | " + s2.name + " | " + s2.completedCredits);
        System.out.println(s3.studentId + " | " + s3.name + " | " + s3.completedCredits);

    }
}