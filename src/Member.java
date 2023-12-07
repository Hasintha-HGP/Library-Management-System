import javax.swing.JOptionPane;
public class Member {
    String name;
    String id;
    String address;
    String date;
    int totBooks;

    public Member(String name, String id, String address, String date, int totBooks) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.date = date;
        this.totBooks = totBooks;
    }

    public void display() {
        JOptionPane.showMessageDialog(null,"Member ID: " +id+"\n" +
                        "Member Name: " +name+"\n" +
                        "Member Address: " +address+"\n" +
                        "Date of Getting Membership: " +date+"\n"+
                        "Total number of books checked out: " +totBooks+"\n"
                ,"",JOptionPane.PLAIN_MESSAGE);

    }

    public static void main() {


        Member supun = new Member("E.G.S.S. Bandara","2020025","Wagollawatta, Wattarama, Imbulgasdeniya.","2022/12/21", 5);
        Member thisal = new Member("L.A.T.C Liyanaarachchi ","2020022","Eheliyagoda, Rathnapura.","2022/05/23", 4);
        Member hasi = new Member("H.G.P. Hasintha", "2020067", "Sooriyawawa, Hambanthota.", "2023/01/12", 2);
        Member sajeewa = new Member("W.M.S.P. Wanninayaka", "2020006", "Nikaweratiya, Kurunegala.", "2022/09/03", 0);

        int id=Integer.parseInt(JOptionPane.showInputDialog(null,"Input Username:","Welcome to Member Section!",JOptionPane.PLAIN_MESSAGE));

        switch (id) {
            case 2020025: {
                supun.display();
                break;
            }
            case 2020022: {
                thisal.display();
                break;
            }
            case 2020006: {
                sajeewa.display();
            }
            case 2020067: {
                hasi.display();
            }
            default:
                JOptionPane.showMessageDialog(null,"Invalid Username!!","",JOptionPane.WARNING_MESSAGE);
                break;
        }
    }
}