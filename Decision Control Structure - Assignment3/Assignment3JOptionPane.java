import javax.swing.JOptionPane;

public class Assignment3JOptionPane {
    public static void main(String[] args){
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score: "));

        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary: "));

        double entrance = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score: "));

        double average = (nsat + entrance)/2;

        if (salary > 10000 || nsat < 90 || entrance < 85){
            JOptionPane.showMessageDialog(null, "Rejected");
        }else if (salary <= 3500 && average >= 91){
            JOptionPane.showMessageDialog(null, "Accepted");
        }else {
            JOptionPane.showMessageDialog(null, "For Further Study");
        }
    }
}
