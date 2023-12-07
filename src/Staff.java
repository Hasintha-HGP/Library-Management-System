import javax.swing.JOptionPane;

public class Staff {
    String Name; // Name Declaration
    int WP; //Worked Period Declaration
    String Position, PNumber; // Position and Phone Number Declaration
    String Appoint, Retired; // Dates of Appointed and Retired

    static int staffCounter = 0;

    public Staff(String name, int WP, String position, String PNumber, String appoint, String retired) {
        Name = name;
        this.WP = WP;
        Position = position;
        this.PNumber = PNumber;
        Appoint = appoint;
        Retired = retired;
        staffCounter += 1;
    }


    public String getName() {
        return Name;
    }

    public int getWP() {
        return WP;
    }

    public String getPosition() {
        return Position;
    }

    public String getPNumber() {
        return PNumber;
    }

    public String getAppoint() {
        return Appoint;
    }

    public String getRetired() {
        return Retired;
    }

    @Override
    public String toString() {
        return
                        "Name=" + Name + '\n' +
                        "Work Period=" + WP + " Years" + '\n' +
                        "Position=" + Position + '\n' +
                        "Phone Number=" + PNumber + '\n' +
                        "Appointed=" + Appoint + '\n' +
                        "Retiring=" + Retired;
    }
}








