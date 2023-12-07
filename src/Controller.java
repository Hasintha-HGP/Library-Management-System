import javax.swing.*;

public class Controller {
    public static void main(String[] args) {
        String repeat = null;

        try {
            do {
                Main.main();
                    repeat = JOptionPane.showInputDialog(null, "Have another go (Yes or No)  ?", "Wait a Minute...!", JOptionPane.PLAIN_MESSAGE);
            }
            while (repeat.equalsIgnoreCase("Yes")) ;
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Have a Nice Day!!!", "Good Bye!", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
