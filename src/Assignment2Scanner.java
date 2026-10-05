import java.util.Scanner;
public class Assignment2Scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();

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

        double withholdingTax = grossPay * withholdingRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Pay: " + netPay);

        scanner.close();
        }
    }
}
