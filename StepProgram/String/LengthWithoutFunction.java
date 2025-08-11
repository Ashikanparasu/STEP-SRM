import java.util.Scanner;

public class StringLengthCalculator {

  
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
           
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.next();

       
        int customLength = findLengthWithoutLengthMethod(input);

        
        int builtInLength = input.length();

       
        System.out.println("Length (custom method): " + customLength);
        System.out.println("Length (built-in method): " + builtInLength);

        scanner.close();
    }
}
