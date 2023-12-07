import java.util.Objects;
import java.util.Scanner;
public class Staff2 {
    String Name; // Name Declaration
    int WP; //Worked Period Declaration
    String Position, PNumber; // Position and Phone Number Declaration
    String Appoint, Retired; // Dates of Appointed and Retired

    static int staffCounter = 0;

    public Staff2(String name, int WP, String position, String PNumber, String appoint, String retired) {

        Name = name;
        this.WP = WP;
        Position = position;
        this.PNumber = PNumber;
        Appoint = appoint;
        Retired = retired;
        staffCounter+=1;

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
                        "Working Period=" + WP + " Years" + '\n' +
                        "Position=" + Position + '\n' +
                        "Phone Number=" + PNumber + '\n' +
                        "Appointed=" + Appoint + '\n' +
                        "Retiring=" + Retired;
    }

    public static void main(String[] args) {

        // Input details of each staff member

        Staff A1 = new Staff("Thisal Chamodya", 2, "Manager", "071 1555616", "2020.01.01", "2023.01.01");
        Staff A2 = new Staff("Sajeewa Wanninayaka", 1, "Assistant", "071 7005616", "2022.03.01", "2022.03.01");

            // Greeting Message
            System.out.println("\n\t\t\t  Welcome to Staff Members Section!!\n" + "Enter 1 for Search a Member and 2 for Get the List of Staff Members:");
            Scanner scanner = new Scanner(System.in);
            int input1 = scanner.nextInt();
            switch (input1) {

                //Search the Member by his/her name.
                // In case of updating information,We'll be switching to below command.
                //System.out.println("This part is Still Developing.Please Wait");
                case 1:
                    System.out.println("\nYou are going to search a Staff Member.\n");
                    System.out.println("Enter the First name." + "(First Letter must be in Capital.):");
                    Scanner scanner1 = new Scanner(System.in);
                    String name1 = scanner1.nextLine();

                    if (Objects.equals(name1, "Thisal") || Objects.equals(name1, "Chamodya")) {
                        System.out.println(A1);
                    } else if (Objects.equals(name1, "Sajeewa") || Objects.equals(name1, "Waninayaka")) {
                        System.out.println(A2);
                    } else
                        System.out.println("This Person is not working here at the Moment.");
                    break;

                case 2:

                    // Getting the List of Members
                    // In case of updating information,We'll be switching to below command.
                    //System.out.println("This part is Still Developing.Please Wait");
                    System.out.println("Yor are going to get the List of the Staff Members.\n");
                    System.out.println(A1.Name + "\n" + A2.Name);

                    System.out.println();
            }

        }
    }
