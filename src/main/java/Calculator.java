public class Calculator {

    public static String calculate(String num1, String num2) {
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);

        double sum = number1 + number2;
        double subtract = number1 - number2;
        double divide = number1 / number2;
        double product = number1 * number2;

        return "Sum: " + sum + ", Subtract: " + subtract + ", Divide: " + divide + ", Product: " + product;
    }

}
