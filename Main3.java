import javax.swing.JOptionPane;

public class Main3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        if(age>=21) {
            boolean age1 = true;
            JOptionPane.showMessageDialog(null, "" + age1);
        }
        if(age<21){
            boolean age2 = false;
            JOptionPane.showMessageDialog(null, "" + age2 + "\n You cannot continue the program.");
            JOptionPane.getRootFrame().dispose();
        }

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        String car = JOptionPane.showInputDialog("Enter the name of your car");
        JOptionPane.showMessageDialog(null, "You car is " + car);

    }
}
