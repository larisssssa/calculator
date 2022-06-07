import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(inputScanner.nextLine());
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = 0;

        while(true){
            String calculation = getString("What would you like to do? \n add \n subtract \n multiply \n divide \n exit");

            if(calculation.equals("exit")){
                System.out.println("Goodbye");
                break;
            }

            double num1 = getDouble("Enter the first number: ");
            double num2 = getDouble("Enter the second number: ");

            if(calculation.equals("add")){
                result = calc.add(num1, num2);
                System.out.println("Result:" + result);
            }else if(calculation.equals("subtract")){
                result = calc.subtract(num1, num2);
                System.out.println("Result:" + result);
            }else if(calculation.equals("multiply")){
                result = calc.multiply(num1, num2);
                System.out.println("Result:" + result);
            }else if(calculation.equals("divide")){
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    result = calc.divide(num1, num2);
                    System.out.println("Result:" + result);
                }
            }
        }


    }
}
