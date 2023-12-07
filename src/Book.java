import javax.swing.JOptionPane;
public class Book {
    String Book_Name;
    String Author;
    String Book_id;
    String Edition;
    int Number_of_copies;
    String Rack_Number;

    public Book(String book_Name, String author, String book_id, String edition, int number_of_copies, String rack_Number) {
        Book_Name = book_Name;
        Author = author;
        Book_id = book_id;
        Edition = edition;
        Number_of_copies = number_of_copies;
        Rack_Number = rack_Number;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBook_id() {
        return Book_id;
    }

    public String getEdition() {
        return Edition;
    }

    public int getNumber_of_copies() {
        return Number_of_copies;
    }

    public String getRack_Number() {
        return Rack_Number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book_Name='" + Book_Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Book_id='" + Book_id + '\'' +
                ", Edition='" + Edition + '\'' +
                ", Number_of_copies=" + Number_of_copies +
                ", Rack_Number='" + Rack_Number + '\'' +
                '}';
    }

    public static void main() {
        Book E001 = new Book("In cold blood\n","Truman Capote\n","E001\n","1966\n",5,"EP345");
        Book E002 = new Book("The Devil In The White City","Erik Larson","E002","2003",3,"Cd3453");
        Book E003 = new Book("The Innocent Man","John Grisham","E003","1987",6,"AS234");
        Book A001 = new Book("Essays Of A Lifetime","Sumit Sakar","A001","2005",2,"AF567");
        Book B005 = new Book("Senkottan","Mahinda Massibule","D003","2012",10,"GH234");
        Book C003 = new Book("Essays Of A Lifetime","Catalog: Carlo Fonseka","A003","1984",3,"ZS789");
        Book D004 = new Book("Kaliyugaya","Martin Wickramasingha","D004","1980",14,"QS123");
        String BookID=JOptionPane.showInputDialog(null,"Enter the Book Id");

        switch (BookID){
            case "E001":
                JOptionPane.showMessageDialog(null, E001);
                break;
            case "E002":
                JOptionPane.showMessageDialog(null, E002);
                break;
            case "E003":
                JOptionPane.showMessageDialog(null, E003);
                break;
            case "A001":
                JOptionPane.showMessageDialog(null, A001);
                break;
            case "B005":
                JOptionPane.showMessageDialog(null, B005);
                break;
            case "C003":
                JOptionPane.showMessageDialog(null, C003);
                break;
            case "D004":
                JOptionPane.showMessageDialog(null, D004);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Book ID is incorrect");
                break;
        }
    }
}

