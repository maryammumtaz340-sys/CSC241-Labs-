// PassByValueDemo.java
// Task 4: Prove Java Pass-by-Value

public class PassByValueDemo {

    void changeNumber(int x) {
        System.out.println("  Inside changeNumber - before: x = " + x);
        x = 99;
        System.out.println("  Inside changeNumber - after:  x = " + x);
    }

    void changeStudent(Student st) {
        System.out.println("  Inside changeStudent - before: completedCredits = " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("  Inside changeStudent - after:  completedCredits = " + st.completedCredits);
    }

    void replaceStudent(Student st) {
        System.out.println("  Inside replaceStudent - before: name = " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("  Inside replaceStudent - after (local st only): name = " + st.name);
    }

    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        // --- Experiment A ---
        int num = 10;
        System.out.println("Experiment A - Before: num = " + num);
        demo.changeNumber(num);
        System.out.println("Experiment A - After:  num = " + num);
        System.out.println();

        // --- Experiment B ---
        Student stu1 = new Student();
        stu1.studentId = "BAI-010";
        stu1.name = "Hassan Raza";
        stu1.completedCredits = 20;

        System.out.println("Experiment B - Before: " + stu1.completedCredits);
        demo.changeStudent(stu1);
        System.out.println("Experiment B - After:  " + stu1.completedCredits);
        System.out.println();

        // --- Experiment C ---
        Student stu2 = new Student();
        stu2.name = "Original";

        System.out.println("Experiment C - Before: " + stu2.name);
        demo.replaceStudent(stu2);
        System.out.println("Experiment C - After:  " + stu2.name);

        
    }
}