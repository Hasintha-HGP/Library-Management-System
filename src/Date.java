import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import static java.time.LocalDate.now;

public class Date {

    private static LocalDate issueDate = now();
    private static LocalDate dueDate = issueDate.plusDays(14);

    public LocalDate Issuedate() {
        JOptionPane.showMessageDialog(null,"Issue Date  : " + issueDate,null,JOptionPane.PLAIN_MESSAGE);
        return(issueDate);
    }

    public static LocalDate DueDate(){
        JOptionPane.showMessageDialog(null,"Due Date    : " + dueDate,null,JOptionPane.PLAIN_MESSAGE);
        return(dueDate);
    }

    public static LocalDate ReturnDate(){
        String rd= JOptionPane.showInputDialog(null,"Return Date : ",null,JOptionPane.PLAIN_MESSAGE);
        LocalDate rdate = LocalDate.parse(rd);
        return(rdate);
    }

    public void Fine(){
        Period duration = Period.between(dueDate, ReturnDate());
        int fineToLateDay = 20;
        int fine = (duration.getYears() * fineToLateDay * 365)+(duration.getMonths() * fineToLateDay * 30)+(duration.getDays() * fineToLateDay) ;
        if (fine > 0){
            JOptionPane.showMessageDialog(null,"Issue Date  : " + issueDate+"\n"
                    +"Due Date    : " + dueDate+"\n"
                    +"Late Days   : " + duration.getYears() +" Years , "+ duration.getMonths() +" Months , "+ duration.getDays() + " Days"+"\n"
                    +"Your Fine for Late Days is : Rs." + fine,
                    null,JOptionPane.PLAIN_MESSAGE);
            }
        else {
           JOptionPane.showMessageDialog(null,"Returned on time",null,JOptionPane.PLAIN_MESSAGE);
        }
    }
}