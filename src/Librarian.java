import javax.swing.*;

public class Librarian extends Account {


    public static void issueBook(){
        //bookID and bookName and other Details are needed
        //memberID and memberName is needed
        Date issBook = new Date();
        issBook.Issuedate();

    }

    public  void returnBook(){
        //bookID and bookName and other Details are needed
        //memberID and memberName is needed
        Date retBook = new Date();
        retBook.Fine();

        Bill b = new Bill();
        b.Bill(01,username,20);
    }

    public void modifyBook(){}

    public void addBook(){}

    public void removeBook(){}

    public void addMember(){}

    public void removeMember(){}

    public void addStaff(){}

    public void removeStaff(){}

    public void searchBook(){}

    public void searchMember(){}

    public void searchStaff(){}

}
