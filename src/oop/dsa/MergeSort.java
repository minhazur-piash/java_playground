package oop.dsa;

public class MergeSort {

    public static void main(String[] args) {

        Student[] students = createStudents();

        applyMergeSort(0, students.length - 1, students);

        for (int j = 0; j < students.length; j++) {
            System.out.println(students[j].name + " ");
        }

    }

    private static Student[] createStudents() {
        Student student1 = new Student("Abid Raihan", "12345", 30, 3.4);
        Student student2 = new Student("Hafiz Adnan", "26345", 100, 3.24);
        Student student3 = new Student("Jakaria Ahmed", "17345", 80, 2.94);
        Student student4 = new Student("Harun Yahia", "72845", 100, 3.84);
        Student student5 = new Student("Jabid Hannan", "23745", 80, 3.47);

        return (Student[]) new Student[]{student1, student2, student3, student4, student5};
    }

    private static void applyMergeSort(int startIndex, int endIndex, Student[] students) {
        if (startIndex == endIndex) {
            return;

        } else {
            int midIndex = (startIndex + endIndex) / 2;
            applyMergeSort(startIndex, midIndex, students);
            applyMergeSort(midIndex + 1, endIndex, students);

            merger(startIndex, midIndex + 1, endIndex, students);
        }

    }


    private static void merger(int startIndex, int midIndex, int endIndex, Student[] students) {
        int arrayLength = (endIndex - startIndex) + 1;
        Student[] sortedStudents = new Student[arrayLength];

        int startPointer = startIndex;
        int middlePointer = midIndex;

        int i = 0;
        for (i = 0; i < arrayLength; i++) {

            if (startPointer >= midIndex || middlePointer > endIndex) {
                break;
            }

            if (students[startPointer].isGreaterThan(students[middlePointer])) {
                sortedStudents[i] = students[startPointer];
                startPointer++;

            } else {
                sortedStudents[i] = students[middlePointer];
                middlePointer++;
            }
        }

        for (int j = startPointer; j < midIndex; j++) {
            sortedStudents[i++] = students[j];
        }

        for (int j = middlePointer; j <= endIndex; j++) {
            sortedStudents[i++] = students[j];
        }

        for (int j = 0; j < arrayLength; j++) {
            students[startIndex + j] = sortedStudents[j];
        }

    }


    static class Student {
        private String name;
        private String id;
        private int creditCompleted;
        private double cgpa;

        public Student(String name, String id, int creditCompleted, double cgpa) {
            this.name = name;
            this.creditCompleted = creditCompleted;
            this.cgpa = cgpa;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getCreditCompleted() {
            return creditCompleted;
        }

        public void setCreditCompleted(int creditCompleted) {
            this.creditCompleted = creditCompleted;
        }

        public double getCgpa() {
            return cgpa;
        }

        public void setCgpa(float cgpa) {
            this.cgpa = cgpa;
        }

        private int getSemester() {
            String semester = this.id.substring(0, 1);
            return Integer.parseInt(semester);
        }


        public boolean isGreaterThan(Student student) {
            if (this.creditCompleted > student.creditCompleted) {
                return true;

            } else if (this.creditCompleted == student.creditCompleted) {
                if (this.cgpa > student.cgpa) {
                    return true;
                } else if (this.cgpa == student.cgpa) {
                    return this.getSemester() > student.getSemester();
                }
            }
            return false;
        }
    }
}
