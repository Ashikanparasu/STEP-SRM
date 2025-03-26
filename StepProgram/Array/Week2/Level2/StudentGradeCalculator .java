import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        
        double[][] studentMarks = new double[n][4];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println((j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths") + " marks: ");
                    studentMarks[i][j] = scanner.nextDouble();
                } while (studentMarks[i][j] < 0);
            }
            
            studentMarks[i][3] = (studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2]) / 3.0;
            
            if (studentMarks[i][3] >= 80) {
                grades[i] = "A";
            } else if (studentMarks[i][3] >= 70) {
                grades[i] = "B";
            } else if (studentMarks[i][3] >= 60) {
                grades[i] = "C";
            } else if (studentMarks[i][3] >= 50) {
                grades[i] = "D";
            } else if (studentMarks[i][3] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        System.out.println("\nStudent Grades:");
        System.out.println("Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(studentMarks[i][0] + "        " + studentMarks[i][1] + "        " + studentMarks[i][2] + "        " + studentMarks[i][3] + "        " + grades[i]);
        }
        
        scanner.close();
    }
}