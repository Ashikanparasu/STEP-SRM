class PensPerStudent{
     public static void main(String[] args) {

        int totalPens = 14;
        int numStudents = 3;

        int pensPerStudent = totalPens / numStudents;
        int remainingPens = totalPens % numStudents;

        System.out.println("The pen per student is " + pensPerStudent);
        System.out.println("Remaining pen not distributed is" + remainingPens);
    }
}
