import javax.swing.JOptionPane;

public class Account {
    public static String username;
    private String password;


    public void login() {
        String username = JOptionPane.showInputDialog(null, "Enter Username : " + "", null, JOptionPane.PLAIN_MESSAGE);
        if (username == null) {
            JOptionPane.showMessageDialog(null, "Cancelled.", "Terminated.", JOptionPane.PLAIN_MESSAGE);
        } else {
            password = JOptionPane.showInputDialog(null, "Enter Password : ", null, JOptionPane.PLAIN_MESSAGE);
            if (username.equals("librarian") && password.equals("1234")) {
                libra();
            } else if (username.equals("2020022") && password.equals("1234")) {
                Controller2.main();
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect !", null, JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "Cancelled.", "Terminated.", JOptionPane.PLAIN_MESSAGE);
            }
        }
}

        public static void libra() {
            int toDo = Integer.parseInt(JOptionPane.showInputDialog(null, "01 - Issue Book\n02 - Return Book\n03 - Log Out\nYour Responce : ", "Welcome to Library!!", JOptionPane.PLAIN_MESSAGE));
            switch (toDo) {
                case 01:
                    Librarian IB = new Librarian(); //issue book
                    IB.issueBook();
                    break;
                case 02:
                    Librarian RB = new Librarian(); //return book
                    RB.returnBook();
                    break;
                case 03:
                    JOptionPane.showMessageDialog(null, "You are Logging out!!!!", null, JOptionPane.YES_NO_OPTION, null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error !!!", null, JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }

