import javax.swing.JOptionPane;

public class Assignment2JOptionPane {
    public static void main(String[] args){
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate: "));

        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked: "));

        double grossPay = rate * hours;
        double withholdingRate;

        if (grossPay <= 2000){
            withholdingRate = 0.10;
        }else if (grossPay <= 4000){
            withholdingRate = 0.12;
        }else if (grossPay <= 10000){
            withholdingRate = 0.15;
        }else {
            withholdingRate = 0.20;
        }

        double withholdingTax = grossPay * withholdingRate;
        double netPay = grossPay - withholdingTax;

        JOptionPane.showMessageDialog(null, "Gross Pay: Php " + grossPay + "\nWithholding Tax: Php " + withholdingTax + "\nNet Pay: Php " + netPay);
    }
}
