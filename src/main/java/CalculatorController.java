
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML private TextField number1Field;
    @FXML private TextField number2Field;
    @FXML private Label resultLabel;

    private Calculator calculator;
    @FXML
    private void onCalculateClick() {
        try {

            String text = Calculator.calculate(number1Field.getText(), number2Field.getText());

            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());

            resultLabel.setText(text);

            // Save to DB
            ResultService.saveResult(num1, num2, num1 + num2, num1 * num2, num1 - num2, num1 / num2);

        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }
}