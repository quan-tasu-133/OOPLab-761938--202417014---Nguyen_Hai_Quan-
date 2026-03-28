import javax.swing.JOptionPane;

public class Assignment225 {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog("Enter first number:");
        strNum2 = JOptionPane.showInputDialog("Enter second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + diff +
                        "\nProduct: " + prod;

        if (num2 != 0) {
            double quot = num1 / num2;
            result += "\nQuotient: " + quot;
        } else {
            result += "\nCannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}