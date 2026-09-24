import javax.swing.JOptionPane;
import java.awt.*;
public class labQuiz2 {
     public static void main(String[] args) {

            String z1 = "Welcome to Adobo Cooking Show";
            JOptionPane.showMessageDialog(null, z1);

            String name;
            name = JOptionPane.showInputDialog("Enter your name: ");
            int pork;
            pork = Integer.parseInt(JOptionPane.showInputDialog("How many kilo of pork will you cook? "));

            double soy = pork * 0.5;
            double vinegar = pork * 0.5;

            String msg = "The ratio of soy for " + pork + "kg is = " + soy + "\n" + "The ratio of vinegar for " + pork + "kg is = " + vinegar + "\n";
            JOptionPane.showMessageDialog(null, msg);

    }
}

