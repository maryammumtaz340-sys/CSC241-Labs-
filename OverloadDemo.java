public class OverloadDemo {

    void enroll(String courseCode) {
        System.out.println("Enrolled by course code: " + courseCode);
    }

    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + ", section " + section);
    }

    void enroll(int numericCourseCode) {
        System.out.println("Enrolled by numeric code: " + numericCourseCode);
    }

    // int enroll(String courseCode) {
    //     return 1;
    // }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);
    }
}