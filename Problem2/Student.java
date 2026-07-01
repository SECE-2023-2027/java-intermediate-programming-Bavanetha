class Student {
    String name;
    int[] marks;

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}