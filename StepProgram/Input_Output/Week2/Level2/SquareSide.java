import java.util.Scanner;
class SquareSide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");

        int perimeter = scanner.nextInt();
    
        int side = perimeter / 4;
        
        System.out.println("The length of the side is “+side+” whose perimeter is” + perimeter);

    }
}
