import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = scanner.next().toUpperCase().charAt(0);

        if (recommendee == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')){
            System.out.println("Accepted");
        }else {
            System.out.println("Rejected");
        }

        scanner.close();
    }
}

