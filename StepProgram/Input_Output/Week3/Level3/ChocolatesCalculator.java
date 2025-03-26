import java.util.Scanner;
class ChocolatesCalculator{

    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noofchocolates = scanner.nextInt();
        int noofchildren = scanner.nextInt();

        int choco = noofchocolates / noofchildren;
        int remaining = noofchocolates % noofchildren;

        System.out.println("The number of chocolates each child gets is "+ choco +" and the number of remaining chocolates are " +remaining);
        return 0;
    }}