// Student.java
// Task 1: instance variables (fields)
// Task 2: instance methods that use the fields, a parameter, and a local variable

class Student {

    String studentId;
    String name;
    int completedCredits;

    void addCredits(int credits) {
        completedCredits = completedCredits + credits;
    }

    int remainingCredits(int degreeCredits) {
        int remaining = degreeCredits - completedCredits; // local variable
        return remaining;
    }
    String summary() {
        return "ID: " + studentId + ", Name: " + name + ", Completed Credits: " + completedCredits;
    }
}