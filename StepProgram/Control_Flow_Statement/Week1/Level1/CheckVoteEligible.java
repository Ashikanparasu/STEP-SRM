import java.util.Scanner;

class CheckVoteEligible{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int Age = input.nextInt();

        if (Age>=0){

            System.out.println(" The person's age is "+Age +" and Can vote");
            
        }

        else {
            
            System.out.println(" The person's age is "+Age +" and Cannot vote");
    }
    }

}