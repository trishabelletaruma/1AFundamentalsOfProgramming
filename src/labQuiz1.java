import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class labQuiz1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your birth year: ");
            String birthYearInput = dataIn.readLine();
            int birthYear = Integer.parseInt(birthYearInput);
            System.out.println("You were born last " + birthYear + ".");
            int age = 2026 - birthYear;
            System.out.println("You are now " + age + " years old.");
        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}
