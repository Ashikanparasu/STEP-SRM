import java.util.Scanner;

class TotalIncome {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter Salary");
       int salary = scanner.nextInt();
       System.out.print("Enter Bonus");
       int bonous = scanner.nextInt();

       int income = salary+bonous;

       System.out.println("The salary is INR"+salary+"and bonus is INR "+ bonous+ " .Hence Total Income is INR "+income);

    }}