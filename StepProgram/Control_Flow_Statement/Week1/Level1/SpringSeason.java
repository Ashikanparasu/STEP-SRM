import java.util.Scanner;

class SpringSeason {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int Month = input.nextInt();
        int day = input.nextInt();

        if (Month == 3 && day >= 20 || Month == 4 || Month == 5 || (Month == 6 && day <= 20)){

            System.out.println("Its a Spring Season");

        } else {

            System.out.println("Not a Spring Season");
        }
    }
}