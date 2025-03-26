import java.util.Scanner;
 class intrestCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = scanner.nextInt();
        int rate = scanner.nextInt();
        int time = scanner.nextInt();

        int intrest = (principal*rate*time)/100;

        System.out.println("The Simple Intrest is "+intrest+" for Principal "+principal+" ,Rate of Intrest "+ rate + " and Time "+ time);

    }
 }