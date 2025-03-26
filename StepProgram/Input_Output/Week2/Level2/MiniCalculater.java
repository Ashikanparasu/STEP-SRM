import java.util.Scanner;

class MiniCalculater{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float variable1 = input.nextFloat();
        float variable2 = input.nextFloat();

        float add = variable1 + variable2;
        float sub = variable1 - variable2;
        float mul = variable1 * variable2;
        float div = variable1 / variable2;
        
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+ variable1+" and"+variable2 + "is" +add+","+sub+","+mul+ "and"+div );    }
}
