import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    private int totalMarks;
    private float percentage;
    private char grade;

    public Student(String name, int rollNumber, int numberOfSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[numberOfSubjects];
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public char getGrade() {
        return grade;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void calculateGrade() {
        calculateTotalAndPercentage();
        assignGrade();
    }

    protected void calculateTotalAndPercentage() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        percentage = (float) totalMarks / marks.length;
    }

    protected void assignGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int rollNumber, int numberOfSubjects) {
        super(name, rollNumber, numberOfSubjects);
    }

    @Override
    protected void assignGrade() {
        if (getPercentage() >= 85) {
            super.assignGrade();
        } else if (getPercentage() >= 50) {
            System.out.println("Additional review required for grade assignment.");
            super.assignGrade();
        } else {
            System.out.println("Failing grade assigned.");
            super.assignGrade();
        }
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String name, int rollNumber, int numberOfSubjects) {
        super(name, rollNumber, numberOfSubjects);
    }

    @Override
    protected void assignGrade() {
        if (getPercentage() >= 90) {
            super.assignGrade();
        } else {
            System.out.println("Additional work required for passing.");
            super.assignGrade();
        }
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        System.out.print("Is the student an undergraduate (U) or graduate (G)? ");
        char studentType = scanner.next().charAt(0);

        Student student;
        if (studentType == 'U' || studentType == 'u') {
            student = new UndergraduateStudent(name, rollNumber, numberOfSubjects);
        } else {
            student = new GraduateStudent(name, rollNumber, numberOfSubjects);
        }

        int[] marks = new int[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        student.setMarks(marks);

        student.calculateGrade();

        student.displayDetails();

        scanner.close();
    }
}
