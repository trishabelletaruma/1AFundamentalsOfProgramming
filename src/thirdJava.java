import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thirdJava {
    public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.print("Please Enter Your Name: ");
        try {
            name = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!"); }
            System.out.print("Hello " + name +"!");
        }

    }