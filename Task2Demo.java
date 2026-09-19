// Task2Demo.java
// Task 2: Add Behavior - Parameters, Local Variables, and Return Values

public class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amna";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        System.out.println("Initial state:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println();
        s1.addCredits(3);
        s2.addCredits(6);

        System.out.println("After addCredits:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println();

        int remaining1 = s1.remainingCredits(130);
        int remaining2 = s2.remainingCredits(130);

        System.out.println("Remaining credits toward a 130-credit degree:");
        System.out.println(s1.name + " -> " + remaining1);
        System.out.println(s2.name + " -> " + remaining2);

    }
}