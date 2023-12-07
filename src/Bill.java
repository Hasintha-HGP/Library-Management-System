import javax.swing.*;
import java.time.LocalDate;
import static java.time.LocalDate.now;

public class Bill {
        private static LocalDate date = now();
        public void Bill(int billNumber, String memberID, double amount) {

        Bill obj1= new Bill();
        JOptionPane.showMessageDialog(null,
                "Bill Number : "+ billNumber
                        +"\n" +"MemberID    : "
                        +"\n"+"Date        : "+ date
                        +"\n"+"Amount      : "+ amount,
                null,JOptionPane.PLAIN_MESSAGE);
    }
}
