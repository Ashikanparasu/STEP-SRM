import java.util.Scanner;
class KilometerConverstion {

    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ponds = scanner.nextInt();

        double kilo = ponds / 2.2 ;

        System.out.println("The weight of the person in pound is "+ ponds + " and in kag is "+ kilo);
    } }

