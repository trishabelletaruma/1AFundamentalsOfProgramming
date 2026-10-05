import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment2BufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double rate =
                Double.parseDouble(br.readLine());

         System.out.print("Enter hours worked: ");
         double hours =
                 Double.parseDouble(br.readLine());

         double grossPay = rate * hours;
         double withholdingRate;

         if (grossPay <= 2000){
             withholdingRate = 0.10;
         }else if (grossPay <= 4000){
             withholdingRate = 0.12;
         }else if (grossPay <= 10000){
             withholdingRate = 0.15;
         }else{
             withholdingRate = 0.20;
         }

         double withholdingTax = grossPay * withholdingRate;
         double netPay = grossPay - withholdingTax;

         System.out.println("Gross Pay: Php " + grossPay);
         System.out.println("Withholding Tax: Php " + withholdingTax);
         System.out.println("Net Pay: Php " + netPay);
    }
}
