import javax.swing.*;

public abstract class Controller2  {
    public static void main() {


        Staff A1 = new Staff("Thisal", 2, "Manager", "071 1555616", "2020.01.01", "2023.01.01");
        Staff A2 = new Staff("Sajeewa", 1, "Assistant", "071 7005616", "2022.03.01", "2022.03.01");


            int M = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "I want to go to>>>>>\n\n1-Book Section\n2-Catalog\n3-Staff Section\n4-Members Section\n",
                    "Welcome to Library!!",
                    JOptionPane.PLAIN_MESSAGE));
            switch (M) {
                case 1:
                    Book.main();
                    break;

                case 2:
                    catalog3.main();
                    break;

                case 3:

                    // Give the chance to the user to select whether Search the member by Name or to Get the List of Members
                    int S1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter as Following. \n" + "1-Search \n" + "2-Get the List\n ", "Welcome to Staff Section.!!", JOptionPane.PLAIN_MESSAGE));// Should be upgraded when the Add/remove feature is done.

                    switch (S1) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "You are going to Search a Staff Member");

                            // Searching by the Name of the Staff Member

                            // In case of Updating information switch to below command!!
                            //JOptionPane.showMessageDialog(null,"This Part is still Developing.");

                            String name = JOptionPane.showInputDialog(null, "Enter the First name of the Staff Member"
                                            + "\n"
                                            + "("
                                            + "First letter of the Name must be Capital"
                                            + ")"
                                    , "Searching"
                                    , JOptionPane.PLAIN_MESSAGE);

                            switch (name) {
                                case "Thisal":
                                    JOptionPane.showMessageDialog(null, A1);
                                    break;
                                case "Sajeewa":
                                    JOptionPane.showMessageDialog(null, A2);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "This Person is not working here currently");
                                    break;
                            }

          /*                  // Asking Clients about their experience to make the service better.

                            JOptionPane.showOptionDialog(null,
                                    "Was this Helpful?",
                                    "Wait a Minute!!",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,
                                    null,
                                    0);
                            JOptionPane.showInputDialog(null,
                                    "How Was Your Experience using our System?\n" + "Your Response will be Help to provide us a Greater Service Next Time.",
                                    "Thank You!!",
                                    JOptionPane.INFORMATION_MESSAGE);*/
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "You are going to Get the list of Staff Members");
                            JOptionPane.showMessageDialog(null, "There are " + Staff.staffCounter + " Members Working Here");

                            // Get the list of Staff members

                            JOptionPane.showMessageDialog(null, A1.Name + "\n" + A2.Name);

                            // In case of Updating information switch to below command!!
                            //JOptionPane.showMessageDialog(null,"This Part is still Developing.");


                 /*          // Asking Clients about their experience to make the service better
                            JOptionPane.showOptionDialog(null,
                                    "Was this Helpful?",
                                    "Wait a Minute!!",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,
                                    null,
                                    0);
                            JOptionPane.showInputDialog(null,
                                    "How Was Your Experience using our System?\n" + "Your Response will be Help to provide us a Greater Service Next Time.",
                                    "Thank You!!",
                                    JOptionPane.INFORMATION_MESSAGE);     */
                            break;

                        // Checking whether the Person has a certain post to edit data of the system
                        // Add/ Remove feature is not available at the moment. It is still developing

            /*case 3:
                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for Add a Staff Member or 2 for Remove a Staff Member"));
                switch(i2){
                    case 1:
                        String ID=JOptionPane.showInputDialog("Enter Your ID");
                        switch (ID) {
                            case "PS/022":
                                String add1=JOptionPane.showInputDialog("Who do you want to add?");
                                int k=2;
                                        staffMemberNames.set(k,add1);
                                        k++;
                                        JOptionPane.showMessageDialog(null,staffMemberNames.get(0)+"\n"
                                                +staffMemberNames.get(1)+"\n"
                                                +staffMemberNames.get(2)+"\n"
                                                +staffMemberNames.get(3));
                            break;

                            default:
                                JOptionPane.showMessageDialog(null,
                                        "Unauthorized Access!!!",
                                        "Access Denied",
                                        JOptionPane.WARNING_MESSAGE);
                                break;
                    }
                    break;

                }
                break;*/
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid Input");
                            break;
                    }
                    break;

                case 4:
                    Member.main();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                    break;

            }

        }
    }

